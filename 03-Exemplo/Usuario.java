import java.time.LocalDate;
import java.time.Period;

public class Usuario {
    // Atributos privados e imutáveis (boa prática ao usar Builder)
    private final Long id;
    private final String nome;
    private final String sobrenome;
    private final String email;
    private final LocalDate idade; 
    private final String genero;

public static class Builder {
    private Long id;
    private String nome;
    private String sobrenome;
    private String email;
    private LocalDate idade;
    private String genero;

    // (Métodos fluentes id(), nome(), etc. continuam aqui...)

    public Usuario build() {
        // Validação 1: Campos Obrigatórios
        if (this.nome == null || this.nome.trim().isEmpty()) {
            throw new IllegalStateException("Erro de Validação: O nome é obrigatório.");
        }
        if (this.sobrenome == null || this.sobrenome.trim().isEmpty()) {
            throw new IllegalStateException("Erro de Validação: O sobrenome é obrigatório.");
        }

        // Validação 2: Formato do E-mail (Se preenchido)
        if (this.email != null && !this.email.contains("@")) {
            throw new IllegalArgumentException("Erro de Validação: O e-mail informado é inválido.");
        }

        // Validação 3: Maioridade (Se a idade for preenchida)
        if (this.idade != null) {
            int anos = Period.between(this.idade, LocalDate.now()).getYears();
            if (anos < 18) {
                throw new IllegalArgumentException("Erro de Validação: O usuário deve ser maior de 18 anos. Idade atual: " + anos);
            }
        }

        // Se passar por todas as regras, o objeto é criado com segurança
        return new Usuario(this);
    }
}

import java.time.LocalDate;

public class Usuario {
    // Atributos privados e imutáveis (boa prática ao usar Builder)
    private final Long id;
    private final String nome;
    private final String sobrenome;
    private final String email;
    private final LocalDate idade; // Alterado de Date para LocalDate
    private final String genero;

    // Construtor privado: obriga o uso do Builder
    private Usuario(Builder builder) {
        this.id = builder.id;
        this.nome = builder.nome;
        this.sobrenome = builder.sobrenome;
        this.email = builder.email;
        this.idade = builder.idade;
        this.genero = builder.genero;
    }

    // Getters (Setters não são necessários, pois o Builder garante a imutabilidade)
    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getSobrenome() { return sobrenome; }
    public String getEmail() { return email; }
    public LocalDate getIdade() { return idade; }
    public String getGenero() { return genero; }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ", idade=" + idade +
                ", genero='" + genero + '\'' +
                '}';
    }

    // Classe Builder Estática Interna
    public static class Builder {
        private Long id;
        private String nome;
        private String sobrenome;
        private String email;
        private LocalDate idade;
        private String genero;

        // Métodos "fluent" para definir os atributos
        public Builder id(Long id) {
            this.id = id;
            return this; // Retorna o próprio builder para permitir encadeamento
        }

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder sobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder idade(LocalDate idade) {
            this.idade = idade;
            return this;
        }

        public Builder genero(String genero) {
            this.genero = genero;
            return this;
        }

        // Método que finalmente constrói o objeto Usuario
        public Usuario build() {
            return new Usuario(this);
        }
    }
}

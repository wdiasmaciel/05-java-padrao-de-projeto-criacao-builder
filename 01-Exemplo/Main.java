import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando um usuário completo usando o Builder
        Usuario usuarioCompleto = new Usuario.Builder()
                .id(1L)
                .nome("Alex")
                .sobrenome("Silva")
                .email("alex.silva@email.com")
                .idade(LocalDate.of(1995, 5, 15))
                .genero("Masculino")
                .build();

        // Criando um usuário parcial (apenas com ID e Nome) para demonstrar a flexibilidade do padrão
        Usuario usuarioParcial = new Usuario.Builder()
                .id(2L)
                .nome("Maria")
                .build();

        // Exibindo os resultados no console
        System.out.println("--- Usuário 1 (Completo) ---");
        System.out.println(usuarioCompleto);

        System.out.println("\n--- Usuário 2 (Parcial) ---");
        System.out.println(usuarioParcial);
    }
}

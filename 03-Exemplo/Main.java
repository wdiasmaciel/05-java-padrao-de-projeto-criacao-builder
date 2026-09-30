import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        // Cenário 1: Tentando criar um usuário menor de idade
        try {
            System.out.println("Tentando criar usuário com 15 anos...");
            Usuario menorDeIdade = new Usuario.Builder()
                    .nome("Lucas")
                    .sobrenome("Mendes")
                    .idade(LocalDate.now().minusYears(15)) // 15 anos atrás
                    .build();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        System.out.println("\n-------------------------------------\n");

        // Cenário 2: Tentando criar um usuário sem o sobrenome (obrigatório)
        try {
            System.out.println("Tentando criar usuário sem sobrenome...");
            Usuario semSobrenome = new Usuario.Builder()
                    .nome("Roberto")
                    .build();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

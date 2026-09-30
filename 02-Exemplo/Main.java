public class Main {
    public static void main(String[] args) {
        UsuarioDirector director = new UsuarioDirector();
        
        // 1. Criando um Administrador através do Director
        Usuario.Builder adminBuilder = new Usuario.Builder();
        director.construirAdmin(adminBuilder);
        Usuario admin = adminBuilder.build(); // Opcional: você ainda pode encadear modificações aqui se quiser
        
        // 2. Criando um Convidado através do Director
        Usuario.Builder guestBuilder = new Usuario.Builder();
        director.construirConvidado(guestBuilder);
        Usuario guest = guestBuilder.build();

        System.out.println("--- Perfil Administrador ---");
        System.out.println(admin);

        System.out.println("\n--- Perfil Convidado ---");
        System.out.println(guest);
    }
}

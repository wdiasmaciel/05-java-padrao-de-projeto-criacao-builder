import java.time.LocalDate;

public class UsuarioDirector {

    // Constrói um perfil padrão de Administrador
    public void construirAdmin(Usuario.Builder builder) {
        builder.id(999L)
               .nome("Admin")
               .sobrenome("Sistema")
               .email("admin@empresa.com")
               .idade(LocalDate.of(2000, 1, 1))
               .genero("Não Informado");
    }

    // Constrói um perfil padrão de Convidado (Guest) com dados mínimos
    public void construirConvidado(Usuario.Builder builder) {
        builder.id(100L)
               .nome("Convidado")
               .sobrenome("Visitante");
    }
}

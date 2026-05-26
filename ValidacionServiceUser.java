public class ValidacionServiceUser {
    public void validacion(Usuario user, AutenticacionServiceUser auth) {
        if (auth.autenticar(user, user.getPassword())) {
            System.out.println("Validacion Lista OKEY.. WELCOME - " + user.getUser());
        } else {
            System.out.println("Credenciales incorrectas");
        }
    }
}
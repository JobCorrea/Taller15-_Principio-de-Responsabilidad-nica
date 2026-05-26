public class AutenticacionServiceUser {
    public boolean autenticar(Usuario user, String password){
        return user.getUser().equals("admin") && password.equals("123"); 
    }
}

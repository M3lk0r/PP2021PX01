package proxy;

public class LoginReal implements ILogin {

    private String usuario;
    private String senha;

    public LoginReal(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public void loginLiberado() {
        if (permissaoLogin()) {
            System.out.println("Login liberado.");
        } else {
            System.out.println("Login negado.");
        }
    }

    public boolean permissaoLogin() {
        if (usuario == "admin" && senha == "admin") {
            return true;
        } else {
            return false;
        }
    }
}

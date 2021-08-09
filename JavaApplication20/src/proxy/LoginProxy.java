package proxy;

public class LoginProxy implements ILogin {

    private String usuario;
    private String senha;
    private LoginReal loginReal;

    public LoginProxy(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public void loginLiberado() {
        if (loginReal == null) {
            loginReal = new LoginReal(usuario, senha);
        }

        loginReal.loginLiberado();
    }
}

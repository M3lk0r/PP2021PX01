package proxy;

public class Main {

    public static void main(String[] args) {
        ILogin login = new LoginProxy("admins", "admin");
        login.loginLiberado();
    }
}

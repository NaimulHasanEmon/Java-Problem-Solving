// Encapsulation
class Account {
    public String name;
    protected String email;
    private String password;

    // To access private properties, we can use getters & setters
    public void setPass(String a) {
        this.password = a;
    }

    public String getPass() {
        return this.password;
    }
}

public class Main {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.name = "Emon";
        ac.email = "emon@gmail.com";
        ac.setPass("abcd");
        ac.getPass();
        System.out.println(ac.name);
        System.out.println(ac.email);
        System.out.println(ac.getPass());
    }
}

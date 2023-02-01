package Bank;

class Account {
    public String name;
    protected String email;
    private String password;

    // To access private properties, we can use getters & setters
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class GettersAndSetters {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.name = "Emon";
        ac.email = "emon@gmail.com";
        ac.setPassword("abcd");
        System.out.println(ac.name);
        System.out.println(ac.email);
        System.out.println(ac.getPassword());
    }
}
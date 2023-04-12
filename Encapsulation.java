package Bank;

class Account {
	public String name;
	protected String email;
	private String password;

	// To access private properties, we can use getters & setters
	public void setPass() {
		this.password = "abcd";
	}

	public String getPass() {
		return this.password;
	}
}

public class Bank {
	public static void main(String[] args) {
		Account ac = new Account();
		ac.name = "Emon";
		ac.email = "emon@gmail.com";
		ac.setPass();
		ac.getPass();
		System.out.println(ac.getPass());
	}
}

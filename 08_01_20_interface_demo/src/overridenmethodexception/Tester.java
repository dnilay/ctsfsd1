package overridenmethodexception;

public class Tester {
	
	public static void main(String args[]) throws AccountNotCreatedException
	{
		Account account=new Account();
		account.createAccount("John", 4000);
		System.out.println(account);
	
	}

}

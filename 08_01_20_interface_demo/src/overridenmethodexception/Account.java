package overridenmethodexception;

import java.util.UUID;

public class Account {

	private String accountNumber;
	private String accountHoldername;
	private int accountAmount;
	private Account account=null;
	
	
	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getAccountHoldername() {
		return accountHoldername;
	}


	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}


	public int getAccountAmount() {
		return accountAmount;
	}


	public void setAccountAmount(int accountAmount) {
		this.accountAmount = accountAmount;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	public Account(String accountNumber,String accountHoldername, int accountAmount)throws AccountNotCreatedException
	{
		super();
	
		this.accountHoldername = accountHoldername;
		this.accountAmount = accountAmount;
		this.accountNumber=accountNumber;
		
	}


	public Account createAccount(String accountHoldername, int accountAmount)throws AccountNotCreatedException {
		
		
		account=new Account(UUID.randomUUID().toString(),accountHoldername
				,accountAmount);
		if(account.getAccountAmount()<5000)
		{
			throw new AccountNotCreatedException("Accoumnt Can't be created initial deposit is minumum 5000");
		}
		return account;
		
	}


	public Account() {
		super();
	}


	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHoldername=" + accountHoldername
				+ ", accountAmount=" + accountAmount + ", account=" + account + "]";
	}
	
}

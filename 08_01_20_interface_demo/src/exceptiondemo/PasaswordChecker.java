package exceptiondemo;

public class PasaswordChecker {
	
	public void checkpassword(String str) throws InvalidPasswordException
	{

        char currChar;
        char arr[]=new char[26];
        for (int i = 0; i < str.length(); i++) {
            currChar = str.charAt(i);
            System.out.println(currChar);
            
           for(int j=0;i<26;i++) {
        	   
        	   }
          System.out.println(arr);
            
        }
        System.out.println("login sucessfull");

	}
	
	public static void main(String args[])
	{
		PasaswordChecker chk=new PasaswordChecker();
		try {
			chk.checkpassword("Hello");
		} catch (InvalidPasswordException e) {
			
			e.printStackTrace();
		}
	}

}

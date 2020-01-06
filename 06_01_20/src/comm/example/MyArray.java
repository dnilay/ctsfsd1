package comm.example;

public class MyArray {
	private char[] s;
	private String str;
	private char[] tempArray;
	
	{
		s=new char[26];
	}
	
	public char[] createArray()
	{
		for(int i=0;i<s.length;i++)
		{
			s[i]=(char)('A'+i);
		}
		String str="Hello World";
		return s;
	}
	
	public void displayArray()
	{
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+",");
		}
	}
	
	public void convertStringToArray(String str)
	{
		this.str=str;
		tempArray=str.toCharArray();//converts string to char array
		
		
	}
	public void displayConvertedArray()
	{
		//enhanched for loop
		for(char ch:tempArray)
		{
			System.out.println(ch);
		}
	}

}














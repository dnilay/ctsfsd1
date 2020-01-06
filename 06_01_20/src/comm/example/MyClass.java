package comm.example;

public class MyClass {
	//variable arguments
	//overloaded method
	public long add(int... a) {
		int result=0;
		for(int i:a)
		{
			result+=i;
		}
		return result;
	}
	//overoaded method
	public String add(String str,int a,int b) {
		return str+(a+b);
	}

}

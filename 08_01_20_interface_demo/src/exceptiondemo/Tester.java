package exceptiondemo;

public class Tester {
	
	
	public void calculate(String a) throws ArithmeticException,NumberFormatException
	{
		System.out.println();
		System.out.println(Integer.parseInt(a)/0);
	}

	public static void main(String[] args) {
		/*
		 * try { System.out.println(args[9]); System.out.println(30/0); } catch
		 * (ArrayIndexOutOfBoundsException e) {
		 * System.out.println("within ArrayIndexOutOfBoundsException");
		 * System.out.println(e.toString()); } catch (ArithmeticException e) {
		 * System.out.println("within ArithmeticException"); }
		 * 
		 * catch(Exception e) { System.out.println(e.toString()); }
		 * 
		 */
		Tester tester=new Tester();
		try {
			tester.calculate(args[0]);	
		} catch (Exception e) {
			System.err.println(e.toString());
			e.printStackTrace();
		}
		

	}

}

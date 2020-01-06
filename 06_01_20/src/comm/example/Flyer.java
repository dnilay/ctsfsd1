package comm.example;

public class Flyer {
	private boolean canFly;

	
	public Flyer() {
		super();
	}

	public Flyer(boolean canFly) {
		
		this.canFly = canFly;
	}

	public void takeOff()
	{
		System.out.println("Flyer Take off");
	}

	public void fly()
	{
		System.out.println("flyer fly");
	}
	public void land()
	{
		System.out.println("flyer land.");
	}
	
}

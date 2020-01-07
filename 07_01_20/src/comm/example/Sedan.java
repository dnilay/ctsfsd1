package comm.example;

public class Sedan extends Car{

	private boolean isAcEnabled;
	@Override
	public void acclerateCar() {
		System.out.println("Sedan is moving..");
		
	}

	@Override
	public void breakCar() {
		System.out.println("sedan is slowing down..");
		
	}

	public Sedan(String carModel,String carColor,double carPrice,boolean isAcEnabled) {
		setCarColor(carColor);
		setCarPrice(carPrice);
		setModel(carModel);
		this.isAcEnabled = isAcEnabled;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" Ac Available? "+isAcEnabled;
	}
	
	
	
	

}

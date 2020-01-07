package comm.example;

public abstract class Car {
	
	private double carPrice;
	private String carColor;
	private String model;
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		
		return "Car Model: "+getModel()+" Car Price: "+getCarPrice()+" Car Color: "+getCarColor();
	}

	
	public abstract void acclerateCar();
	public abstract void breakCar();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

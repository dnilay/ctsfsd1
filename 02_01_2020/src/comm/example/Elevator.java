package comm.example;
import static java.lang.System.out;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Elevator {
	 // Doors are closed by default
	private boolean doorOpen ;
	// All elevators start on first floor
	private int currentFloor; 
	private static final int MAX_FLOORS = 10;
	private static final int MIN_FLOORS = 1;

	{
		doorOpen=false;
		currentFloor=1;
	}
	
	
	public void openDoor() {
		System.out.println("Opening door.");
		doorOpen = true;
		out.println("Door is open.");
	}

	public void closeDoor() {
		out.println("Closing door.");
		doorOpen = false;
		out.println("Door is closed.");
	}

	public void goUp() {
		if (currentFloor < MAX_FLOORS && doorOpen == false) {
			out.println("Going up one floor.");
			currentFloor++;
			out.println("Floor: “ + currentFloor");
		} else {
			out.println("you are already on top floor. Can't go up");
		}

	}

	public void goDown() {
		if (currentFloor > MIN_FLOORS && doorOpen == false) {
			out.println("Going down one floor.");
			currentFloor--;
			out.println("Floor: “ + currentFloor");
		} else {
			out.println("you are already on base, can't go down");
		}
	}

	public int getFloor() {
		return currentFloor;
	}

	public boolean checkDoorStatus() {
		return doorOpen;
	}
}
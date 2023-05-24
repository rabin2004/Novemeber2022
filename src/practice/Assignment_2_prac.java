package practice;

public class Assignment_2_prac {

	public static void main(String[] args) {
		// Thermostat app -> desiredTemp | currentRoomTemp
		
		int desiredTemp, currentRoomTemp;

		desiredTemp = 70;
		currentRoomTemp = 50;
		
		if(desiredTemp==currentRoomTemp) {
			System.out.println("Do nothing. Maintain temperature.");
		}else if(desiredTemp>currentRoomTemp) {
			System.out.println("Turn on Heater.");
		}else if(desiredTemp<currentRoomTemp) {
			System.out.println("Turn on AC.");
		}else {
			System.err.println("Invalid input. Try again!");
		}
	}

}

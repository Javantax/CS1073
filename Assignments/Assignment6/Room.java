/**
This class represents a room in Hotel R Us
@author Daniyal Khan 3765942
*/

public class Room {
	private String name;
	private int numNights;
	private int numGuests;
	private int numBeds;
	
	public Room(String name, int numNights, int numGuests, int numBeds) {
		this.name = name;
		this.numNights = numNights;
		this.numGuests = numGuests;
		this.numBeds = numBeds;
	}
	
	public String name() {
		return name;
	}
	
	public int numNights() {
		return numNights;
	}
	
	public int numGuests() {
		return numGuests;
	}
	
	public int numBeds() {
		return numBeds;
	}
}

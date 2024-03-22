import java.util.Random;
/**
This class represents a Suite in Hotel R Us
@author Daniyal Khan 3765942
*/

public class Suite extends Room {
	private final double BASE_RATE;

	public Suite(String name, int numNights, int numGuests, int numBeds) {
		super(name, numNights, numGuests, numBeds);
		BASE_RATE = 380;
	}
	
	public double getRate() {
		double total = 0;
		int numExtraBed = super.numBeds() - 2;
		double additionalBedCharge = 2;
		if (super.numBeds() > 2) {
			total+= BASE_RATE + super.numNights()*(additionalBedCharge*numExtraBed);
		} else {
			total = BASE_RATE;
		}
		return total;
	}
	
	public String randPerk() {
	// champagne, chocolates, fruit basket
		String perk = "";
		Random rand = new Random();
		int random = rand.nextInt(3)+1;
		switch (random) {
			case 1:
				perk = "Champagne";
			case 2:
				perk = "Chocolates";
			case 3:
				perk = "Fruit basket";
		}
		return perk;
	}
	
	public String checkOutTime() {
		return "12 noon";
	}
}

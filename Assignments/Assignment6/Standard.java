import java.util.Random;
/**
This class represents a Suite in Hotel R Us
@author Daniyal Khan 3765942
*/

public class Standard extends Room {
	private final double BASE_RATE;

	public Standard(String name, int numNights, int numGuests, int numBeds) {
		super(name, numNights, numGuests, numBeds);
		BASE_RATE = 225;
	}
	
	public double getRate() {
		double total = 0;
		int numExtraBed = super.numBeds() - 2;
		double additionalBedCharge = 20;
		double breakFastCharge = 9.75;
		if (super.numBeds() > 2) {
			total+= BASE_RATE + super.numNights()*(additionalBedCharge*numExtraBed + 					super.numNights()*breakFastCharge);
		} else {
			total = BASE_RATE + super.numNights()*breakFastCharge;
		}
		return total;
	}
	
	public String checkOutTime() {
	// champagne, chocolates, fruit basket
		String perk = "";
		Random rand = new Random();
		int random = rand.nextInt(3) + 1;
		switch (random) {
			case 1:
				perk = "11am";
			case 2:
				perk = "10am";
		}
		return perk;
	}
}

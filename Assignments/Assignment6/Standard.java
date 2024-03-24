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
		double additionalBedCharge = 20.00;
		double breakFastCharge = 9.75;
		total = super.numNights()*BASE_RATE + super.numNights()*(breakFastCharge*super.numGuests());
		if (numExtraBed >= 1) {
			total += super.numNights()*(additionalBedCharge*numExtraBed);
		}
		return total;
	}
	
	public String checkOutTime() {
	// champagne, chocolates, fruit basket
		String perk = "";
		Random rand = new Random();
		int random = rand.nextInt(2) + 1;
		switch (random) {
			case 1:
				perk = "11am";
				break;
			case 2:
				perk = "10am";
				break;
		}
		return perk;
	}
}

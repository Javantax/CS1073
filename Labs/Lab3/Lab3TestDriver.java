/**
This class is a test driver for lab3 of CS1073
@author Daniyal Khan 3765942
*/

public class Lab3TestDriver {
	
	public static void main(String[] args) {
		TentSite site7 = new TentSite("Coyote Field", 7, 86.75);
		Camper camper1 = new Camper("Monika Schulz", 550.00, 58.30, 250.00, site7);
		
		TentSite site14 = new TentSite("Eagle Field", 14, 108.50);
		Camper camper2 = new Camper("Miguel Florez", 425.00, 75.85, 0, site14);
		
		TentSite site25 = new TentSite("Salmon Field", 25, 97.50);
		Camper camper3 = new Camper("Katharine Doucet", 375.50, 46.60, 175.00, site25);
		
		camper1.setActivityFee(105.45);
		
		TentSite site42 = new TentSite("Raven Field", 42, 97.65);
		camper2.setSite(site42);
		
		camper3.setCampFee(475.00);
		
		System.out.println(camper1.getCamperDetails());
		System.out.println();
		System.out.println(camper2.getCamperDetails());
		System.out.println();
		System.out.println(camper3.getCamperDetails());
		System.out.println();
		
		System.out.println("Amount owed by Monika Schulz: " + camper1.getTotalFeesOwing());
		System.out.println("Amount owed by Miguel Florez: " +camper2.getTotalFeesOwing());
		System.out.println("Amount owed by Katharine Doucet: " +camper3.getTotalFeesOwing());
	}	
}

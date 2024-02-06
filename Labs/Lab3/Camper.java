/**
This class represents a camper
@author Daniyal Khan 3765942
*/

public class Camper {
	/**
	The name of the camper.
	*/
	private String name;
	
	/**
	The amount that the camper will pay per week for the camp
	*/
	private double campFee;
	
	/**
	The amount that the camper will pay per week for the activities
	*/
	private double activityFee;
	
	/**
	The amount of bursary money awarded to this camper for the week of camp
	*/
	private double bursaryAmount;
	
	/**
	The tent site at the camp where the camper is currently camping
	*/
	private TentSite site;
	
	/**
	Contructs a Camper object given the name, camp fees, activity fees, bursary amount and Tent Site
	@param name name of the camper
	@param campFee price per week for the camp
	@param activityFee price per week for the activities
	@param bursaryAmount bursary money awarded to the camper
	@param site tent site at the camp where the camper is staying
	*/
	public Camper(String name, double campFee, double activityFee, double bursaryAmount, TentSite site) {
		this.name = name;
		this.campFee = campFee;
		this.activityFee = activityFee;
		this.bursaryAmount = bursaryAmount;
		this.site = site;
	}
	
	/**
	Changes the name
	@param name name for the camper
	*/
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	Changes the camp fees
	@param campFee price per week for the camp
	*/
	public void setCampFee(double campFee) {
		this.campFee = campFee;
	}
	
	/**
	Changes the activity fees
	@param activityFee price per week for the activities
	*/
	public void setActivityFee(double activityFee) {
		this.activityFee = activityFee;
	}
	
	/**
	Changes the bursary amount
	@param bursaryAmount bursary that will be granted to the camper
	*/
	public void setBursaryFee(double bursaryAmount) {
		this.bursaryAmount = bursaryAmount;
	}
	
	/**
	Changes the tent site
	@param site the tentsite the camper will be staying at
	*/
	public void setSite(TentSite site) {
		this.site = site;
	}
	
	/**
	Returns the total fees the customer owes
	@return totalFeesOwed the amount of fees the customer owes
	*/
	public double getTotalFeesOwing() {
		double totalFeesOwed = (campFee + activityFee + site.getCostPerWeek()) - bursaryAmount;
		return totalFeesOwed;
	}
	
	/**
	Returns the details of the camper
	@return camperDetails the details about the camper
	*/
	public String getCamperDetails() {
		String camperDetails = name + "\n" + site.getFieldName() + ", " + site.getSiteNum();
		return camperDetails;
	}
}


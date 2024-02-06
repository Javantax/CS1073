/** 
This class represents a Tent Site
@author Daniyal Khan 3765942
*/

public class TentSite {

	/** 
	Name of the field.
	*/
	private String fieldName;
	
	/**
	Site Number
	*/
	private int siteNum;
	
	/**
	Cost per week of the site
	*/
	private double costPerWeek;
	
	/** 
	Constructs a Tent Site given the field name, site number and cost per week.
	@param fieldName name of the field
	@param siteNum Number of the site
	@param costPerWeek Cost per week of the camp site
	*/
	public TentSite (String fieldName, int siteNum, double costPerWeek) {
		this.fieldName = fieldName;
		this.siteNum = siteNum;
		this.costPerWeek = costPerWeek;
	}
	
	/**
	Returns the field name.
	@return fieldName the field name.
	*/
	public String getFieldName() {
		return fieldName;
	}
	
	/**
	Returns the siteNumber
	@return siteNum the site number.
	*/
	public int getSiteNum() {
		return siteNum;
	}
	
	/**
	Returns the cost per week of the site.
	@return costPerWeek the cost per week of the site
	*/
	public double getCostPerWeek() {
		return costPerWeek;
	}
}

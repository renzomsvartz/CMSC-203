package Project_4_Renzo_Svartz;

public class Property 
{
	private String city;
	private String owner;
	private String propertyName;
	private double rentAmount;
	private Plot plot;
	
	public Property()
	{
		city = "";
		owner = "";
		propertyName = "";
		rentAmount = 0;
		plot = new Plot(0, 0, 1, 1);
	}
	
	public Property(Property o2)
	{
		this.city = new String(o2.city);
		this.owner = new String(o2.owner);
		this.propertyName = new String(o2.propertyName);
		this.rentAmount = o2.rentAmount;
		this.plot = new Plot(o2.plot);
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner)
	{
		this.city = new String(city);
		this.owner = new String(owner);
		this.propertyName = new String(propertyName);
		this.rentAmount = rentAmount;
		plot = new Plot();
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth)
	{
		this.city = new String(city);
		this.owner = new String(owner);
		this.propertyName = new String(propertyName);
		this.rentAmount = rentAmount;
		plot = new Plot(x, y, width, depth);
	}
	
	public String getCity()
	{
		return city;
	}
	
	public String getOwner()
	{
		return owner;
	}
	
	public String getPropertyName()
	{
		return propertyName;
	}
	
	public double getRentAmount()
	{
		return rentAmount;
	}
	
	public Plot getPlot()
	{
		return plot;
	}
	
	public Plot setPlot(int x, int y, int width, int depth)
	{
		return new Plot(x, y, width, depth);
	}
	
	public void setCity(String city)
	{
		this.city = new String(city);
	}
	
	public void setOwner(String owner)
	{
		this.owner = new String(owner);
	}
	
	public void setPropertyName(String propertyName)
	{
		this.propertyName = new String(propertyName);
	}
	
	public void setRentAmount(double rentAmount)
	{
		this.rentAmount = rentAmount;
	}
	
	public String toString()
	{
		return String.format("Property Name: %s\nLocated in %s\nBelonging to: %s\nRent Amount: %.2f \n", propertyName, city, owner, rentAmount);
	}
}

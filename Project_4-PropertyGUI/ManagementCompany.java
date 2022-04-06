package Project_4_Renzo_Svartz;

import java.util.ArrayList;

public class ManagementCompany
{
	private final int MAX_PROPERTY = 5;
	private double mgmFeePer;
	private String name;
	private ArrayList<Property> properties;
	private String taxID;
	private int MGMT_WIDTH = 10;
	private int MGMT_DEPTH = 10;
	private Plot plot;
	
	public ManagementCompany()
	{
		name = "";
		taxID = "";
		plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		properties = new ArrayList<Property>();
	}
	
	public ManagementCompany(String name, String taxID, double mgmFee)
	{
		this.name = new String(name);
		this.taxID = new String(taxID);
		mgmFeePer = mgmFee / 100;
		plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		properties = new ArrayList<Property>();
	}
	
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth)
	{
		this.name = new String(name);
		this.taxID = new String(taxID);
		mgmFeePer = mgmFee;
		plot = new Plot(x, y, width, depth);
		properties = new ArrayList<Property>();
	}
	
	public ManagementCompany(ManagementCompany o2)
	{
		this.name = new String(o2.name);
		this.taxID = new String(o2.taxID);
		mgmFeePer = o2.mgmFeePer;
		plot = new Plot(o2.plot);
		properties = new ArrayList<Property>();
	}
	
	public int addProperty(Property property)
	{
		boolean contains = false;
		if (plot.encompasses(property.getPlot()))
		{
			contains = true;
		}
		
		boolean overlap = false;
		for (int i = 0; i < properties.size(); i++)
		{
			if (properties.get(i).getPlot().overlaps(property.getPlot()))
			{
				overlap = true;
			}
		}
		
		if (properties.size() == MAX_PROPERTY)
		{
			return -1;
		}
		else if (properties == null)
		{
			return -2;
		}
		else if (!contains)
		{
			return -3;
		}
		else if (overlap)
		{
			return -4;
		}
		else
		{
			properties.add(new Property(property));
			return properties.size() - 1;
		}
	}
	
	public int addProperty(String name, String city, double rent, String owner)
	{
		Property property = new Property(name, city, rent, owner);
		
		boolean contains = false;
		if (plot.encompasses(property.getPlot()))
		{
			contains = true;
		}
		
		boolean overlap = false;
		for (int i = 0; i < properties.size(); i++)
		{
			if (properties.get(i).getPlot().overlaps(property.getPlot()))
			{
				overlap = true;
			}
		}
		
		if (properties.size() == 5)
		{
			return -1;
		}
		else if (properties == null)
		{
			return -2;
		}
		else if (!contains)
		{
			return -3;
		}
		else if (overlap)
		{
			return -4;
		}
		else
		{
			properties.add(new Property(property));
			return properties.size() - 1;
		}
	}
	
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth)
	{
		Property property = new Property(name, city, rent, owner, x, y, width, depth);
		
		boolean contains = false;
		if (plot.encompasses(property.getPlot()))
		{
			contains = true;
		}
		
		boolean overlap = false;
		for (int i = 0; i < properties.size(); i++)
		{
			if (properties.get(i).getPlot().overlaps(property.getPlot()))
			{
				overlap = true;
			}
		}
		
		if (properties.size() == 5)
		{
			return -1;
		}
		else if (properties == null)
		{
			return -2;
		}
		else if (!contains)
		{
			return -3;
		}
		else if (overlap)
		{
			return -4;
		}
		else
		{
			properties.add(new Property(property));
			return properties.size() - 1;
		}
	}
	
	public double totalRent()
	{
		double sum = 0;
		
		for (int i = 0; i < properties.size(); i++)
		{
			sum += properties.get(i).getRentAmount();
		}
		
		return sum;
	}
	
	public double maxRentProp()
	{
		double max = 0;
		
		for (int i = 0; i < properties.size(); i++)
		{
			if (properties.get(i).getRentAmount() >= max)
			{
				max = properties.get(i).getRentAmount();
			}
		}
		
		return max;
	}
	
	public double maxRentPropertyIndex()
	{
		double max = 0;
		double index = 0;
		
		for (int i = 0; i < properties.size(); i++)
		{
			if (properties.get(i).getRentAmount() >= max)
			{
				max = properties.get(i).getRentAmount();
				index = i;
			}
		}
		
		return index;
	}
	
	private String displayPropertyAtIndex(int i)
	{
		return properties.get(i).toString();
	}
	
	public String toString()
	{	
		String allInfo = String.format("List of the properties for %s, taxID: %s\n", name, taxID);
		
		for (int i = 0; i < properties.size(); i++)
		{
			allInfo = allInfo.concat(properties.get(i).toString());
		}
		
		return allInfo.concat(String.format("Total management fee: %.2f", totalRent() * mgmFeePer));
	}
	
	public String getName()
	{
		return name;
	}
	
	public Plot getPlot()
	{
		return plot;
	}
	
	public int getMAX_PROPERTY()
	{
		return MAX_PROPERTY;
	}
}

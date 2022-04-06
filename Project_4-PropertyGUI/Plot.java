package Project_4_Renzo_Svartz;

public class Plot 
{
	private int x;
	private int y;
	private int width;
	private int depth;
	
	public Plot()
	{
		x = 0;
		y = 0;
		width = 1;
		depth = 1;
	}
	
	public Plot(Plot o2)
	{
		this.x = o2.x;
		this.y = o2.y;
		this.width = o2.width;
		this.depth = o2.depth;
	}
	
	public Plot(int x, int y, int width, int depth)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	public boolean overlaps(Plot o2)
	{
		boolean status = false;
		
		if ((o2.x > x && o2.x < x + width) && (o2.y > y && o2.y < y + depth))
			status = true;
		else if ((o2.x > x && o2.x < x + width) && (o2.y + o2.depth > y && o2.y + o2.depth < y + depth))
			status = true;
		else if ((o2.x + o2.width > x && o2.x < x + width) && (o2.y + o2.depth > y && o2.y + o2.depth < y + depth))
			status = true;
		else if ((o2.x + o2.width > x && o2.x < x + width) && (o2.y > y && o2.y < y + depth))
			status = true;
		else if ((o2.x <= x && o2.x + o2.width >= x + width) && ((o2.y >= y && o2.y < y + depth) || (o2.y + o2.depth > y && o2.y + o2.depth <= y + depth)))
			status = true;
		else if ((o2.y <= y && o2.y + o2.depth >= y + depth) && ((o2.x + o2.width > x && o2.x + o2.width <= x + width) || (o2.x >= x && o2.x < x + width)))
			status = true;
		else if ((x <= o2.x && x + width >= o2.x + o2.width) && (o2.y <= y && o2.y + o2.depth >= y + depth))
			status = true;
		else if ((o2.x <= x && o2.x + o2.width >= x + width) && (y <= o2.y && y + depth >= o2.y + o2.depth))
			status = true;
		
		return status;
	}
	
	public boolean encompasses(Plot o2)
	{
		boolean status = false;
		
		if (x <= o2.x && x + width >= o2.x + o2.width && y <= o2.y && y + depth >= o2.y + o2.depth)
			status = true;
		
		return status;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public int getX()
	{
		return x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public void setDepth(int depth)
	{
		this.depth = depth;
	}
	
	public int getDepth()
	{
		return depth;
	}
	
	public String toString()
	{
		return String.format("Upper left: (%d,%d); Width: %d Depth: %d\n", x, y, width, depth);
	}
}

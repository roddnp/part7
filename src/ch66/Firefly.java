package ch66;

public class Firefly 
{
	private int x;
	private int y;
	private int z;
	private boolean alive = true;
	
	private Firefly(int x, int y, int z)
	{
		this.x = (int) (Math.random() * 20 -10);
		this.y = (int) (Math.random() * 20 -10);
		this.z= (int) (Math.random() * 20 -10);
	}
	

	
	public move()
	{
		return new Firefly(1*Firefly.x(),1*Firefly.y(),1*Firefly.z());
	}
	
}

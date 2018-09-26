
public class TalleyCounter 
{
	// Instance Variables
	
	private int count;
	
	// Constructor
	
	public TalleyCounter()
	{
		count = 0;
	}
	
	public TalleyCounter(int startNum)
	{
		count = startNum;
	}

	public void click()
	{
		count = count++;
		//count = count + 1;
		//count += 1;
	}
	
	public void unclick()
	{
		count = count - 1;
	}
	
	public void reset()
	{
		count = 0;
	}
	
	public int getCount()
	{
		return count;
	}
}

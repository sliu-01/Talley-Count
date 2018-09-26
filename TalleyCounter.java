
public class TalleyCounter 
{

	private int count;
	
	public TalleyCount()
	{
		count = 0;
	}
	public void click()
	{
		count = count + 1;
		//count = count++
		//count += 1
		
	}
	
	public void initialValue(startingNum)
	{
	
		count = startingNum;
	
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

package clock;

public class Display  {
	private int value;
	private int limit;
	
	Display(int a)
	{
		this.limit = a ;
	}
	
	public int getValue(int a)
	{
		this.value = a;
		return a;
	}
	
	public void getLimit( int b )
	{
		this.limit= b;
	}
	
//	public void increase()
//	{
//		value++;
//	}
	
	public boolean isIncrease()
	{
		value++;
		if( value == limit )
		{
			value = 0;
			return true;
		}
		return false;
	}
	public int show()
	{
//		System.out.println(value);
		return value;
	}

	public static void main(String[] args) 
	{
		Display min = new Display(24);
		for(;;)
		{
			min.isIncrease();
			min.show();
		}
	}

}

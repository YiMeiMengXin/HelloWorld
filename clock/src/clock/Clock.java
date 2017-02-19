package clock;

import java.util.Timer;
import java.util.TimerTask;

public class Clock {
	private Display sec = new Display(60);
	private Display hour = new Display(24);
	private Display min = new Display(60);
	
	Clock( int a , int b ,int c)
	{
		this.hour.getValue(a);
		this.min.getValue(b);
		this.sec.getValue(c);
	}

	public void tick() 
	{
		Timer a = new Timer();
		a.schedule(new step(), 1000,1000);
	}
	
	class step extends TimerTask
	{
		public void run()
		{
			if( sec.isIncrease() )
			{
				if ( min.isIncrease() )
				{
					hour.isIncrease();
				}
			}
			System.out.printf("%02d:%02d:%02d\n", hour.show(),min.show(),sec.show() );
		} 
	}
	
	public void start()
	{
//		while(true)
//		{
			if( sec.isIncrease() )
			{
				if ( min.isIncrease() )
				{
					hour.isIncrease();
				}
			}
			System.out.printf("%02d:%02d:%02d\n", hour.show(),min.show(),sec.show() );
//		}
	}
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
		System.out.println("please show me your plan : 1 for next , 2 for continue.");
		int plan = in.nextInt();
		if(plan==1)
		{
			clock.start();
		}
		if(plan == 2)
		{
			clock.tick();
		}
		in.close();
	}

}

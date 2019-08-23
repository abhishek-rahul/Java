package threads;
class ThreadExample extends Thread{  
	public int count = 0; 
public void run(){  
System.out.println("thread is running...");
	try
	{
		while(count < 5)
		{
			Thread.sleep(1500);
			count++; 
		}
	} catch(InterruptedException exc)
	{
		System.out.println("thread interrupted");
	}
	System.out.println("thread terminated");
   }
}
public class ThreadClassExample {

	public static void main(String[] args) {
		ThreadExample instance  = new ThreadExample();
		instance.start();
		if(instance.isAlive())
			System.out.println("thread is alive");
		System.out.println(instance.getName());

	}

}

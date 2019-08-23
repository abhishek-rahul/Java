package threads;

class RunnableThread implements Runnable{  
	public int count = 0; 
public void run(){  
System.out.println("thread is running...");
	try
	{
		while(count < 5)
		{
			Thread.sleep(500);
			count++;
		}
	} catch(InterruptedException exc)
	{
		System.out.println("thread interrupted");
	}
	System.out.println("thread terminated");
   }
}
public class RunnableThreadExample{
public static void main(String args[]){  
	RunnableThread instance = new RunnableThread();  
    Thread t1 =new Thread(instance);  
    t1.start();  
    if(t1.isAlive())//used t1 object which is an object of Thread class ,if instead when i used  
    	            //instance object to do instance.isAlive() code have thrown an error
     	System.out.println("thread is alive");
 }  
}

/*
 * class Hi  extends Thread
{
   public void run()
	{
        for(int i=1;i<=5;i++)
        {
    	  System.out.println("Hi");
    	 try { Thread.sleep(1000);} catch (Exception e) {} //use sleep to print anything after few secs
        }
	}
}
class Hello extends Thread
{
	 public void run()
		{
	        for(int i=1;i<=5;i++)
	        {
	    	  System.out.println("Hello");
	    	  try { Thread.sleep(1000);} catch (Exception e) {}
	        }
		}
}



public class ThreadDemo 
{

	public static void main(String[] args) 
	{
	   
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		
		obj1.start();
		 try { Thread.sleep(10);} catch (Exception e) {}
		obj2.start();

	}

}
*/

/*
class Hi  implements Runnable
{
   public void run()
	{
        for(int i=1;i<=5;i++)
        {
    	  System.out.println("Hi");
    	 try { Thread.sleep(1000);} catch (Exception e) {} //use sleep to print anything after few secs
        }
	}
}
class Hello implements Runnable
{
	 public void run()
		{
	        for(int i=1;i<=5;i++)
	        {
	    	  System.out.println("Hello");
	    	  try { Thread.sleep(1000);} catch (Exception e) {}
	        }
		}
}



public class ThreadDemo 
{

	public static void main(String[] args) 
	{
	   
		Runnable obj1 = new Hi();
		Runnable obj2 = new Hello();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		 try { Thread.sleep(10);} catch (Exception e) {}
		t2.start();
	}
}
*/


/*
 class ThreadDemo 
{
	public static void main(String[] args) 
	{
		
		Thread t1 = new Thread(()->
		{
	        for(int i=1;i<=5;i++)
	        {
	    	  System.out.println("Hi");
	    	 try { Thread.sleep(1000);} catch (Exception e) {} //use sleep to print anything after few secs
	        }
		});
		
		Thread t2 = new Thread(()->
			{
		        for(int i=1;i<=5;i++)
		        {
		    	  System.out.println("Hello");
		    	  try { Thread.sleep(1000);} catch (Exception e) {}
		        }
			});
		
		t1.start();
		try { Thread.sleep(10);} catch (Exception e) {}
		t2.start();
	}
}
*/



 class ThreadDemo 
{
	public static void main(String[] args) throws Exception
	{
		
		Thread t1 = new Thread(()->
		{
	        for(int i=1;i<=5;i++)
	        {
	    	  System.out.println("Hi");
	    	 try { Thread.sleep(1000);} catch (Exception e) {} //use sleep to print anything after few secs
	        }
		});
		
		Thread t2 = new Thread(()->
			{
		        for(int i=1;i<=5;i++)
		        {
		    	  System.out.println("Hello");
		    	  try { Thread.sleep(1000);} catch (Exception e) {}
		        }
			});
		
		t1.start();
		try { Thread.sleep(10);} catch (Exception e) {}
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());
		
		System.out.println("Bye");
	}
}


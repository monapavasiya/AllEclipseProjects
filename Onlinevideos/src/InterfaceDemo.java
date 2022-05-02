/*interface Writer          // cannot create obj of interface only can give reference
                          // achieve multiple inheritance
{
	void write();          //all methods of interface are by default abstract 
                            // implements in interface, extends in abstract  	
}
                                           //Types of interface
                                            *1.normal interface (more than one interface method)
                                            *2.single abstract method (only one method) functional interface in java 8
                                            *3.marker interface( no method at all)
class Pen implements Writer
{
  public void write()
  {
	  System.out.println("im a pen");
  }
}

class Pencil implements Writer
{
  public void write()
  {
	  System.out.println("im a pencil");
  }
} 

class Kit
{
  public void doSomething(Writer p)
  {
	  p.write();
  }
}






public class InterfaceDemo
{

	public static void main(String[] args)
	{
		Kit k = new Kit();
		Writer p = new Pen();
		
		Writer pc = new Pencil();
		
		k.doSomething(pc);

	}

}
*/


/*

interface Abc
{
   void show();
}

class Implimentor implements Abc
{
	public void show()
	{
		System.out.println("anything");
	}
}

public class InterfaceDemo
{
    public static void main(String[]args)
    {
    	Abc obj = new Implimentor();
    	obj.show();
    }
}
*/


interface Abc
{
   void show();
}                                                    //lamda expression of functional interface


public class InterfaceDemo
{
    public static void main(String[]args)
    {
    	Abc obj = () -> System.out.println("im the best");
    	
    	obj.show();
    }
}


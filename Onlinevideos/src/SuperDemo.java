
class Ca
{
  public Ca()
  {
	  System.out.println("in A");
  }
  public Ca(int i)
  {
	  System.out.println("in A int");
  }
}

class da extends Ca
{
  public da()
  {
	  super();
	  System.out.println("in B");
  }
  public da(int i)
  {
	  super(i);
	  System.out.println("in B int");
  }
}



public class SuperDemo 
{

	public static void main(String[] args)
			
	{
		
	   da obj = new da(5);

	}

}

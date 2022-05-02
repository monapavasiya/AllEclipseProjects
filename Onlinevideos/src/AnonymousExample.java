
class D
{
    public void show()
 {
	 System.out.println("in A show");
 }
}


public class AnonymousExample
{

	public static void main(String[] args) 
	{
		 D obj = new D()
				 {
		              public void show()
			         {
				      System.out.println("im the best");
			         }
				 };
		 obj.show();
	}

}
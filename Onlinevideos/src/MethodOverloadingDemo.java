
class casio
{
	public void add(int i, int j)
	{
		System.out.println(i+j);
    }
	public void add(int i, int j, int k)
	{
		System.out.println(i+j+k);
    }
	public void add(double i,double j)
	{
		System.out.println(i+j);
    }
  
  
  
}


public class MethodOverloadingDemo {

	public static void main(String[] args)
	{
		casio obj = new casio();
		obj.add(5,2);
		
		obj.add(4,3,5);
		
		obj.add(4.5,3.8 );
	}

}
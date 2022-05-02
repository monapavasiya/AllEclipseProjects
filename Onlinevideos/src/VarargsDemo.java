
class calculation
{
	public int add(int ... n)  //(5,6,58,6,5947,562,564)   //variable length arguments
	{
		int sum = 0;
	   for(int i:n)
	   {
		   sum = sum + i;
	   }
	   return sum;
	}

}
public class VarargsDemo
{

	public static void main(String[] args)
	{
		calculation obj = new calculation();
		System.out.println(obj.add(5,6,58,6,5947,562,564));
	}

}

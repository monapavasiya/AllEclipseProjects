import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
public class CollectionDemo 
{

	public static void main(String[] args) 
	{
		Collection values = new ArrayList();
		values.add(4);
		values.add(6);
		values.add(9);
		
	   Iterator it = values.iterator();
	   
	   while(it.hasNext())
	   {
		   System.out.println(it.next());
	   }
		

	}

}
*/

/*
public class CollectionDemo 
{

	public static void main(String[] args) 
	{
		List<Integer> values = new ArrayList<>();
		values.add(4);
		values.add(6);
		values.add(9);
		values.add(2);
		
	  for(Integer o : values)
	  {
		  System.out.println(o);
	  }
		

	}

}
*/


/*
public class CollectionDemo 
{

	public static void main(String[] args) 
	{
		List<Integer> values = new ArrayList<>();
		values.add(4);
		values.add(6);
		values.add(9);
		values.add(2);
		
		Collections.sort(values);     //to print value in ascending  order using first digit
		Collections.reverse(values);  //for decending order
		
		  for(Integer o : values)
		  {
			  System.out.println(o);
		  }
			
	}

}
*/

/*
public class CollectionDemo 
{

	public static void main(String[] args) 
	{
		List<Integer> values = new ArrayList<>();
		values.add(404);
		values.add(639);
		values.add(908);
		values.add(265);

		Comparator<Integer> c = new Comparator<Integer>()
				{
			      public int compare(Integer i, Integer j)
			      {
			    	  if(i%10>j%10)
			    		  return 1;
			    	  else                //instead of if else we can use return i%10>j%10?1:-1
			    		  return -1;
			      }

				};
			
		Collections.sort(values, c);   //to print value  in ascending  order using first digit
		
		
		  for(Integer o : values)
		  {
			  System.out.println(o);
		  }
			
	}

}
*/

public class CollectionDemo 
{

	public static void main(String[] args) 
	{
		List<Integer> values = new ArrayList<>();
		values.add(404);
		values.add(639);
		values.add(908);
		values.add(265);

			
		Collections.sort(values,(i,j)-> i%10>j%10?1:-1);   // same as upper one
		
		
		  for(Integer o : values)
		  {
			  System.out.println(o);
		  }
			
	}

}

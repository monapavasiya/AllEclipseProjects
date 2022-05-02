//
/* 

 * * * *
 * * * *
 * * * *
 * * * *


 */
//
public class NestedLoop
{

	public static void main(String[] args)
	{
	  for(int i=1;i<=6;i++) // i=1, i=2, i=3
	  {
		for(int j=1;j<=i;j++) //j=1, 

		{

			System.out.print(j); // 1, 1 2, 1 2 3, 1
		}
		System.out.println();
	  }





	}

}

/*
public class NestedLoop
{

	public static void main(String[] args)
	{
	  for(char c1='A'; c1<='D'; c1++) 
	  {
		for(char c2='A'; c2<=c1; c2++)

		{

			System.out.print(c2); 
		}
		System.out.println();
	  }
	}

}*/


/*
public class NestedLoop
{

	public static void main(String[] args)
	{ 
		int n=3;
		for(int i=0;i<=n;i++)// 0,1,2,3
		{
			for(int j=0;j<=n;j++)// 0,1,2,3

			{
				if(i==0 || j==0 || i==n || j==n) {

					System.out.print("$ "); // $ $ $ $ ,$    $, $   $, $ $ $ $      
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}*/

/*
public class NestedLoop
{

	public static void main(String[] args)
	{ 

		for(int i=0;i<=3;i++)// 0,1,2,3
		{
			for(int j=0;j<=3;j++)// 0,1,2,3

			{
				System.out.print("$ "); // $ $ $ $ ,$    $, $   $, $ $ $ $      
			}

			System.out.println();
		}
	}

}*/
/*
public class NestedLoop
{

	public static void main(String[] args)
	{ 
		int n=3;
		for(int i=0;i<=n;i++)// 0,1,2,3
		{
			for(int j=0;j<=n;j++)// 0,1,2,3

			{
				if(i==0 || j==0 || i==n || j==n || j==1) {

					System.out.print("$ "); // $ $ $ $ ,$    $, $   $, $ $ $ $      
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}*/


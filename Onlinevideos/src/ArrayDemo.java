
public class ArrayDemo 
{

	public static void main(String[] args)
	{
		int nums[] = new int [4]; // same as int nums[] = {8,12,76,54};
		
		nums[0] = 8;
		nums[1] = 12;
		nums[2] = 76;
		nums[3] = 54;
		
		for(int i=0;i<4;i++)
		{
		
		System.out.println(nums[i]);
    	}
		
		//one dimentional array
		
		
		
		{
			int a[] = {1,2,3,4};
			int b[] = {2,4,6,8};
			int c[] = {5,6,7,8};
			
			int d[][] = {
					           {1,2,3,4},
					           {2,4,6,8},
					           {5,6,7,8}
					           
			            };
			for(int i=0;i<3;i++)   // row
			{
				for(int j=0;j<4;j++) //column
				{
					System.out.print(" "+d[i][j]);
				}
				System.out.println();
			}
			
		}
		
		//two dimentional array
		
		{
			int p[] = {1,2,3,4};
			int q[] = {2,4,6,8};
			int r[] = {5,6,7,8};
			
			int s[][] = {
					           {1,2,3,4},
					           {2,4,8},
					           {5,6,7,8,9}
					           
			            };
			for(int i=0;i<s.length;i++)
			{
				for(int j=0;j<s[i].length;j++)
				{
					System.out.print(" "+s[i][j]);
				}
				System.out.println();
			}
		}
		//jagged array
		
		
		{
			int a[] = {1,2,3,4};
			
			for(int k : a)
				
			{
				System.out.print(" " + k);
			}
		}
		
		
		{ 
			{
				
		}
			int p[] = {1,2,3,4};
			int q[] = {2,4,6,8};
			int r[] = {5,6,7,8};
			
			int s[][] = {
					           {1,2,3,4},
					           {2,4,8},
					           {5,6,7,8,9}
					           
		
		            	};
			for(int k[]: s)
			{
				for(int l : k)
			
				{ 
					System.out.print(" " + l);
				}
				System.out.println();
			}
			//enhance forloop
			
		}
    }
	
}

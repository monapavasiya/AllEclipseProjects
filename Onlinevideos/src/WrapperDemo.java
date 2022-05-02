
// int, float, double  (datatypes)

//Integer (class)



public class WrapperDemo 
{

	public static void main(String[] args)
	{
	  /* int i = 5;                    //primitive datatype
	   
	   Integer ii = new Integer(i); // boxing  or wrapping
	   
	   int j = ii.intValue();      //unboxing or unwrapping
	   
	   Integer value = i;        //autoboxing or autowrapping
	   
	   int k = value;          // autounboxing or autounwrapping
    */
		
		String str = "123";
		
		int n = Integer.parseInt(str); 
		System.out.println(n);
	}

}

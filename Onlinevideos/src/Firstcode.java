
public class Firstcode
{
  public static void main(String args[])
  {
	System.out.print(" Hello World");  //syso + ctrl + spacebar 
	
	int a = 5;
	a = 8;                            // source file --> compilier --> byte code--> JVM (java virtual machine)
	System.out.print(a);
	
	float percent1 = 5.5f;
	
	double percent =5.5;
	
	
	
	long l = 500000000; //8 bytes
	int i = 5;         //4 bytes --> 32 bits
	short s = 5;      //2 bytes -->16 bits --> -32768 to 32767
	byte b = 5;       //1 byte --> 8 bits -- > -128 to 127
	float f = 5.5f;     
	double d = 5.5;
	
	char c = 'A';
		c = 66; //american standard code for information interchange
	
	double d1 = 5; //implicit conversation
	int k = (int)5.6; //type casting
	System.out.print(k);
	
			
	
	
  }
}

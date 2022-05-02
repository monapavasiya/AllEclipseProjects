import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		System.out.println("Days input : "+ days);
		int hours = scanner.nextInt();
		double min =scanner.nextDouble();
		long seconds = scanner.nextLong();
		
		System.out.println( days + hours + min + seconds);
		
		

	}

}

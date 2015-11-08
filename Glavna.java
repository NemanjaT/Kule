package pred1;

import java.util.Scanner;

public class Glavna {
	
	public static void main(String[] args)
	{
		int n;
		Scanner tastatura = new Scanner(System.in);
		
		System.out.print("Unesite broj diskova Hanojskih kula> ");
		n = tastatura.nextInt();
		
		System.out.println("\nResenje igre za " + n + " diskova je:");
		
		premestiDiskove(n, 'A', 'B', 'C');
		
		tastatura.close();
	}
	
	public static void premestiDiskove(int n, char a, char b, char c)
	{
		if(n == 1)
			premestiDisk(a , c);
		else {
			premestiDiskove( n-1, a, c, b);
			premestiDisk(a, c);
			premestiDiskove( n-1, b, a, c);
		}
	}
	
	public static void premestiDisk( char x, char y)
	{
		System.out.print("Disk na vrhu stuba: " + x);
		
		System.out.println(" premestiti na vrh stuba " + y);
	}
	
}

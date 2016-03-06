import java.io.DataInputStream;
import static java.lang.Math.*;
//importing the math class
import java.io.Console;
//importing the console class to take user input.

class mathc
{
	public static void main(String [] args)
	{
        System.out.println("Enter the number ::  ");
    	Console console = System.console();
    	int x = Integer.parseInt(console.readLine());
    	double y = sqrt(x) ;
    	double z = cbrt(x) ;
    	System.out.println("Square root of " +x+ "is :"+y);
    	System.out.println("Cube root of" +x+ "is :"+z);
	}
}

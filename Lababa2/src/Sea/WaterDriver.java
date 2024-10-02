/**
* lab 2 package
* class WaterDriver
*/
package Sea;
import java.io.*;

public class WaterDriver {
	/**
	* @param args
	* @throws IOException
	*/
	public static void main(String[] args) throws IOException
	{
	Sea Lake1 = new Sea();
	Lake1.makesize(20);
	Lake1.saltthewater();
	Lake1.thismanyfish(3);
	int x = Lake1.Roll20();
	Lake1.Fish(x);
	Lake1.getfishname();
	int numberoffish = Lake1.howmanyfish();
	while (numberoffish > 0)
	{
		numberoffish = Lake1.ThrowTheRock();
	}
	System.out.println("You catch all fish in water with a rock");
	Sea Lake2 = new Sea(5, false, 50);
	Lake2.getsize();
	Lake2.iswatersalty();
	Lake2.howmanyfish();
	}
}
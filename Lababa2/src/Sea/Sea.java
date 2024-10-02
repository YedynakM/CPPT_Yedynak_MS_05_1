package Sea;
import java.io.IOException;
import java.util.Random;

public class Sea extends Water implements cAtching{
    /**
     * Constructor
     * @throws IOException 
     */
    public Sea() throws IOException  {
    	super();
    	this.isSalty = true;
    	log("This is sea");
    }
    /**
    * Constructor
    * @throws IOException 
    */
    public Sea(int numberOfFish, boolean isSalty, float size) throws IOException  {
    	super(numberOfFish, isSalty, size);
    	this.isSalty = true;
    	log("This is special sea");
    }
    /**
     *a method that returns a value from 1-20
     */
    public int Roll20()
    {
    	log("Roll10 completed successfully.");
		Random random = new Random();
		int x = random.nextInt(20) + 1;
		return  x;
    }
    /**
     * a method that catch one fish with a rock with 1/4 chance
     */
    public int ThrowTheRock() {
		if (this.numberoffish > 0) {
		int x = Roll20(); 
		Fish (x);
		if (this.name == "None")
		{
			System.out.println("You don't catch any fish with a rock");
		}
		else {
		System.out.println("You catch " + name + " with a rock");
		this.numberoffish--;
		}
		}
		else {
			this.name = "There is no fish in water";
			System.out.println("You catch all fish in water with a rock" + name);
		}
		log("ThrowTheRock completed successfully.");
		return numberoffish;
		}
}
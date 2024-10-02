/**
* lab 2/3 package
* Abstract class Water
*/
package Sea;
import java.io.*;
import java.util.Random;
import java.time.LocalDateTime; 

public abstract class Water {
	/**
	* Class field (7)
	*/
	protected String name;
	protected int numberoffish;
    protected boolean isSalty;
    private float size;
    private static String fileName;
    protected BufferedWriter logBuffer;
    protected FileWriter logWriter;
    
    /**
    * Default Constructor
    * @throws IOException 
    */
    public Water() throws IOException  {
        name = "";
        numberoffish = 0;
        isSalty = false;
        size = 1;
        fileName = "Water_log_" + LocalDateTime.now().toString().replace(":", "_") + ".txt";
        logWriter = new FileWriter(fileName);
        logBuffer = new BufferedWriter(logWriter);
        log("This is water");
    }
    /**
    * Constructor
    * @throws IOException 
    */
    public Water(int numberOfFish, boolean isSalty, float size) throws IOException  {
    	name = "";
        this.numberoffish = numberOfFish;
        this.isSalty = isSalty;
        this.size = size;
        fileName = "Water_log_" + LocalDateTime.now().toString().replace(":", "_") + ".txt";
        logWriter = new FileWriter(fileName);
        logBuffer = new BufferedWriter(logWriter);
        log("This is special water");
    }
    

    /**
     * 1+ a method that shows size of water
     */
    public float getsize()
    {
    	log("getsize completed successfully.");
    	System.out.println("The size is " + this.size);
    return this.size;
    }
    /**
     * 2+ a method that changes the size of the water
     */
    public void makesize(float size)
    {
    	System.out.println("Changed size is " + this.size);
    	log("makesize completed successfully.");
    	this.size = size;
    }
    /**
     * 3+  a method that shows if the water is salty
     */
    public boolean iswatersalty ()
    {
    	log("iswatersalty completed successfully.");
    	System.out.println("Is water salty? " + isSalty);
    return this.isSalty;
    }
    /**
     * 4+ a method that salts the water
     */
    public void saltthewater()
    {
    	System.out.println("Water is salted now " + isSalty);
    	log("saltthewater completed successfully.");
    this.isSalty = true;
    }
    /**
     * 5+ a method that shows number of fish
     */
    public int howmanyfish()
    {
    	log("howmanyfish completed successfully.");
    	System.out.println("How many fish? " + this.numberoffish);
    return this.numberoffish;
    }
    /**
     * 6+ a method that changes the number of the fish
     */
    public void thismanyfish(int numberoffish)
    {
    	log("thismanyfish completed successfully.");
    	System.out.println("this many fish now " + this.numberoffish);
    	this.numberoffish = numberoffish;
    }
    /**
     * 7+ a method that shows fish name
     */
    public String getfishname ()
    {
    	System.out.println("Fish name is " + this.name);
    	log("getfishname completed successfully.");
    return name;
    }
    /**
     * 8+ a method that changes the name of the fish
     */
	public String Fish  (int x)
	{	
		switch (x) {
	case 1:
			this.name = "Pike";
			break;
	case 2:
		this.name = "Perch";
		break;
	case 3:
		this.name = "Crucian carp";
		break;
	case 4:
		this.name = "Carp";
		break;
	case 5:
		this.name = "Catfish";
		break;
	default:
		this.name = "None";
		break;	
	}
		log("Fish completed successfully.");
		return this.name;
	}
    /**
     * 9+ a method that returns a value from 1-10
     */
	public int Roll10() {
		log("Roll10 completed successfully.");
		Random random = new Random();
		int x = random.nextInt(10) + 1;
		return  x;
	}	
	 /**
     * 10+ a method that catch one fish with a rock with 1/2 chance
     */
	public int ThrowTheRock() {
		if (this.numberoffish > 0) {
		int x = Roll10(); 
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
	/**
     * 11 a method that make log messages
     */
	protected void log(String message) {
	    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
	        writer.write(System.currentTimeMillis() + ": " + message + "\n");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
}
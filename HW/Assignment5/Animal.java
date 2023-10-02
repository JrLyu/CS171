/* *************************************************
   WARNING - WARNING - WARNING - WARNING - WARNING 

   DO NOT make any change to this program file
   ************************************************* */
public class Animal {
    // DO NOT make any change to this program file
    private String name;
    private String sound;
    private double weight;

    // DO NOT make any change to this program file
    public Animal(String n, String s, double w) {
	name = n;
	sound = s;
	weight = w;
    }

    // DO NOT make any change to this program file
    public String toString() {
	return name + " - " + sound;
    }

    // DO NOT make any change to this program file
    public double getWeight() {
 	return weight;
    }
}

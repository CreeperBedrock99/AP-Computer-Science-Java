/* 
    Lecture note example - Classes
*/
import pkg.*;
import java.util.*;

class starter{
    public static void main(String args[]) {
        // Your Code Goes here!
        Potato fry = new Potato();
        boolean x = fry.getEdibility();
        System.out.println(x);
        Potato sp = new Potato("Blue", "Baked", 100);
        System.out.print(sp.getEdibility());
        sp.eatPotato();
	}
}
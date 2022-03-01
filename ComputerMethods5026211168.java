import java.lang.*;
import java.util.*;

public class ComputerMethods5026211168 {
    //Convert Fahrenheit to Celcius
    public double fToC(double degreesF){
        double degreesC = 5.0/9 * (degreesF-32);
        System.out.println("Temperature " +degreesC);
	return degreesC;

    }

    //Hypothenuse
    public double hypotenuse (int a, int b){
        double c = Math.sqrt((a*a+b*b));
  System.out.println("The Hypotenuse is " + c);    
  return c;

    }

    //Dice
    public int roll(){
      Random randnum= new Random();
      int dice1= randnum.nextInt(6) +1;
      int dice2= randnum.nextInt(6)+2;
      int total = dice1+dice2;
      System.out.println("The sum of the dice is " + total);
      return total;
    }
}
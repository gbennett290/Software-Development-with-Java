/*
Author: Gabriel Bennett
Assignment: Module 01 Exercise 6.9 
Last edited: 1-21-2024
Purpose: This program displays a table with the left side showing feet being changed into meters while the right side shows meters being changed into feet.
*/

//Below is the creation of the class exercise0609
public class exercise0609 {
    public static void main(String[] args) {

//Below is the Header for the output.
        System.out.println(" Feet    Meters    |    Meters    Feet");
        System.out.println("-----------------------------------------");

//Below is the starting points for the table calculations and how they will be adjusted for each row.
        for (double feet = 1, meters = 20; feet <= 10; feet += 1, meters += 5)

//Below is the formatting of the table elements.
        {
            System.out.printf("%4.1f      ", feet);
            System.out.printf("%4.3f", footThenMeter(feet));
            System.out.printf("    |    ");
            System.out.printf("%4.1f    ", meters);
            System.out.printf("%6.3f\n", meterThenFoot(meters));
        }
    }
//Below is the formula that is drawn on to change feet into meters.
    public static double footThenMeter(double foot)
    {
        return 0.305 * foot;
    }
//Below is the formula that is drawn on to change meters into feet.
    public static double meterThenFoot(double meter)
    {
        return 3.279 * meter;
    }
}



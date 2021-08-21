import java.text.DecimalFormat;
import java.util.Scanner;

public class HourParked {

    public static void main(String[] args) 
    {

        Scanner keyboard = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("Rs##.00");

        System.out.print("Enter the number of cars parked : ");
        final int Number_Of_Cars = keyboard.nextInt();

        double hoursPark=0;
        double currentCost=0;   
        double totalCost=0;

        for(int count = 1; count<=Number_Of_Cars; count++)
        {   
            System.out.print("No. of hours cars parked " + count + ": ");
            hoursPark = keyboard.nextDouble();
            currentCost = calculateCharges(hoursPark); 
            totalCost+=currentCost; 
        }

        System.out.println("Most recent customer paid: "   +  formatter.format(currentCost));
        System.out.println("Running total of receipts: " + formatter.format(totalCost));

    }
	 public static double calculateCharges (double numHours)
    {

        double garageCost = 0;

        if(numHours<=3)
            garageCost = 2;

        else if(numHours>3 && numHours<=19)
            garageCost = 2.0 + 0.5*(numHours - 3);

        else if (numHours >19)
            garageCost = 10;

        return garageCost;
    }

}
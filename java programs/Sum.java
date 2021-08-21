import java.util.Scanner;

public class Sum
{
 public static void main(String[] args)
 {
	 Scanner input = new Scanner(System.in);
 int x;
 int y;
 int sum;
 
 System.out.print("enter the 1st no.");
 x = input.nextInt();
 System.out.print("enter the 2nd no.");
 y =  input.nextInt();
 sum= x+y;
 System.out.println("The sum of two no.s is:"+sum);
 }
}
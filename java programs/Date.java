import java.util.Scanner;
public class Date{
	int day;
	int month;
	int year;
	
	public Date()
	{
		day = 10;
		month = 6;
		year = 21;
	}
	public static int getDay()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("enter day");
		int day = input.nextInt();
		return day;
	}
	
	public static int getMonth()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("enter month");
		int month = input.nextInt();
		return month;
	}
	
	public static int getYear()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("enter year");
		int year = input.nextInt();
		return year;
	}
	
	void displayDate()
	{
		System.out.print("Entered Date : "+day+"/"+month+"/"+year);
	}
	
	public static void main(String args[])
	{
		Date dateTest =new Date();
		dateTest.displayDate();
	}
}
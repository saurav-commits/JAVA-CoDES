import java.util.*;
class Best
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the city name: ");
		String name = sc.nextLine().toLowerCase().trim();
		if(name.equals("Hyderabad"))
		{
			System.out.println("hello hyderabadi, salam walekum");
}
		else if (name.equals("chennai"))
		{
		System.out.println("hello madrasi, vannakam...");
		}
		else if(name.equals("bangalore"))
		{
		System.out.println("Hello Kannadiga Namaskara...");
		
		}
		else
		{
		System.out.println("please enter a city name");
		}
	 }
}
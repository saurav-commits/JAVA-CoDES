import java.util.Scanner;
public class AccountTest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Account myAccount = new Account();
		System.out.print("Name : "+myAccount.getName());
		String thisname = input.nextLine();
		myAccount.setName(thisName);
		System.out.print("Name : "+myAccount.getName());
	}
}


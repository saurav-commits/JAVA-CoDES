import java.util.*;

class Gcd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1= sc.nextInt();
		System.out.println("Enter the second number");int num2=sc.nextInt();
		System.out.println("Gcd of the two numbers"+num1+"and"+num2+"is:"+findGcd(num1,num2));
		}

  private static int findGcd(int num1,int num2) {
	if(num2==0) {
		return num1;
	}
	return findGcd(num2, num1%num2);
  }
}
	
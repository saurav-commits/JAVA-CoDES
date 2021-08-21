import java.util.Scanner;

class ArraySum{
	public static void main(String args[]){
		String d1;
		String d2;
		double total=0.0;
		
		Scanner input =new Scanner(System.in);
		System.out.println("first num.: ");
		d1 = input.next();
		System.out.println("second num.: ");
		d2 = input.next();
		total =Double.parseDouble(d1)+Double.parseDouble(d2);
		
		System.out.printf("Sum of the two no.s: "+total);
	}
}

		
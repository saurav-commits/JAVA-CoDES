public class Overloading1{
	public static void main(String args[]){
		int a=5;
		int b=9;
		double c=4.2;
		double d=3.6;
		
		int result1=minInt(a,b);
		double result2=minDob(c,d);
		
		System.out.println("Minimum Value: "+result1);
		System.out.println("Minimum Value: "+result2);
	}
	
	public static int minInt(int a,int b){
		int min;
		if(a<b)
			min=a;
		else
			min=b;
		return min;
	}
	
	public static double minDob(double c,double d){
		double min;
		if(c<d)
			min=c;
		else
			min=d;
		return min;
	}
	
}
		
	
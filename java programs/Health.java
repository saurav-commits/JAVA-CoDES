public class Health
{
	 String fname;
	 String lname;
	 String gen;
	 int dob;
	 int height;
	 int weight;
	 
	 Health(String fname,String lname,String gen,int dob,int height,int weight)
	 {
		 this.fname=fname;
		 this.lname=lname;
		 this.gen=gen;
		 this.dob=dob;
		 this.height=height;
		 this.weight=weight;
	 }
	 
	 public static void main(String[] args)
	 {
			 Health h = new Health("Saurav","Kumar","M",1997,159,60);
			 System.out.println("First Name is "+h.fname);
			 System.out.println("Last Name is "+h.lname);
			 System.out.println("Gender is "+h.gen);
			 System.out.println(" DOB is "+h.dob);
			 System.out.println(" Height is "+h.height);
			 System.out.println(" Weight is "+h.weight);
	 }
}




	 

	
	 
		
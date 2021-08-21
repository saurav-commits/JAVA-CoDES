public class DateT
{
    public static void main(String[] args)throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Date d= new Date();
        
        d.get_dat();
        d.get_month();
        d.get_year();

        System.out.println("the date for get method");
        d.display();
        System.out.println("the date for set method");
       
    }
}
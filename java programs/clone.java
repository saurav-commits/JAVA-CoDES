class Test implements Cloneable
{
	int i=10;
	int j=20;
	public static void main(String[] args)throws CloneNotSupportedException
	{
	Test t1 = new Test();
	Test t2 = (Test)t1.clone(); // Test obj must be implemnted as child refernce cannot be used.
	t2.i = 888;
	t2.j = 999;
	System.out.println(t1.i+"........."+t1.j);
	}
}
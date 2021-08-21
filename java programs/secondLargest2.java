class SecondLargest2{
	public static void main(String[] args)
	{
		int[] a ={6,8,2,4,3,1,5,7,9};
		int largest = Integer.MIN_VALUE;
		int sndlargest = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				sndlargest = largest;
				largest = a[i];
			}
			else if (a[i]>sndlargest && a[i]!=largest)
			{
				sndlargest=a[i];
			}
		}
		System.out.println("Second Largest no. is"+sndlargest);
	}
}

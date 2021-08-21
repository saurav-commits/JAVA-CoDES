import java.util.Set;
import java.util.HashSet;
class Dupset
{
	public static void main(String[] args)
	{
		int[] a = {3,5,6,7,3,5,7,2,6};
		Set<Integer> s = new HashSet<>();
		for(int num:a)
		{
			if(s.add(num)==false)
			{
				System.out.println(num);
			}
		}
	}
}

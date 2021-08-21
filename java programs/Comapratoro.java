import java.awt.*;
class Comaparatoro {
	public static void main(String args[]) throws Exception{
		int values[] = new int[4];
		Object values1[] = new Object[4];
		values1[0]="Saurav";
		values1[1]=6;
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(309);
		values.add(998);
		values.add(570);
		values.add(990);
		values.add(250);
		
		
		Collections.sort(values);
		Collections.reverse(values);
		
		for(int i : values)
		{
			System.out.println(i);
		}
	}
}

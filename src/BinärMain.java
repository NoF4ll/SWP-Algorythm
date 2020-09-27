import java.util.Random;

public class BinärMain {
	public static void main(String[] args) {
		
		int[] a = new int[100];
		Random r = new Random();
		int randomZahl= r.nextInt(100);

		
		fillArray(a);
		binärSuche(a,randomZahl,0,a.length);
		sequtialSuche(a,randomZahl);
		
		System.out.println("Die zusuchende Zahl ist "+randomZahl);
		

	}
	
	static void fillArray(int array[])
	{
		for(int i = 0 ; i < array.length ; i++)
		{
			array[i] = i;
		}
	}
	
	static void binärSuche(int array[], int x, int min, int max )
	{
		boolean ok = true;
		long zeitStart = System.nanoTime();
		while(ok)
		{
			if(array[(max+min)/2]>x)
			{
				max = (max+min)/2-1;
			}
			
			if(array[(max+min)/2]<x)
			{
				min = (max+min)/2+1;
			}
			if(array[(max+min)/2] == x)
			{
				long zeitEnde = System.nanoTime();
				System.out.println(zeitEnde-zeitStart);
				ok =false;
			}
			
		}
	}
	
	static void sequtialSuche(int array[],int x)
	{
		long zeitStart = System.nanoTime();
		for(int i = 0 ; i <=array.length ;i++)
		{
			if(array[i]==x)
			{
				long zeitEnde = System.nanoTime();
				System.out.println(zeitEnde-zeitStart);
				break;
			}
		}
	}
}

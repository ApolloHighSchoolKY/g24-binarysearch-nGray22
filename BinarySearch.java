import java.util.Arrays;

public class BinarySearch
{
	public static int binarySearch(int[] ray, int item)
	{	
		Arrays.sort(ray);
		int bot = 0;
		int top = ray.length-1;
		int middle = (bot + top) /2;
		while(bot<=top)
		{
			if(ray[middle]<item)
			{
				bot = middle+1;
			}
			else if(ray[middle]>item)
			{
				top = middle -1;
			}
			else 
			{
			 return middle;
			 	
			}	
			middle = (bot + top) /2;
		}

		return -1;
		
	}
}

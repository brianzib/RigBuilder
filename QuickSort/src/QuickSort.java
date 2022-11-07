
public class QuickSort {

	public static void main(String[] args) {

		int i;
		int j;
		int [] array = {1 , 5, 6, 2, 7, 8, 10};

		int pivot = array.length - 1;

		i = array.length - array.length - 1;
		j = array.length - array.length;
		
		for (int x = 0; x < array.length - 1; x++)
		{
			if (i > -1 || j > 0)
			{
				if (array[j] < array[pivot])
				{
					i++;
					int temp = array[j];
					array[j] = array[i];
					array[i] =  temp;
					j++;
				}
			}
			else
			{
				j++;
			}
			

		}

	}

}

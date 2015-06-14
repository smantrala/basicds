package InterviewSamples;

import java.util.Arrays;

class SelectionSort
{
	static int numElements = 10;
	static int[] numbers = {9, 1, 3, 5, 7, 2, 4, 6, 0, 8 };

	public static void main(String[] args)
	{
		System.out.println("Beginning Array = " + Arrays.toString(numbers));
		selectionSort();
		System.out.println("Sorted Array = " + Arrays.toString(numbers));
	}

	static void selectionSort()
	{
		for (int j=0; j < numElements; j++)
		{
			int smallest = numbers[j];
			int index = j;
			for (int i = j; i < numElements; i++)
			{
				if (smallest > numbers[i])
				{
					index = i;
					smallest = numbers[i];
				}
			}

			int tmp = numbers[index];
			numbers[index] = numbers[j];
			numbers[j] = tmp;
		}
	}
}
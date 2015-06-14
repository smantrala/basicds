package InterviewSamples;

import java.util.Arrays;

class BubbleSort
{
	public static void main(String[] args)
	{
		System.out.println("Starting numbers= " + Arrays.toString(numbers));
		sort();
	}

	static int numElements = 10;
	static int[] numbers = {9, 1, 3, 5, 7, 2, 4, 6, 0, 8 };

	static void sort()
	{
		int n = numElements-1;
		for (int j=0; j<numElements -1 ; j++)
		{
			for (int i = 0; i < n; i++)
			{
				if (numbers[i] > numbers[i+1])
				{
					int tmp = numbers[i+1];
					numbers[i+1] = numbers[i];
					numbers[i] = tmp;
				}

				System.out.println("Numbers = " + Arrays.toString(numbers));
			}
			n -=1;
		}
	}
}
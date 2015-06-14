package InterviewSamples;

import java.util.Arrays;

class QuickSort
{
	static int numElements = 10;
	static int[] numbers = {9, 1, 3, 5, 7, 2, 4, 6, 0, 8 };

	public static void main(String[] args)
	{
		System.out.println("Array Initial " + Arrays.toString(numbers));

		sort(0, numElements-1);

		System.out.println("Sorted Array " + Arrays.toString(numbers));
	}

	static int partition(int lowerIndex, int upperIndex, int pivot)
	{
		int leftPtr = lowerIndex -1;
		int rightPtr = upperIndex;

		while (true)
		{
			while (leftPtr < upperIndex && numbers[++leftPtr] < numbers[pivot])
				;;

			while (rightPtr > lowerIndex && numbers[--rightPtr] > numbers[pivot])
				;;

			if (leftPtr >= rightPtr)
				break;
			else
				swap(leftPtr, rightPtr);
		}

		System.out.println("Array after first swap " + Arrays.toString(numbers));

		swap(leftPtr, pivot);

		System.out.println("Array after second swap " + Arrays.toString(numbers));

		return leftPtr;
	}

	static void swap(int left, int right)
	{
		System.out.println("Swapping left index " + left + " value " + numbers[left] + " with right index " +right + " value " + numbers[right]);
		int tmp = numbers[left];
		numbers[left] = numbers[right];
		numbers[right] = tmp;

	}

	static void sort(int left, int right)
	{
		if (right-left <= 0)
			return;

		int pivot = right;

		int partDex = partition(left, right, pivot);

		System.out.println("Partition Index = " + partDex);

		sort(left, partDex - 1);

		sort(partDex+1, right);
	}
}
package InterviewSamples;

import java.util.Arrays;

class MergeSort
{
	static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	static int[] a = { 5, 3, 9, 2, 7};

	static int[] b = { 1, 8, 4, 6, 0};

	static int[] c = new int[10];	

	static int numElements = 10;

	public static void main(String[] args)
	{
		System.out.println("Starting numbers= " + Arrays.toString(c));
		merge(a, b, 5, 5);
		System.out.println("Merged numbers= " + Arrays.toString(c));

		mergesort(c, 0, 10);
		System.out.println("Sorted numbers= " + Arrays.toString(c));
	}

	static void merge(int[] a, int[] b, int sizea, int sizeb)
	{
		int i = 0, j = 0, k = 0;

		while (i < sizea && j < sizeb)
		{
			if (a[i] > b[j])
			{
				c[k++] = b[j++];
			}
			else
			{
				c[k++] = a[i++];
			}
		}

		while (i < sizea)
		{
			c[k++] = a[i++];
		}

		while (j < sizeb)
		{
			c[k++] = b[j++];
		}
	}

	static void domerge(int[] a, int lowerbound, int mid, int upperbound)
	{
		int i = 0;
		int j = mid;
		int k = 0;

		int sizea = mid - lowerbound;
		int sizeb = upperbound;

		while (i < sizea && j < sizeb)
		{
			if (numbers[i] > numbers[j])
			{
				a[k++] = numbers[j++];
			}
			else
			{
				a[k++] = numbers[i++];
			}
		}

		while (i < sizea)
		{
			a[k++] = numbers[i++];
		}

		while (j < sizeb)
		{
			a[k++] = numbers[j++];
		}
	}

	static void mergesort(int[] a, int lowerbound, int upperbound)
	{
		if (upperbound == lowerbound)
			return;
		
		int mid = (lowerbound + upperbound)/2;

		mergesort(a, lowerbound, mid);

		mergesort(a, mid+1, upperbound);

		domerge(a, lowerbound, mid, upperbound);
	}
}
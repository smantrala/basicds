package InterviewSamples;

class BinarySearch
{
	static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	static int numElements = 10;

	public static void main(String[] args)
	{
		int val = find(11);

		System.out.println("Found at index = " + val);

		System.out.println("Recursive found at index = " + recFind(8, 0, numElements-1));
	}

	static int find(int key)
	{
		int upperBound = numElements-1;
		int lowerBound = 0;

		while(true)
		{
			int cur = (upperBound + lowerBound)/2;

			if (numbers[cur] == key)
				return cur;
			else if (lowerBound > upperBound)
				return -1;
			else 
				{
					if (key > numbers[cur])
						lowerBound = cur + 1;
					else 
						upperBound = cur - 1;
				}
		}
	}

	static int recFind(int key, int lowerBound, int upperBound)
	{
		int cur = (lowerBound + upperBound)/2;

		if (numbers[cur] == key) 
			return cur;
		else if (lowerBound > upperBound) 
			return -1;
		else
		{
			if (numbers[cur] > key)
			{
				return recFind(key, lowerBound, cur+1);
			}
			else
			{
				return recFind(key, cur+1, upperBound);
			}
		}
	}
}

package InterviewSamples;

import java.util.Arrays;

//
// Class to get average of last N numbers in a stream
//
class AverageOfLastN
{
	public final int MAX=100;

	private int[] numbers = new int[MAX];

	private int numElements = 0;

	public int getNumElements()
	{
		return numElements;
	}

	public void submit(int i)
	{
		assert (numElements < MAX);

		if (numElements == 0)
		{
			numbers[numElements] = i;
		}
		else
		{
			numbers[numElements] = numbers[numElements-1] + i;
		}

		numElements++;
	}

	public int retrieve(int n)
	{
		assert (n > 0);

		if (n >= getNumElements())
		{
			return numbers[numElements-1]/getNumElements();
		}

		return (numbers[numElements-1] - numbers[numElements-1-n])/n;
	}

	public void printArray()
	{
		System.out.println("Stored Numbers " + Arrays.toString(numbers));
	}
}
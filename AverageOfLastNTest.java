package InterviewSamples;

import java.util.Arrays;
import java.util.Random;
import InterviewSamples.AverageOfLastN;

class AverageOfLastNTest
{
	final static int MAX=100;

	static int submittedNumbers[] = new int[MAX];

	public static void main(String[] args)
	{
		if (args.length <= 0)
		{
			System.out.println("Usage: InterviewSamples.AverageOfLastNTest <number less than 100> ");
			System.exit(1);
		}

		int num = Integer.parseInt(args[0]);
		assert (num <= 100);

		runTest(num);
	}

	static void runTest(int num)
	{
		Random rand = new Random();

		AverageOfLastN avg = new AverageOfLastN();

		for (int i=0; i<num; i++)
		{
			submittedNumbers[i] = rand.nextInt(num) + 1;
			avg.submit(submittedNumbers[i]);
		}

		avg.printArray();
		System.out.println("Submitted Numbers = " + Arrays.toString(submittedNumbers));

		for (int j=num; j>0; j--)
		{
			System.out.println("Test for last " + j + " numbers");
			int testAvg = getTestAverage(j);
			int actualAvg = avg.retrieve(j);
						
			assert (testAvg == actualAvg);
			System.out.println("Test passed, test avg = " + testAvg + " actual avg = " + actualAvg);
		}

		// Test for numbers > MAX size
		assert (getTestAverage(100) == avg.retrieve(200));
	}

	static int getTestAverage(int n)
	{
		int sum = 0;
		for (int i=MAX-1; i>=(MAX-n); i--)
		{
			sum += submittedNumbers[i];
		}

		return sum/n;
	}
}
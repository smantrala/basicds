package InterviewSamples;


class MathPower
{
	public static void main(String[] args)
	{
		int r = power (2, 4);

		System.out.println("Result = " + r);
	}

	static int power(int x, int y)
	{
		int result;

		if (y == 0) 
		{
			return 1;
		}

		int temp = power(x, y/2);

		if (y%2 == 0)
		{
			result = temp * temp;
		}
		else
		{
			result = x * power(x, y/2) * power(x, y/2);
		} 

		return result;
	}
}

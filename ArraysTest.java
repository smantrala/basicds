package InterviewSamples;

import java.util.Arrays;

class ArraysTest
{
		static int[] numbers = {1, 9, 3, 5, 7, 2, 4, 6, 0, 8 };

		public static void main(String[] args)
		{
			int i = 0;

			System.out.println("i++=" + numbers[i++]);

			i = 0;

			System.out.println("++i=" + numbers[++i]);		

			System.out.println("Arrays = " + Arrays.toString(numbers));
		}
}
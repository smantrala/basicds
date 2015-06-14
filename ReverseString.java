package InterviewSamples;

class ReverseString
{
	static void reverseString(String str, StringBuffer rev)
	{
		System.out.println("String = " + str);
		if (str.length() == 0) return;

			rev = rev.append(str.substring(str.length()-1));

			System.out.println("last=" + str.substring(str.length()-1) + " rev=" + rev);

			reverseString(str.substring(0, str.length()-1), rev);
	}

	public static void main(String[] args)
	{
		StringBuffer rev = new StringBuffer();

		reverseString("hello", rev);
		
		System.out.println("Reverse of " + rev);

		System.out.println("Reverse while " + reverseWhile("hello"));
	}

	static String reverseWhile(String str)
	{
		StringBuffer rev = new StringBuffer();

		for (int i=str.length()-1; i >= 0; i--)
		{
			rev = rev.append(str.charAt(i));

			System.out.println("Rev = " + rev);
		}

		return rev.toString();
	}
}
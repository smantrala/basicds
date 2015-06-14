package InterviewSamples;

class Permutations
{

    public static void permutation(String str) { 
        permutation("", str); 
    }

    static int counter = 0;

    private static void permutation(String prefix, String str) 
    {
        int n = str.length();

        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
            {
            	System.out.println(" Prefix = " + prefix + " String = " + str + " at counter = " + counter++);
                
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
            }
        }
    }

    public static void main(String[] args)
    {
        String[] str = {"a", "b", "c"} ;

    	permute(str, 0, 2);
    }


    static void permute(String[] str, int i, int n)
    {
        if (i == n)
        {
            System.out.println(printStr(str));
            return;
        }

        for (int j=i; j<=n; j++)
        {
            swap(str, i, j, "first swap");
            permute(str, i+1, n);
            swap(str, i, j, "Backtrack");
        }
    } 

    static void swap(String[] str, int i, int j, String mode)
    {
        String temp = str[i];
        str[i] = str[j];
        str[j] = temp;
        System.out.println(mode + ": Swapping " + str[i] + " with " + str[j] + " " + printStr(str));
    }

    static String printStr(String[] str)
    {
        StringBuffer sb = new StringBuffer();
        
        for (String s : str)
        {
            sb.append(s);
        }

        return  sb.toString();
    }
}
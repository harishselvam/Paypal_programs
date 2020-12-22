public class Main
{
    public static void main(String[] args)
    {

        String str = "babab";
        palindrome(str);
    }
    public static void palindrome(String str)
    {


        int index_start = 0;
        int length = 1;

        int index_low, index_high;
        for (int i = 1; i < str.length(); ++i)
        {
            index_low = i - 1;
            index_high = i;
            while (index_low >= 0 && index_high < str.length() && str.charAt(index_low) == str.charAt(index_high))
            {
                if (index_high - index_low + 1 > length)
                {
                    index_start = index_low;
                    length = index_high - index_low + 1;
                }
                --index_low;
                ++index_high;
            }
            index_low = i - 1;
            index_high = i + 1;
            while (index_low >= 0 && index_high < str.length() && str.charAt(index_low) == str.charAt(index_high))
            {
                if (index_high - index_low + 1 > length)
                {
                    index_start = index_low;
                    length = index_high - index_low + 1;
                }
                --index_low;
                ++index_high;
            }
        }

        System.out.println(str.substring( index_start, index_start + length));

    }

}
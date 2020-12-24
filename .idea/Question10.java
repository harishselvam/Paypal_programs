public class Main {

    public static void main(String[] args)
    {
        String[] array = {"eat","tea","tan","ate","nat","bat"};
        anagrams(array);
        String[] a = {"a"};
        anagrams(a);
        String[] empty = {""};
        anagrams(empty);

    }

    private static void anagrams(String[] array)
    {
        String[]temp = array;
        if(array.length == 1 && array[0].equals(""))
        {
            System.out.println("[]");return;
        }

        int[] count = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            count[i] = sum(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if(count[i]!=Integer.MIN_VALUE)
                System.out.print(array[i]);
            for (int j = i+1; j < array.length; j++) {
                if(count[i] == count[j] && count[i]!=Integer.MIN_VALUE)
                {
                    System.out.print(", "+ array[j]);
                    count[j] = Integer.MIN_VALUE;
                }
            }
            if (count[i]!=Integer.MIN_VALUE)
            {System.out.print("\n");}
        }
    }

    private static int sum(String s)
    {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count+=s.charAt(i);
        }
        return count;
    }

}
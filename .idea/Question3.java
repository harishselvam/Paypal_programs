public class Main {

    public static void main(String[] args)
    {
        System.out.println(containsSubstrings("ababab"));
        System.out.println(containsSubstrings("abcabcabc"));
    }


    public static boolean containsSubstrings(String input)
    {
        return ((input + input).indexOf(input, 1) < input.length());
    }

}

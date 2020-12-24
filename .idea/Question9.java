public class Main {

    public static void main(String[] args)
    {
        String a = "acdcb";
        String p =  "a*c?b";
        System.out.println(ismatching(a,p));
    }

    private static boolean ismatching(String a, String p)
    {
        if(a.isEmpty() && p.isEmpty())
            return true;
        if(a.isEmpty() || p.isEmpty())
            return false;
        if(p.equals("*"))
            return true;
        int pointer1 = 0;
        int pointer2 = 0;

        while(pointer1 < a.length() && pointer2 < p.length())
        {
            if((a.charAt(pointer1) == p.charAt(pointer2)) || (p.charAt(pointer2) == '?'))
            {
                ++pointer1;
                ++pointer2;
            }
            else
            {
                if(p.charAt(pointer2) == '*')
                {
                    int size = (p.substring(pointer2+1)).length();
                    return (ismatching(a.substring(a.length() - size),p.substring(pointer2+1)));
                }
                else
                    return false;
            }
        }
        if(pointer2 >= p.length() && pointer1 < a.length())
            return false;

        return true;
    }


}
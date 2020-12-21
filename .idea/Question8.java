public class Main
{
    public static void main (String[] args)
    {
        isValid("[{}]");
    }

    private static void isValid(String paranthesis)
    {
        Stack<Character> cha_par = new Stack<>();
        for (int i = 0; i < paranthesis.length(); i++)
        {
            try {
                switch (paranthesis.charAt(i)) {
                    case '{':
                    case '[':
                        cha_par.add(paranthesis.charAt(i));
                        break;
                    case ']': {
                        if (cha_par.pop() != '[')

                            throw new Exception();
                    }break;
                    case '}': {
                        if (cha_par.pop() != '{')

                            throw new Exception();
                    }break;

                }
            }
            catch (Exception e)
            {
                System.out.println("Not Valid");;return;
            }

        }
        if(cha_par.isEmpty())
            System.out.println("Valid");
        else
            System.out.println("Not Valid");
    }

}

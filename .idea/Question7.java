public class Main
{
    public static void main (String[] args)
    {
        int coins[] = {9,6,4,2,3,5,7,0,1};
        findnum(coins);
    }

    private static void findnum(int[] coins)
    {
        int[] find = new int[coins.length + 1];
        for (int i = 0; i < coins.length; i++) {
            find[coins[i]] = 1;
        }
        List<Integer> missing = new ArrayList<>();
        for (int i = 0; i < find.length; i++) {
            if(find[i]==0)
                missing.add(i);
        }
        missing.forEach(s->{
            System.out.println(s);
        });
    }
}

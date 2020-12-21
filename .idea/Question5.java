public class Main
{
    public static void main (String[] args)
    {
        int coins[] = {1,2,5};
        int amount = 11;
        System.out.println ( minCoins(coins, coins.length, amount));
    }

    public static int minCoins(int coins[], int m, int amount)
    {

        int table[] = new int[amount + 1];
        table[0] = 0;

        for (int i = 1; i <= amount; i++)
            table[i] = Integer.MAX_VALUE;
        for (int i = 1; i <= amount; i++)
        {
            for (int j = 0; j < coins.length; j++)
            {
                if (coins[j] <= i) {
                    int sub = table[i - coins[j]];
                    if (sub != Integer.MAX_VALUE && sub + 1 < table[i])
                        table[i] = sub + 1;
                }
            }
        }
        return table[amount];

    }
}

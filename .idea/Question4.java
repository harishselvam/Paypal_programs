import java.util.*;

public class Main
{
    public static void main (String[] args)
    {
        int[] gas= {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(isPossible(gas,cost));

        gas =new int[]{2,3,4};
        cost = new int[]{3,4,3};
        System.out.println(isPossible(gas,cost));
    }

    private static int isPossible(int[] gas, int[] cost)
    {
        List<Integer> start = new ArrayList<>();

        for (int i = 0; i < gas.length; i++)
        {
            if(gas[i]>cost[i])
            {
                start.add(i);
            }
        }
        int petrol_av = 0;
        for (int i = 0; i < start.size(); i++)
        {
            int index = start.get(i);
            int reach = index;
            petrol_av = gas[index];

            while (petrol_av >= cost[index])
            {
                int prev_index = 0;

                if(index == gas.length-1)
                    index = 0;
                else
                    index++;

                if(index == 0)
                    prev_index = gas.length - 1;
                else
                    prev_index = index -1;

                petrol_av = (petrol_av + gas[index]) - cost[prev_index];

                if(index == reach)
                {
                    return reach;
                }
            }

        }
        return -1;
    }
}

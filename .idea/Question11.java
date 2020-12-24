
import java.util.LinkedList;

public class Main {

    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 0; i++)
        {
            list.add(i);
        }
        swap_adjacent(list);

    }

    public static void swap_adjacent(LinkedList list)
    {
        if(list.isEmpty())
        {
            System.out.println("[]");
            return;
        }

        int temp = 0;
        while(temp+1<list.size())
        {
            int swap1 = (int) list.get(temp);
            int swap2= (int) list.get(temp+1);
            list.set(temp,swap2);
            list.set(temp+1,swap1);
            temp+=2;
        }
        list.forEach(s->{
            System.out.println(s);
        });
    }

}
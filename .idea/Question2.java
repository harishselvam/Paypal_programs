package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();

/*
        Scanner sc = new Scanner(System.in);
        int u = sc.nextInt();
        sc.next();


        for (int i = 0; i < u; i++) {
            list.add(sc.nextInt());
        }
*/

        for (int i = 1; i < 10; i++) {
            list.add(i);
        }



        int temp = 0;
        while (list.size() > 1) {


            list = remove(list, ++temp);

            if (list.size()==1)
                break;

        }
        System.out.println( "Remaining:"+list.get(0));



    }

    public static List<Integer> remove(List<Integer> list, int i) throws Exception {
        try {
            switch (i % 2)
            {
                case 0:
                {
                    System.out.println("Removing backwards");
                    int poi = list.size() - 1;
                    while (poi > 0 && list.size()>0)
                    {
                        System.out.println(list.get(poi));
                        list.remove(poi);
                        poi -= 2;
                    }
                    return list;

                }

                case 1:
                {
                    int poi = 0;
                    System.out.println("Removing straight");
                    while (poi <= list.size())
                    {
                        System.out.println(list.get(poi));
                        list.remove(poi);
                        poi += 1;
                    }
                    return list;
                }
            }


        }
        catch (Exception e)
        {

        }
        return list;
    }
}
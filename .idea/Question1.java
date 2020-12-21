package com.company;

public class Main {

    public static int trap_water(int[] heights)
    {

        int left = 0, right = heights.length - 1, water = 0;

        int maxLeft = heights[left];
        int maxRight = heights[right];

        while (left < right)
        {
            if (heights[left] <= heights[right])
            {
                left++;
                maxLeft = Integer.max(maxLeft, heights[left]);
                water += (maxLeft - heights[left]);
            }
            else
            {
                right--;
                maxRight = Integer.max(maxRight, heights[right]);
                water += (maxRight - heights[right]);
            }
        }

        return water;
    }


    public static void main(String[] args)
    {
        int[] heights = new int[]{0,1,0,2,1,0,1,3,2,1,2,};
        System.out.println(trap_water(heights));
    }}

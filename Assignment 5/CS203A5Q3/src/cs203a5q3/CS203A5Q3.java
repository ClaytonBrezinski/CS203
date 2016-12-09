/*
 Author: Clayton Brezinski
 Student ID: 200220989
 Notes:
 */
package cs203a5q3;

import java.lang.Number;

/**

 @author Dolan
 */
public class CS203A5Q3
{

    /**
     @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int[] arrayA =
        {
            9, 23, 6, 3, 83, 11, 1, 7, 5, 2
        };
        Integer[] listA = new Integer[arrayA.length];
        arrayIntoList(listA, arrayA);
        System.out.println("Integer values in original order: ");
        printArray(listA);
        System.out.println("Integer values in ascending order: ");

        double[] arrayB =
        {
            9.9, 3.8, 5.2, 7.7, 1.5, 8.8, 3.3, 6.6, 8.3
        };
        Double[] listB = new Double[arrayB.length];
        arrayIntoList(listB, arrayB);
        System.out.println("Double values in original order: ");
        printArray(listB);
        System.out.println("Double values in ascending order: ");
    }

    public static <T extends Number> void insertionSort(T[] list)
    {
        for (int i = 1; i < list.length; i++)
        {
            /**
             insert list[i] into a sorted sublist list[0..i-1] so that
             list[0..i] is sorted.
             */
            T currentElement = list[i];
            int k;

            for (k = i - 1; k >= 0 && list[k].intValue() > currentElement.intValue(); k--)
            {
                list[k + 1] = list[k];
            }

            // Insert the current element into list[k+1]
            list[k + 1] = currentElement;
        }
    }

    public static <T extends Number> void printArray(T[] list)
    {
        if (Integer.class.isAssignableFrom(list[0].getClass()) == true)
        {
            for (int i = 1; i < list.length; i++)
            {
                System.out.println(list[i].intValue());
            }
        }
        else if (Double.class.isAssignableFrom(list[0].getClass()) == true)
        {
            for (int i = 1; i < list.length; i++)
            {
                System.out.println(list[i].doubleValue());
            }
        }
        else
        {
            for (int i = 1; i < list.length; i++)
            {
                //System.out.println(list[i].doubleValue());
                System.out.println("a");
            }
        }

    }

    public static <T extends Number> T[] arrayIntoList(T[] list, int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            list[i] = (T) Integer.valueOf(array[i]);
        }
        return list;
    }

    public static <T extends Number> T[] arrayIntoList(T[] list, double[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            list[i] = (T) Double.valueOf(array[i]);
        }
        return list;
    }
}



/*
Purpose:
Arguments:
Outputs:
Notes:
*/

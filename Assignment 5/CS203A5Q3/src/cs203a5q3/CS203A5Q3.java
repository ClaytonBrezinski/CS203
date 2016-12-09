/*
Author: Clayton Brezinski
Student ID: 200220989
Notes:
*/
package cs203a5q3;
import java.lang.Number;
/**
 *
 * @author Dolan
 */
public class CS203A5Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] listA = {};
        System.out.println("Integer values in original order: ");
        System.out.println("Integer values in ascending order: ");
        
        double[] listB = {};
        System.out.println("Double values in original order: ");
        System.out.println("Double values in ascending order: ");
    }
    
    public <T extends Number> void insertionSort(T[] list)
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
    public <T extends Number> void printArray(T[] list)
    {
        for (int i = 1; i < list.length; i++)
        {
            System.out.println(list[i].doubleValue());
        }
    }
}



/*
Purpose:
Arguments:
Outputs:
Notes:
*/
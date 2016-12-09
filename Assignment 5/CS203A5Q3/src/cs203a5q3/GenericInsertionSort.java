/*
 Author: Clayton Brezinski
 UserID: 200220989
 Date:
 Notes:
 */
package cs203a5q3;

import java.lang.Number;

/*

 @author Dolan
 */

 /*
 Purpose:
 Notes
 */
public class GenericInsertionSort
{
    /**
     The method for sorting the numbers
     */
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

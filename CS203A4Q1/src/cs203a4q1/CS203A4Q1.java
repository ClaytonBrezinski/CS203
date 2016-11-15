/*
Author: Clayton Brezinski
Student ID: 200220989
Notes:
*/
package cs203a4q1;

/**

 @author Dolan
 */
public class CS203A4Q1
{

    /**
     @param args the command line arguments
     */
    public static void main(String[] args)
    {
        try
        {
            Triangle a = new Triangle(1,1,1);
            Triangle b = new Triangle(1,2,4);
        }
        catch(IllegalTriangleException ite)
        {
            double[] sides = ite.getSidesOfTriangle();
            for (int i = 0; i < sides.length; i++)
            {
                System.out.print(sides[i] + " ");
                if (i == sides.length - 1)
                {
                    System.out.print('\n');
                }
            }
            System.out.println(ite.getMessage());
        }
        
    }
    
}
/*
Purpose:
Arguments:
Outputs:
Notes:
*/
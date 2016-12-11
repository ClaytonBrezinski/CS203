/*
 Author: Clayton Brezinski
 UserID: 200220989
 Date:
 Notes:
 */
package cs203a5q2;

/*

 @author Dolan
 */

 /*
 Purpose:
 Notes
 */
public class Account
{
    private int balance = 0;

    public int getBalance()
    {
        return balance;
    }

    public synchronized void deposit(int amount)
    {
        int newBalance = balance + amount;

        // This delay is deliberately added to magnify the
        // data-corruption problem and make it easy to see.
        try
        {
            Thread.sleep(2);
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }

        balance = newBalance;
    }
}
/*
Purpose:
Arguments:
Outputs: 
Notes:
*/

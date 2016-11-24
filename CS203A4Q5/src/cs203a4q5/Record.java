/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package cs203a4q5;

/**

 @author Dolan
 */
public class Record
{

    static int itemNumberCount = 1;
    int itemNumber;
    double price;

    public Record()
    {
	this.itemNumber = itemNumberCount;
	itemNumberCount++;
    }

    public void setPrice(double inPrice)
    {
	this.price = inPrice;
    }

}

/*
 Author: Clayton Brezinski
 Student ID: 200220989
 Notes:
 */
package cs203a4q5;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**

 @author Dolan
 */
public class CS203A4Q5
{

    public static void main(String[] args)
    {
	Record a = new Record();
	Record b = new Record();
	Record c = new Record();
	Record d = new Record();
	Record e = new Record();

	Record f = new Record();
	Record g = new Record();
	Record h = new Record();
	Record i = new Record();
	Record j = new Record();

	try {
	    RandomAccessFile raf = new RandomAccessFile("records", "rw");
	    //raf.writeInt();
	}
	catch (FileNotFoundException fnfe) {
	    fnfe.printStackTrace();
	}

    }

}
/*
Purpose:
Arguments:
Outputs:
Notes:
*/

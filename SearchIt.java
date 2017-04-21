
package cs2001f.assignment.pkg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**Class that searches through a BST for certain names given on a txt file
 *04 April 2017
 * @author Moegamat Ra-eez Stenekamp
 */
public class SearchIt {
  
    
    public static void main (String[] args) throws FileNotFoundException{
        
        // load data from file of data and create BST
        DataReader readData = new DataReader();
        readData.DataReader();
        
        // load the file of names to find
        Scanner query = new Scanner(new File("/home/moegamat/NetBeansProjects/CS2001F_Assignment_2/src/cs2001f/assignment/pkg2/Query.txt"));
        
        while (query.hasNext()){
            String name = query.nextLine();
            
            // see whether the name is in the BST and print its data if it is and "not found" if it isnt
            if (readData.bst.findKey(name)== null){
                System.out.println("Not found");
            }
            else
                System.out.println(readData.bst.findKey(name));
        }
    }
}



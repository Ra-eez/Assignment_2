/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2001f.assignment.pkg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**Class which allows the data file to be read and turned into a Binary Search Tree
 *03 April 2017
 * @author Moegamat Ra-eez Stenekamp
 */
public class DataReader {
    
    // Access the file
    Scanner file;
   
    // Instance Variables
    BinarySearchTree bst = new BinarySearchTree();
    ArrayList<String> address = new ArrayList<>();
    ArrayList<String> number = new ArrayList<>();
    ArrayList<String> name = new ArrayList<>();
    ArrayList<String> fulldata = new ArrayList<>();
    String sname;
    String sdata;
    
    public void DataReader() throws FileNotFoundException{
        
        // read file with the data
        file = new Scanner(new File("/home/moegamat/Downloads/data/testdata"));
        
        // input data into the Binary Search Tree
        while (file.hasNext()){
        
            String data = file.nextLine();
            String[] info = data.split("\\|");
       
            // gets data
            sdata = data;
            // gets key
            sname = (info[2]+"");
            
            // insert the information into the BST
            bst.insert(sname, sdata);
    }
}
}

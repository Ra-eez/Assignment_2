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

/**
 *
 * @author moegamat
 */
public class AVLMaker {
    
    Scanner file;
    AVLTree avl = new AVLTree();
    String sdata;
    String sname;
    
    public void AVLMaker(ArrayList<String> newArray) throws FileNotFoundException{
        
        //setnewArray();
        for (int i = 0; i < newArray.size(); i++){
            String data = newArray.get(i);
            String[] info = data.split("\\|");
            
            sdata = data;
            sname = (info[2]+"");
            
            avl.insert(sname,sdata);
    }
        /*// read file with data
        file = new Scanner(new File("/home/moegamat/Downloads/data/testdata"));
        
        // input data into the AVLTree
        while (file.hasNext()){
        
            String data = file.nextLine();
            String[] info = data.split("\\|");
       
            // gets data
            sdata = data;
            // gets key
            sname = (info[2]+"");
            
            // insert the information into the AVLTree
            avl.insert(sname, sdata);
}*/
}
}
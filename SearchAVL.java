/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2001f.assignment.pkg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author moegamat
 */
    public class SearchAVL {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        //load data from the file of data and create AVLTree
        AVLMaker avlm = new AVLMaker();
        avlm.AVLMaker();
        
        // load the file of names to find
        Scanner query = new Scanner(new File("/home/moegamat/NetBeansProjects/CS2001F_Assignment_2/src/cs2001f/assignment/pkg2/Query.txt"));
        
        while (query.hasNext()){
            String name = query.nextLine();
            
            // see whether the name is in the AVLTree and print its data if it is and "not found" if it isnt
            if (avlm.avl.findKey(name)== null){
                System.out.println("Not found");
            }
            else
                System.out.println(avlm.avl.findKey(name));
        }
    }
    
}

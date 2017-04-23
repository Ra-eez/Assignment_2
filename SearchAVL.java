/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2001f.assignment.pkg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

/**
 *
 * @author moegamat
 */
    public class SearchAVL {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public void searchingAVL(ArrayList<String> newArray) throws FileNotFoundException {
        
        Instant totalTime = Instant.now();
        Instant insertionTime = Instant.now();
        
        //load data from the file of data and create AVLTree
        AVLMaker avlm = new AVLMaker();
        avlm.AVLMaker(newArray);
        Instant insertionTimeEnd = Instant.now();
        
        // load the file of names to find
        Scanner query = new Scanner(new File("/home/moegamat/NetBeansProjects/CS2001F_Assignment_2/src/cs2001f/assignment/pkg2/Query.txt"));
        Instant searchTime = Instant.now();
        
        while (query.hasNext()){
            String name = query.nextLine();
            
            // see whether the name is in the AVLTree and print its data if it is and "not found" if it isnt
            if (avlm.avl.findKey(name)== null){
                System.out.println("Not found");
            }
            else
                System.out.println(avlm.avl.findKey(name));
        }
        
        Instant totalTimeEnd = Instant.now();
        
        Duration totalTimeD = Duration.between( totalTime, totalTimeEnd);
        Duration insertionTimeD = Duration.between(insertionTime, insertionTimeEnd);
        Duration searchTimeD = Duration.between(searchTime, totalTimeEnd);
        
        System.out.println("\n\nTotal time to run the program: " + totalTimeD.toMillis() + " milliseconds");
        System.out.println("Time to insert the data into a Binary Search Tree: " + insertionTimeD.toMillis() + " milliseconds");
        System.out.println("Time to search for the data items in the Binary Search Tree: " + searchTimeD.toMillis() + " milliseconds");
    }
    
}

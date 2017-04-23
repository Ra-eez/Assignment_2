/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2001f.assignment.pkg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



/**
 *
 * @author moegamat
 */
public class RandomFile {
    
    
    
        public ArrayList<String> setnewArray() throws FileNotFoundException{
        
        ArrayList<String> newArray = new ArrayList<>();
        ArrayList<String> array = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of data file: ");
        int n = scan.nextInt();
    
        // Access the file
        Scanner file;
    
        // read file with the data
        file = new Scanner(new File("/home/moegamat/Downloads/data/testdata"));
    
        // input data into the Array
        while (file.hasNext()){
        
            String data = file.nextLine();
        
            array.add(data);
        }
    
        for(int i = 0; i < n; i++){
            Random rand = new Random();
            
            int randomIndex = rand.nextInt(array.size());
            newArray.add(array.get(randomIndex));
            //System.out.println(array.get(randomIndex));
            
        }
        return newArray;
    }
}
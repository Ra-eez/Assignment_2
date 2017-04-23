/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2001f.assignment.pkg2;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author moegamat
 */
public class Interface extends RandomFile{
    
    public static void main (String[]args) throws FileNotFoundException{
        
        System.out.println("--|COMPARE THE SPEEDS OF A BST AND AVL TREE|--\n");
        RandomFile rand = new RandomFile();
        ArrayList newArray = rand.setnewArray();
        System.out.println("\n--Testing 'SearchIt', which uses a BST--\n\n");
        SearchIt search = new SearchIt();
        search.searching(newArray);
        System.out.println("\n\n--Testing 'SearchIt', which uses a BST--\n\n");
        SearchAVL search2 = new SearchAVL();
        search2.searchingAVL(newArray);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author Kiran
 */
public class Display {
    public static List l;
    
    public static void main(String[] args){
      //  Generate ch = new Generate();
        //ch.generate();
        GroupOfCards c = new GroupOfCards();
         c.generate();
       CrazyEights [] arr = new CrazyEights[7];
   
       
            for(CrazyEights i : c.cards){
                    
                    
             System.out.println(i);
        }
           System.out.println();         
                   
            System.out.println("Splitted arrays : one set for one player");
                  for(CrazyEights i : c.splitArrays(c.cards)){
                    
                    
             System.out.println(i);
        }
           
             System.out.println();
               //c.cards.removeAll(Arrays.asList(c.splitArrays(c.cards)));
         
           System.out.println("Splitted arrays :  set for second player");
              for(CrazyEights i : c.splitArrays1(c.cards)){
                    
                    
             System.out.println(i);
        }
                    System.out.println();
        System.out.println("Splitted arrays :  set for third player");
                        
     for(CrazyEights i : c.splitArrays2(c.cards)){
                    
                    
             System.out.println(i);
        }
     
                    System.out.println();
        System.out.println("Splitted arrays :  set for fourth player");
                        
          for(CrazyEights i : c.splitArrays3(c.cards)){
                    
                    
             System.out.println(i);
        }
          
     //Available cardss
                    System.out.println();
        System.out.println("Splitted arrays :  set of available cards");
         for(CrazyEights i : c.available()){
                  System.out.println(i);
        }
       
     
        
}
}


        


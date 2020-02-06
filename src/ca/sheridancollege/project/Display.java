/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.List;


/**
 *
 * @author Hp
 */
public class Display {
    public static List l;
    
    public static void main(String[] args){
        Generate ch = new Generate();
        ch.generate();
         
       
   
        for(CrazyEights c : ch.deck){
            
             System.out.println("suit is "  + c.getSuit() + " and value is "  + c.getValue());
        }
        
       
     
        
}
        
}

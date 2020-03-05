/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author Sivagama
 */
public class GroupOfCards 
{
   public GroupOfCards(){}
    //The group of cards, stored in an ArrayList
    CrazyEights [] cards = new CrazyEights[52];
        CrazyEights [] arr1 = new CrazyEights[7];
        CrazyEights [] arr2 = new CrazyEights[7];
         CrazyEights [] arr3 = new CrazyEights[7];
            CrazyEights [] arr4 = new CrazyEights[7];
             CrazyEights [] availablecards = new CrazyEights[24];
     public void generate(){
        int count =0;
   for(CrazyEights.Suits s : CrazyEights.Suits.values()){
  
    for(CrazyEights.Value v :CrazyEights.Value.values()){
      
     cards[count]= new CrazyEights(s,v);
    
     count++;
      
          }
              }
     Collections.shuffle(Arrays.asList(cards));
   
   }
     public CrazyEights[] splitArrays(CrazyEights [] arr){
     for(int i =0; i<7; i++ ){
         arr1[i]=cards[i];
         
     }
     return arr1;
     }
 
   
   

          public CrazyEights[] splitArrays1(CrazyEights [] arr){
              int j=7;
     for(int i =0; i<7; i++ ){
         
         arr2[i]=cards[j];
       j++;
     }
     return arr2;
     }
          public CrazyEights[] splitArrays2(CrazyEights [] arr){
              int j=14;
     for(int i =0; i<7; i++ ){
         
         arr4[i]=cards[j];
       j++;
     }
     return arr4;
     }
                public CrazyEights[] splitArrays3(CrazyEights [] arr){
              int j=21;
     for(int i =0; i<7; i++ ){
         
         arr4[i]=cards[j];
       j++;
     }
     return arr4;
     }
                  public CrazyEights[] available(){
              int j=28;
     for(int i=0; i<24; i++ ){
         
         availablecards[i]=cards[j];
       j++;
     }
     return availablecards;
     }
          
          
    private int size;//the size of the grouping
    
    public GroupOfCards(int givenSize)
    {
        size = givenSize;
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public void  showCards()
    {
        generate();
        
    }
    
  //  public void shuffle()
    //{
      //  Collections.shuffle();
    //}

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    
}//end class

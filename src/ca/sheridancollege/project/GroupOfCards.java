/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author Sivagama
 */
public class GroupOfCards
{
   
    //The group of cards, stored in an ArrayList
    private List <CrazyEights> cards;
    private int size;//the size of the grouping
    

    
    
    public GroupOfCards(int givenSize)
    {
        size = givenSize;
    }
    
     public GroupOfCards()
    {
        this.size = 0;
    }
    
   
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public List<CrazyEights> showCards() 
    {
        return getCards();
    }
    
    public void shuffle()
    {
       Collections.shuffle(getCards());
    }

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

    /**
     * @return the cards
     */
    public  List <CrazyEights> getCards() {
        return cards;
    }

    /**
     * @param aCards the cards to set
     */
    public  void setCards(List <CrazyEights> aCards) {
        cards = aCards;
    }
    
}//end class

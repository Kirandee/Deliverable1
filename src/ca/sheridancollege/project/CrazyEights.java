/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author Kiran
 */

public class CrazyEights extends Card { 
 public enum Suits{HEARTS,CLUBS,DIAMONDS,SPADES};
  public  enum Value{ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,KING,JACK,QUEEN};
    
        
        
    private Suits suit;
    
      private Value value;
      public CrazyEights(Suits s, Value v){
     this.suit=s;
     this.value=v;
      }
        

    /**
     * @return the suit
     */
    public Suits getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(Suits suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public Value getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Value value) {
        this.value = value;
    }
    
        @Override
    public String toString(){
    return String.format("Card value is:  %s, Card Suit is :  %s ", value, suit);
    }
    
    
}

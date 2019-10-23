package cardgame;

public class Card {

    String suit;
    int value;
    boolean faceUp;

    public Card(String suit, int value, boolean faceUp){

        this.suit = suit;
        this.value = value;
        this.faceUp = faceUp;
    }


    public void flip(){
        if (faceUp){
            faceUp = false;
        } else if (faceUp = false){
            faceUp = true;
        }

    }

    public String turnedFaceUp(){
        String returnString = "";
        if(faceUp){
            returnString = "Card is already face up!";
        } else if (!faceUp) {
            this.flip();
            returnString = "Card was flipped face up!";
        }
        return returnString;

    }

        @Override
    public String toString(){
        return this.value + " " + this.suit;

        }

}



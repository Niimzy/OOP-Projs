import java.util.Random;

public class Deck {

    Cards[] cards = new Cards[52];
    int counter = 0;

    String[] suits = new String[4];
    {
        suits[0] = "hearts";
        suits[1] = "spades";
        suits[2] = "diamonds";
        suits[3] = "Clubs";

    }

    String[] ranks = {"Ace","2","3","4","5", "6","7","8","9","10", "Jack", "Queen","King" };

    Deck(){
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 13; i++) {
                cards[counter++] = new Cards(suits[j], ranks[i]);
            }
        }
    }

    public void Shuffle(){
        Random random = new Random();
        for (int i=0; i<6000; i++) {
            int randomindex = random.nextInt(52);
            Cards temp = cards[randomindex];
            cards[randomindex] = cards[0];
            cards[0] = temp;
        }


    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        for(int i=0; i<52; i++)
            str.append(cards[i] + "\n");
         return (str.toString());
    }


    public void DistributeCards(){

        for (int i=52; i>0; i-- )
        {

        }

    }



}

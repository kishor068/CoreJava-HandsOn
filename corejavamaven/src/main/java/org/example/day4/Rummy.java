package org.example.day4;
import java.util.*;
public class Rummy {
    List<String> cards=new ArrayList<>();

    public void generateCards(String[] cardNames){
        for(int i=0;i<cardNames.length;i++)
        {
            for (int j=2;j<=10;j++){
                cards.add(cardNames[i]+" "+j);
            }
        }
    }
    public Rummy(){
        generateCards(new String[]{"Spades","Hearts","Diamonds","Clubs"});

    }
    public void distributeCard(int numberOfPlayers){
        Collections.shuffle(cards);
            int k=0;
        for (int i=0;i<numberOfPlayers;i++){
            System.out.println("Player "+(i+1)+":");
            for (int j=0;j<numberOfPlayers;j++){
            System.out.println(cards.get(k++));

            }
            System.out.println("........");
        }

    }
}

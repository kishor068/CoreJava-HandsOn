package org.example.day6;
public class DemoPlayers {
    public static void main(String[] args) {
        TickTockGame obj1=new TickTockGame();
        PlayerOne p1=new PlayerOne(obj1);
        PlayerTwo p2=new PlayerTwo(obj1);

        p1.start();
        p2.start();


    }
}

package com.example.cointoss;

import java.util.Random;

// The Class is a blueprint
public class Coin_Toss {

    public String tossACoin() {
        Random rand = new Random ();
        int toss = Math.abs(rand.nextInt()) % 2;
        if (toss == 1) {
            return "Heads";
        }
        else {
            return "Tails";
        }
    }

    public static void main(String[] args) {
        // Creating a new instance of Coin_toss
        Coin_Toss game = new Coin_Toss();
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
    }
}

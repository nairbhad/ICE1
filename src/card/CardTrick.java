/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * 
 * Modified by: Bhadra Sreeja Nair
 * Student number: 991716665
 * 
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
         Random random = new Random();

        String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1);
             c.setSuit(SUITS[random.nextInt(4)]);
            magicHand[i] = c;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your card value (1-13): ");
        int userValue = scanner.nextInt();
        System.out.print("Enter your card suit (Hearts, Diamonds, Clubs, Spades): ");
        String userSuit = scanner.next();


        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        boolean matchFound = false;
        for (Card card : magicHand) {
            if (card.equals(userCard)) {
                matchFound = true;
                break;
            }
        }

        if (matchFound) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, Your card is not in the magic hand.");
        }

        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");
        magicHand[6] = luckyCard;
    }
    
}
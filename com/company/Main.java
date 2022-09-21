package com.company;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        int points = 0;
        int firstGuess =0;
        int secondGuess=0;
        int thirdGuess=0;

        Scanner input = new Scanner(System.in);
        int randomNum = ThreadLocalRandom.current().nextInt(0, 101);

        System.out.println("A random number between 0 and 100 will be generated and " +
                "you will have 3 guesses");

        System.out.println("Input your first guess: ");
        firstGuess = input.nextInt();

        if (randomNum + 5 == firstGuess || randomNum - 5 == firstGuess) {
            points += 5;
        } else {
            points -= 1;
        }

        System.out.println("Input your second guess: ");
        secondGuess = input.nextInt();

        if (randomNum > secondGuess && (randomNum - secondGuess <=10 ) || randomNum < secondGuess && (secondGuess - randomNum <= 10)) {
            points += 20;
        } else {
            points -= 5;
        }

        System.out.println("Input your third guess: ");
        thirdGuess = input.nextInt();

        if (randomNum > thirdGuess && (randomNum - thirdGuess <=10 ) || randomNum < thirdGuess && (thirdGuess - randomNum <= 10)) {
            points += 20;
        } else {
            points -= 5;
        }


        System.out.println("Your final score is " + points);
        System.out.println("The correct value was " + randomNum);
    }

}
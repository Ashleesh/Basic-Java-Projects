//We are using Math.random() * 100 so we can guess number in the range of 1 to 100

import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to the Number Gussing Game !!");
        System.out.println("Think of a Number between 1 to 100.\n");

        int target = (int) (Math.random() * 100) + 1;
        System.out.println("Please select the difficulty level : ");
        System.out.println("1 Easy (10 Chances)");
        System.out.println("2 Medium (5 Chances)");
        System.out.println("3 Hard (3 Chances)");
        System.out.println("4 Legend (1 Chances)\n");

        System.out.print("Enter Your Choice Number : ");
        int UserN = sc.nextInt();
        int Num1 = 1;
        int Num2 = 2;
        int Num3 = 3;
        int Num4 = 4;

        if (UserN == Num1) {
            System.out.println("\nGreat You Have Selected The Easy Level.\n");

            int totalChances1 = 10;

            for (int i = 1; i < totalChances1; i++) {

                System.out.print("Enter Your Guess : ");
                int UserGuess = sc.nextInt();
                if (UserGuess == target) {

                    System.out.println("Congratulations !! You Gussed The Correct Number.");
                    break;
                } else if (UserGuess < target) {
                    System.out.println("Think Higher");

                } else {
                    System.out.println("Think Lower");

                }
                if (i == totalChances1 -1) {
                    System.out.println("Game Over !!");
                    System.out.println("The Correct Number Was : " + target);
                }
            }

        } else if (UserN == Num2) {
            System.out.println("\nGreat You Have Selected The Medium Level.\n");

            int totalChances2 = 5;

            for (int i = 0; i < totalChances2; i++) {

                System.out.print("Enter Your Guess : ");
                int UserGuess = sc.nextInt();
                if (UserGuess == target) {

                    System.out.println("Congratulations !! You Gussed The Correct Number.");
                    break;
                } else if (UserGuess < target) {
                    System.out.println("Think Higher");

                } else {
                    System.out.println("Think Lower");

                }
                if (i == totalChances2 -1) {
                    System.out.println("Game Over !!");
                    System.out.println("The Correct Number Was : " + target);
                }
            }

        } else if (UserN == Num3) {
            System.out.println("\nGreat You Have Selected The Hard Level.\n");

            int totalChances3 = 3;

            for (int i = 0; i < totalChances3; i++) {

                System.out.print("Enter Your Guess : ");
                int UserGuess = sc.nextInt();
                if (UserGuess == target) {

                    System.out.println("Congratulations !! You Gussed The Correct Number.");
                    break;
                } else if (UserGuess < target) {
                    System.out.println("Think Higher");

                } else {
                    System.out.println("Think Lower");

                }
                if (i == totalChances3 -1) {
                    System.out.println("Game Over !!");
                    System.out.println("The Correct Number Was : " + target);
                }
            }

        } else if (UserN == Num4) {
            System.out.println("\nGreat You Have Selected The Legend Level.\n");
            System.out.print("You Really waaana Do It ??\n");
            System.out.print("Lets Start\n");

            int totalChances4 = 1;

            for (int i = 0; i < totalChances4; i++) {

                System.out.print("Enter Your Guess : ");
                int UserGuess = sc.nextInt();
                if (UserGuess == target) {

                    System.out.println("Congratulations !! Even Developer Never Winned Once");
                    break;
                } else if (UserGuess < target) {
                    System.out.println("Think Higher");

                } else {
                    System.out.println("Think Lower");

                }
                if (i == totalChances4 -1) {
                    System.out.println("Game Over !!");
                    System.out.println("The Correct Number Was : " + target);
                }
            }

        }

    }
}

package com.blashblamingquestions;
import java.util.Scanner;

public class Words {

    public static void main(String[] args) {
         int N = 1000;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line of words seperated by spaces ");
        String userInput = input.nextLine();
        String[] words = userInput.split(" ");
        String nthWord = words[N];

        for(int i = 0; i < nthWord.length();i++) {
            if(nthWord.length()>=N) {
                char nthChar = nthWord.charAt(N);
                System.out.print("The " + N + "th word in the line entered is " + nthWord + "The " + N + "th charecter in the word is " + nthChar);
            }
            if(nthWord.length()<N) {
                    char nthChar2 = nthWord.charAt(nthWord.length()-1);
                    System.out.print("The " + N + "th word in the line entered is " + nthWord + "The " + N + "th charecter in the word is " + nthChar2);
        }
        input.close();
    }

}
}

package Dice.Dice;


import java.util.Arrays;
import java.util.Optional;

public class Chatham2 {

    public void selection(int N) {

        // write your code in Java SE 8
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print("Codility");
            }
            if (i % 3 == 0) {
                System.out.print("Test");
            }
            if (i % 5 == 0) {
                System.out.print("Coders");
            }
        else if(i != 0) {
                System.out.println(i + "\n");
            }
            }
        }


    public static void main(String[] args) {
        Chatham2 ch = new Chatham2();
       ch.selection(24);
    }
}



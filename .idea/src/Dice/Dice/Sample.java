//package Dice.Dice;
//import java.util.Scanner;
//
//import Dice.Dice.SampleDice;
//
//
////
////public class Sample {
////
////    public static String main(String[] args)
////    {
////        final  int LOWEST_DIE_VALUE = 0;
////        final  int HIGHEST_DIE_VALUE = 6;
////
////         String die;
////
////        public String Die()
////        {
////            String[] dieFaces = {"+-------+\r\n|       |\r\n|   o   |\r\n|       |\r\n+-------+",
////                    "+-------+\r\n| o     |\r\n|       |\r\n|     o |\r\n+-------+",
////                    "+-------+\r\n| o     |\r\n|   o   |\r\n|     o |\r\n+-------+",
////                    "+-------+\r\n| o   o |\r\n|       |\r\n| o   o |\r\n+-------+",
////                    "+-------+\r\n| o   o |\r\n|   o   |\r\n| o   o |\r\n+-------+",
////                    "+-------+\r\n| o   o |\r\n| o   o |\r\n| o   o |\r\n+-------+"};
////
////            die = dieFaces[((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE)];
////        }
////
////        public String getDie();
////        {
////            return die;
////        }
////        public class FiveDice
////    {
////        public  void main(String[] args)
////        {
////            Die die1 = new Die();
////            System.out.println(die1.getDie());
////        }
////    }
////    }
////
////}
//
//
// import java.util.Random;
//
//class MainClass {
//    public class Die {
//        private int sides;
//
//        {
//        }
//
//        public void roll() {
//            sides = (int) (Math.random() * 6 + 1);
//        }
//
//        public int getNumDots() {
//            return sides;
//        }
//    }
//}
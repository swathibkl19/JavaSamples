package Dice.Dice;

public class Fibanocci {
    public  Integer fibSeries(Integer number) {

        Integer sum = 0;
        Integer fibNumber = number;

        for (int i = 0; i < number; i++) {
            System.out.println(fibNumber);
            sum += fibNumber;
            fibNumber--;
        }
        System.out.println(sum);
        return fibNumber;
    }
    public static void main(String[] args) {
        Fibanocci fibanocci = new Fibanocci();
        fibanocci.fibSeries(4);
    }
}

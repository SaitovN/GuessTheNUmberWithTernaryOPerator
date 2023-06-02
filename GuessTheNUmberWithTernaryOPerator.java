package academy.devonline.java.basic.section01_setup.section04_setup;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNUmberWithTernaryOPerator {
    public static void main(String[] args) {
        var number = new Random().nextInt(10);
                var user = new Scanner(System.in).nextInt();
        String result= number== user?
                "Congratulations, you guessed the number!":
                "Sorry,but your number is invalid!";
        System.out.println(result);
    }
}

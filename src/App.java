/**
 * Created by AndersWOlsen on 02-09-2016.
 * Opgave 01.2 Bonus - Mindste Tal (Simpel version)
 */

// Skriv en klasse Min med den statiske metode min(double a, double b, double c), der returnerer det mindste tal. Extra Bonus: Skriv metoden uden {} og med kun ét semikolon.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] tal = new double[3];

        for (int i = 0; i < tal.length; i++) {
            tal[i] = input.nextDouble();
        }

        System.out.println(Min.min(tal[0], tal[1], tal[2]));
    }
}

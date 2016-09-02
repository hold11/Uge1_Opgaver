/**
 * Created by AndersWOlsen on 02-09-2016.
 * Opgave 01.2 Bonus - Mindste Tal (Simpel version)
 */

// Opgaven her består i at lave et program, som indlæser 3 tal fra konsollen, og udskriver det mindste af de 3 tal.
// Denne opgave er den samme som 01.3.1, denne her er dog bare lidt mere optimeret

// Vi skal bruge Scanner-klassen for at tage imod input fra brugeren
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // I stedet for 3 variabler, vil vi nu kun have 1 variable, til at holde alle 3 værdier.
        // Dette kaldes en array, og definerer således:
        double[] tal = new double[3]; // 3 angiver at vi vil holde 3 værdier

        // En for loop vil nu indsamle alle værdierne vores array:
        for (int i = 0; i < tal.length; i++) { // tal.length er antallet af værdier i vores array
            tal[i] = input.nextDouble();
        }

        double min = Double.MAX_VALUE;

        // Vi kan nu tjekke alle værdierne mod hinanden:
        for (int i = 0; i < tal.length; i++) {
            if (tal[i] < min)
                min = tal[i];
        }

        // Lad os så se hvad det mindste tal er
        System.out.println(min);
    }
}

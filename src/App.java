/**
 * Created by AndersWOlsen on 02-09-2016.
 * Opgave 01.2 Bonus - Mindste Tal (Simpel version)
 */

// Opgaven her består i at lave et program, som indlæser 3 tal fra konsollen, og udskriver det mindste af de 3 tal.

// Vi skal bruge Scanner-klassen for at tage imod input fra brugeren
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Vi starter med at definere en Scanner til at tage imod input fra brugeren:
        Scanner input = new Scanner(System.in);

        // Vi definerer så 3 variabler til at holde input fra brugeren, og beder om input:
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Vi definerer en minimumsvariable til at holde det mindste tal.
        // Vi sltter variablen til at være det højeste tal en double kan være, for at være sikker på,
        // at a, b og/eller c i hvert fald må være mindre end det.
        double min = Double.MAX_VALUE;

        // Vi tjekker så alle værdierne mod variablen min.
        if (a < min)
            min = a; // Hvis a er mindre end min, så sættes min til værdien a osv.
        if (b < min)
            min = b;
        if (c < min)
            min = c;

        // Lad os så se hvad det mindste tal er
        System.out.println(min);
    }
}

/**
 * Created by AndersWOlsen on 02-09-2016.
 * Opgave 01.2 Bonus - Mindste Tal (Simpel version)
 */

// Skriv en klasse Min med den statiske metode min(double a, double b, double c), der returnerer det mindste tal. Extra Bonus: Skriv metoden uden {} og med kun ét semikolon.

public class Min {
    public static double min (double a, double b, double c) {
        return (((a < b) ? a : b) < c) ?((a < b) ? a : b) : c;
    }
}

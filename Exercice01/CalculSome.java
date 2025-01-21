
import java.util.Scanner;

public class CalculSome {
    public static void main(String[] args) {
        int nombre1, nombre2;

        // Saisie utlisateur
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre 1 : ");
        nombre1 = scanner.nextInt();
        System.out.print("Entrez un autre nombre 2 : ");
        nombre2 = scanner.nextInt();

        // Appel des methodes pour effectuer des calculs
        int some = addition(nombre1, nombre2);

        // Affichage du resultat
        System.out.println("La somme de " + nombre1 + " et " + nombre2 + " est : " + some);

    }

    // Methode pour additionner deux nombres
    public static int addition(int a, int b) {
        return a + b;
    }
}

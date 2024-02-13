package projet_1_Boucle;
import java.util.Scanner;

public class SaisieNombre {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        int nombre;

        // Utilisation d'une boucle do-while pour s'assurer que la réponse convient
        do {
            // Demander à l'utilisateur de saisir un nombre
            System.out.print("Veuillez saisir un nombre entre 0 et 3 inclus : ");

            // Lire le nombre saisi par l'utilisateur
            nombre = scanner.nextInt();

            // Vérifier si le nombre est valide
            if (nombre < 0 || nombre > 3) {
                System.out.println("La réponse n'est pas valide. Veuillez réessayer.");
            }

        } while (nombre < 0 || nombre > 3);

        // Afficher le nombre valide
        System.out.println("Vous avez saisi : " + nombre);

        // Fermer le scanner pour éviter les fuites de ressources
        scanner.close();
    }
}


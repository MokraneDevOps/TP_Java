package projet_1_Boucle;

import java.util.Scanner;

public class SaisieNombre2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        // Création d'un objet Scanner pour lire l'entrée utilisateur
		        Scanner scanner = new Scanner(System.in);

		        int nombre;

		        // Utilisation d'une boucle do-while pour s'assurer que la réponse convient
		        do {
		            // Demander à l'utilisateur de saisir un nombre
		            System.out.print("Veuillez saisir un nombre entre 10 et 20 inclus : ");

		            // Lire le nombre saisi par l'utilisateur
		            nombre = scanner.nextInt();

		            // Vérifier si le nombre est valide et fournir des indications si nécessaire
		            if (nombre < 10) {
		                System.out.println("Plus grand !");
		            } else if (nombre > 20) {
		                System.out.println("Plus petit !");
		            }

		        } while (nombre < 10 || nombre > 20);

		        // Afficher le nombre valide
		        System.out.println("Vous avez saisi : " + nombre);

		        // Fermer le scanner pour éviter les fuites de ressources
		        scanner.close();
		    
		


	}

}

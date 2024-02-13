package projet_1_Boucle;

import java.util.Scanner;

public class AfficherBonjour2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        // Création d'un objet Scanner pour lire l'entrée utilisateur
		        Scanner scanner = new Scanner(System.in);

		        // Demander à l'utilisateur de saisir le nombre d'affichages
		        System.out.print("Veuillez saisir le nombre d'affichages de 'Bonjour': ");

		        // Lire le nombre d'affichages saisi par l'utilisateur
		        int nombreAffichages = scanner.nextInt();

		        // Utilisation d'une boucle for pour afficher "Bonjour" selon le nombre saisi
		        for (int i = 0; i < nombreAffichages; i++) {
		            System.out.println("Bonjour");
		        }

		        // Fermer le scanner pour éviter les fuites de ressources
		        scanner.close();
		    
		


	}

}

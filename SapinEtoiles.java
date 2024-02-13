package projet_1_Boucle;

import java.util.Scanner;

public class SapinEtoiles {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Demander à l'utilisateur de saisir la base du sapin
		        System.out.print("Veuillez saisir la base du sapin : ");
		        int baseSapin = scanner.nextInt();

		        // Demander à l'utilisateur de saisir la hauteur du sapin
		        System.out.print("Veuillez saisir la hauteur du sapin : ");
		        int hauteurSapin = scanner.nextInt();

		        for (int i = 1; i <= hauteurSapin; i++) {
		            // Ajouter des espaces pour le décalage à gauche
		            for (int espace = 1; espace <= hauteurSapin - i; espace++) {
		                System.out.print(" ");
		            }

		            // Afficher les étoiles pour former la pyramide inversée
		            for (int j = 1; j <= 2 * i - 1; j++) {
		                System.out.print("*");
		            }

		            System.out.println();
		        }

		        // Fermer le scanner pour éviter les fuites de ressources
		        scanner.close();
		    
		


	}

}

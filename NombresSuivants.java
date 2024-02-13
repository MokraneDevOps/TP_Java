package projet_1_Boucle;

import java.util.Scanner;

public class NombresSuivants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		 
		        // Création d'un objet Scanner pour lire l'entrée utilisateur
		        Scanner scanner = new Scanner(System.in);

		        // Demander à l'utilisateur de saisir un nombre de départ
		        System.out.print("Veuillez saisir un nombre de départ : ");
		        int nombreDeDepart = scanner.nextInt();

		        // Afficher les dix nombres suivants
		        System.out.println("Les dix nombres suivants sont :");
		        for (int i = 1; i <= 10; i++) {
		            int nombreSuivant = nombreDeDepart + i;
		            System.out.println(nombreSuivant);
		        }

		        // Fermer le scanner pour éviter les fuites de ressources
		        scanner.close();
		    
		


	}

}

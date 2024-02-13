package projet_1_Boucle;

import java.util.Scanner;

public class TableMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		        Scanner scanner = new Scanner(System.in);

		        // Demander à l'utilisateur de saisir un nombre de départ
		        System.out.print("Veuillez saisir un nombre : ");
		        int nombreDeDepart = scanner.nextInt();

		        // Afficher la table de multiplication de ce nombre
		        System.out.println("Table de multiplication de " + nombreDeDepart + " :");
		        for (int i = 1; i <= 10; i++) {
		            int resultat = nombreDeDepart * i;
		            System.out.println(nombreDeDepart + " x " + i + " = " + resultat);
		        }

		        // Fermer le scanner pour éviter les fuites de ressources
		        scanner.close();
		    
		


	}

}

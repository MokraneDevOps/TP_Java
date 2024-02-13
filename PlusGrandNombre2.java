package projet_1_Boucle;

import java.util.Scanner;

public class PlusGrandNombre2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);
		        
		        int nombre;
		        int plusGrandNombre = Integer.MIN_VALUE;
		        int position = 0;

		        // Demander à l'utilisateur de saisir des nombres jusqu'à ce qu'il entre 0
		        do {
		            System.out.print("Entrez un nombre (saisie s'arrête avec 0) : ");
		            nombre = scanner.nextInt();

		            // Vérifier si le nombre est le plus grand et différent de zéro
		            if (nombre != 0 && nombre > plusGrandNombre) {
		                plusGrandNombre = nombre;
		                position = position + 1; // Incrémenter la position seulement si le nombre n'est pas zéro
		            }

		        } while (nombre != 0);

		        // Afficher le plus grand nombre (si différent de zéro)
		        if (plusGrandNombre != Integer.MIN_VALUE) {
		            System.out.println("Le plus grand de ces nombres est : " + plusGrandNombre);
		            System.out.println("Le plus grand nombre a été saisi à la position : " + position);
		        } else {
		            System.out.println("Aucun nombre saisi.");
		        }

		        // Fermer le scanner pour éviter les fuites de ressources
		        scanner.close();
		    
		
	


	}

}

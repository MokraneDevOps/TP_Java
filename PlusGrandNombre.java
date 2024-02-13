package projet_1_Boucle;

import java.util.Scanner;

public class PlusGrandNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        
		        int nombre;
		        int plusGrandNombre = Integer.MIN_VALUE;
		        int position = 0;

		        // Demander à l'utilisateur de saisir 10 nombres
		        for (int i = 1; i <= 10; i++) {
		            System.out.print("Entrez le nombre numéro " + i + " : ");
		            nombre = scanner.nextInt();

		            // Vérifier si le nombre est le plus grand
		            if (nombre > plusGrandNombre) {
		                plusGrandNombre = nombre;
		                position = i;
		            }
		        }

		        // Afficher le plus grand nombre
		        System.out.println("Le plus grand de ces nombres est : " + plusGrandNombre);
		        System.out.println("Le plus grand nombre a été saisi à la position : " + position);

		        // Fermer le scanner pour éviter les fuites de ressources
		        scanner.close();
		    
		


	}

}

package projet_1_Boucle;

import java.util.Scanner;

public class SommeEntiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        // Demander à l'utilisateur de saisir un nombre de départ
		        System.out.print("Veuillez saisir un nombre : ");
		        int nombreDeDepart = scanner.nextInt();

		        // Calculer la somme des entiers jusqu'à ce nombre
		        int somme = 0;
		        for (int i = 1; i <= nombreDeDepart; i++) {
		            somme += i;
		        }

		        // Afficher la somme
		        System.out.println("La somme des entiers jusqu'à " + nombreDeDepart + " est : " + somme);

		        // Fermer le scanner pour éviter les fuites de ressources
		        scanner.close();

	}

}

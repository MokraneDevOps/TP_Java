package projet_1_Boucle;

public class MotifEtoiles2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int nombreLignes = 4; // Vous pouvez ajuster ce nombre selon le motif souhaité

		        for (int i = 1; i <= nombreLignes; i++) {
		            // Ajouter des espaces pour le décalage à gauche
		            for (int espace = 1; espace <= nombreLignes - i; espace++) {
		                System.out.print(" ");
		            }

		            // Afficher les étoiles pour former la pyramide inversée
		            for (int j = 1; j <= 2 * i - 1; j++) {
		                System.out.print("*");
		            }

		            System.out.println();
		        
		    }
		

	}

}


import java.util.Scanner;

public class Guessnumber {
public static void main(String[]args){
		
		int NombreSecret = 46;
		 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entrez un nombre : ");
		int userNumber = scanner.nextInt();
		
	      if (userNumber > NombreSecret) {
	            System.out.println("Le nombre que vous avez saisi est supérieur au nombre secret.");
	        } else if (userNumber < NombreSecret) {
	            System.out.println("Le nombre que vous avez saisi est inférieur au nombre secret.");
	        } else {
	            System.out.println("Bravo ! Vous avez gagné le jeu.");
	        }

	}
}

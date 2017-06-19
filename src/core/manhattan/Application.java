package manhattan;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int templateSelection = 0;
		String alphabet;
		String toAff;
		int mode;

	/*	do {
			System.out.println("Selectionner un template:\n1- Height: 3 Width: 4\n2- Height: 5 Width: 6\n_>");
			templateSelection = sc.nextInt();
		} while (templateSelection != 1 || templateSelection!= 2);
		
			System.out.println("Selectionner un alphabet\n_>");
			alphabet = sc.nextLine();

			do {
				System.out.println("Mode de selection de la chaine a afficher:\n1- Manuel\n2- automatique\n_>");
				mode = sc.nextInt();
			} while (mode != 1 || mode != 2);

			if (mode == 1) {
				System.out.println("Saisir une chaine de caracteres a afficher:\n_>");
				toAff = sc.nextLine();				
			} else {
				//here generate string to aff with faker
			} */
		
		Template1 template = new Template1();
		template.afficherAscii("manhattan");
		
		Template2 template2 = new Template2();
		template2.afficherAscii("manhattan");
	}

}

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
		
		Template1 temp1 = new Template1();
		Template2 temp2 = new Template2();
		

		do {
			System.out.println("Selectionner un template:\n1- Height: 6 Width: 5\n2- Height: 10 Width: 7\n_>");
			templateSelection = sc.nextInt();
		} while (templateSelection != 1 && templateSelection != 2);
		System.out.println("Vous avez choisit le template"+templateSelection+"\n");
		sc.close();
		sc = new Scanner(System.in);
			System.out.println("Selectionner un alphabet\n_>");
			alphabet = sc.nextLine();
			System.out.println("Vous avez choisit les lettres suivantes: "+alphabet+"\n");
			sc.close();
			sc = new Scanner(System.in);

			do {
				System.out.println("Mode de selection de la chaine a afficher:\n1- Manuel\n2- automatique\n_>");
				mode = sc.nextInt();
			} while (mode != 1 && mode != 2);
			System.out.println("Vous avez choisit le mode: "+mode+"\n");
			sc.close();

			if (mode == 1) {
				System.out.println("Saisir une chaine de caracteres a afficher:\n_>");
				toAff = sc.nextLine();
				if (templateSelection == 1) {
					temp1.afficherAscii(toAff);
				} else {
					temp2.afficherAscii(toAff);
				}
			} else {
				//here generate string to aff with faker
				if (templateSelection == 1) {
					temp1.afficherAscii("NOT INPLEMENTED NOW");//toAff);
				} else {
					temp2.afficherAscii("NOT INPLEMENTED NOW");//toAff);
				}
			}
	}

}

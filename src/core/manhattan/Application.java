package manhattan;

import java.util.Scanner;

import com.github.javafaker.Faker;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);

		Faker fake = new Faker(); 
		int templateSelection = 0;
		String alphabet;
		String toAff;
		int mode;
		
		Template1 temp1 = new Template1();
		Template2 temp2 = new Template2();
		

		do {
			System.out.println("Selectionner un template:\n1- Height: 6 Width: 5\n2- Height: 10 Width: 7\n_>");
			templateSelection = sc1.nextInt();
		} while (templateSelection != 1 && templateSelection != 2);
		System.out.println("Vous avez choisit le template"+templateSelection+"\n");
		sc1.close();

		System.out.println("Selectionner un alphabet\n_>");
			alphabet = sc2.nextLine();
			System.out.println("Vous avez choisit les lettres suivantes: "+alphabet+"\n");
			sc2.close();

			do {
				System.out.println("Mode de selection de la chaine a afficher:\n1- Manuel\n2- automatique\n_>");
				mode = sc3.nextInt();
			} while (mode != 1 && mode != 2);
			System.out.println("Vous avez choisit le mode: "+mode+"\n");
			sc3.close();

			if (mode == 1) {
				System.out.println("Saisir une chaine de caracteres a afficher:\n_>");
				toAff = sc4.nextLine();
				if (templateSelection == 1) {
					temp1.afficherAscii(toAff);
				} else {
					temp2.afficherAscii(toAff);
				}
				sc4.close();
			} else {
				//here generate string to aff with faker
				if (templateSelection == 1) {
					
					temp1.afficherAscii(fake.lorem().word());//toAff);
				} else {
					temp2.afficherAscii(fake.lorem().word());//toAff);
				}
			}
	}

}

package manhattan;

import java.util.ArrayList;

public class Template1 {
	
	protected String la1 = "#####";
	protected String la2 = "#   #";
	protected String la3 = "#####";
	protected String la4 = "#   #";
	protected String la5 = "#   #";
	protected String la6 = "#   #";
	
	protected String lh1 = "#   #";
	protected String lh2 = "#   #";
	protected String lh3 = "#####";
	protected String lh4 = "#   #";
	protected String lh5 = "#   #";
	protected String lh6 = "#   #";
	
	protected String le1 = "#####";
	protected String le2 = "#    ";
	protected String le3 = "###  ";
	protected String le4 = "#    ";
	protected String le5 = "#    ";
	protected String le6 = "#####";
	
	protected String lm1 = "#   #";
	protected String lm2 = "## ##";
	protected String lm3 = "# # #";
	protected String lm4 = "#   #";
	protected String lm5 = "#   #";
	protected String lm6 = "#   #";
	
	protected String ln1 = "#   #";
	protected String ln2 = "##  #";
	protected String ln3 = "# # #";
	protected String ln4 = "# # #";
	protected String ln5 = "#  ##";
	protected String ln6 = "#   #";
	
	protected String lt1 = "#####";
	protected String lt2 = "  #  ";
	protected String lt3 = "  #  ";
	protected String lt4 = "  #  ";
	protected String lt5 = "  #  ";
	protected String lt6 = "  #  ";
	
	protected String l_1 = "#####";
	protected String l_2 = "#   #";
	protected String l_3 = "    #";
	protected String l_4 = "  #  ";
	protected String l_5 = "     ";
	protected String l_6 = "  #  ";
	
	protected String lb1 = "#### ";
	protected String lb2 = "#   #";
	protected String lb3 = "#### ";
	protected String lb4 = "#   #";
	protected String lb5 = "#   #";
	protected String lb6 = "#### ";

	protected String lc1 = " ####";
	protected String lc2 = "#    ";
	protected String lc3 = "#    ";
	protected String lc4 = "#    ";
	protected String lc5 = "#    ";
	protected String lc6 = " ####";

	protected String ld1 = "#### ";
	protected String ld2 = "#   #";
	protected String ld3 = "#   #";
	protected String ld4 = "#   #";
	protected String ld5 = "#   #";
	protected String ld6 = "#### ";

	protected String lf1 = "#####";
	protected String lf2 = "#    ";
	protected String lf3 = "###  ";
	protected String lf4 = "#    ";
	protected String lf5 = "#    ";
	protected String lf6 = "#    ";

	protected String lg1 = " ####";
	protected String lg2 = "#    ";
	protected String lg3 = "#    ";
	protected String lg4 = "#  ##";
	protected String lg5 = "#  # ";
	protected String lg6 = " ### ";

	protected String li1 = "#####";
	protected String li2 = "  #  ";
	protected String li3 = "  #  ";
	protected String li4 = "  #  ";
	protected String li5 = "  #  ";
	protected String li6 = "#####";

    protected String lj1 = "#####";
	protected String lj2 = "  #  ";
	protected String lj3 = "  #  ";
	protected String lj4 = "  #  ";
	protected String lj5 = "  #  ";
	protected String lj6 = "###  ";

	protected String lk1 = "#   #";
	protected String lk2 = "#  # ";
	protected String lk3 = "###  ";
	protected String lk4 = "#  # ";
	protected String lk5 = "#   #";
	protected String lk6 = "#   #";

	protected String ll1 = "#    ";
	protected String ll2 = "#    ";
	protected String ll3 = "#    ";
	protected String ll4 = "#    ";
	protected String ll5 = "#    ";
	protected String ll6 = "#####";

	protected String lo1 = " ### ";
	protected String lo2 = "#   #";
	protected String lo3 = "#   #";
	protected String lo4 = "#   #";
	protected String lo5 = "#   #";
	protected String lo6 = " ### ";

	protected String lp1 = "#### ";
	protected String lp2 = "#   #";
	protected String lp3 = "#### ";
	protected String lp4 = "#    ";
	protected String lp5 = "#    ";
	protected String lp6 = "#    ";

	protected String lq1 = " ### ";
	protected String lq2 = "#   #";
	protected String lq3 = "#   #";
	protected String lq4 = "#   #";
	protected String lq5 = "#  ##";
	protected String lq6 = " ####";

	protected String lr1 = "#### ";
	protected String lr2 = "#   #";
	protected String lr3 = "#### ";
	protected String lr4 = "#  # ";
	protected String lr5 = "#   #";
	protected String lr6 = "#   #";

	protected String ls1 = " ####";
	protected String ls2 = "#    ";
	protected String ls3 = " ### ";
	protected String ls4 = "    #";
	protected String ls5 = "    #";
	protected String ls6 = "#####";

	protected String lu1 = "#   #";
	protected String lu2 = "#   #";
	protected String lu3 = "#   #";
	protected String lu4 = "#   #";
	protected String lu5 = "#   #";
	protected String lu6 = " ### ";

	protected String lv1 = "#   #";
	protected String lv2 = "#   #";
	protected String lv3 = "#   #";
	protected String lv4 = " # # ";
	protected String lv5 = "  #  ";
	protected String lv6 = "  #  ";

	protected String lw1 = "#   #";
	protected String lw2 = "#   #";
	protected String lw3 = "#   #";
	protected String lw4 = "# # #";
	protected String lw5 = "## ##";
	protected String lw6 = "#   #";

	protected String lx1 = "#   #";
	protected String lx2 = " # # ";
	protected String lx3 = "  #  ";
	protected String lx4 = " # # ";
	protected String lx5 = "#   #";
	protected String lx6 = "#   #";

	protected String ly1 = "#   #";
	protected String ly2 = "#   #";
	protected String ly3 = " # # ";
	protected String ly4 = "  #  ";
	protected String ly5 = "  #  ";
	protected String ly6 = "  #  ";

	protected String lz1 = "#####";
	protected String lz2 = "    #";
	protected String lz3 = "  #  ";
	protected String lz4 = "#    ";
	protected String lz5 = "#    ";
	protected String lz6 = "#####";
	
	public void afficherAscii(String mot){
		String ligne1 ="";
		String ligne2 ="";
		String ligne3 ="";
		String ligne4 ="";
		String ligne5 ="";
		String ligne6 ="";
		
		 for (int i = 0; i < mot.length(); i++) 
		 {
			 switch (mot.charAt(i)) {
			 	case 'A': 
			 	case 'a':
			 		ligne1 = ligne1 + la1 + " ";
			 		ligne2 = ligne2 + la2 + " ";
			 		ligne3 = ligne3 + la3 + " ";
			 		ligne4 = ligne4 + la4 + " ";
			 		ligne5 = ligne5 + la5 + " ";
			 		ligne6 = ligne6 + la6 + " ";
			 		break;
			 	case 'E':
			 	case 'e':
			 		ligne1 = ligne1 + le1 + " ";
			 		ligne2 = ligne2 + le2 + " ";
			 		ligne3 = ligne3 + le3 + " ";
			 		ligne4 = ligne4 + le4 + " ";
			 		ligne5 = ligne5 + le5 + " ";
			 		ligne6 = ligne6 + le6 + " ";
			 		break;
			 	case 'H':
			 	case 'h':
			 		ligne1 = ligne1 + lh1 + " ";
			 		ligne2 = ligne2 + lh2 + " ";
			 		ligne3 = ligne3 + lh3 + " ";
			 		ligne4 = ligne4 + lh4 + " ";
			 		ligne5 = ligne5 + lh5 + " ";
			 		ligne6 = ligne6 + lh6 + " ";
			 		break;
			 	case 'M':
			 	case 'm':
			 		ligne1 = ligne1 + lm1 + " ";
			 		ligne2 = ligne2 + lm2 + " ";
			 		ligne3 = ligne3 + lm3 + " ";
			 		ligne4 = ligne4 + lm4 + " ";
			 		ligne5 = ligne5 + lm5 + " ";
			 		ligne6 = ligne6 + lm6 + " ";
			 		break;
			 	case 'N':
			 	case 'n':
			 		ligne1 = ligne1 + ln1 + " ";
			 		ligne2 = ligne2 + ln2 + " ";
			 		ligne3 = ligne3 + ln3 + " ";
			 		ligne4 = ligne4 + ln4 + " ";
			 		ligne5 = ligne5 + ln5 + " ";
			 		ligne6 = ligne6 + ln6 + " ";
			 		break;
			 	case 'T':
			 	case 't':
			 		ligne1 = ligne1 + lt1 + " ";
			 		ligne2 = ligne2 + lt2 + " ";
			 		ligne3 = ligne3 + lt3 + " ";
			 		ligne4 = ligne4 + lt4 + " ";
			 		ligne5 = ligne5 + lt5 + " ";
			 		ligne6 = ligne6 + lt6 + " ";
			 		break;
			 	case 'B': 
			 	case 'b':
			 		ligne1 = ligne1 + lb1 + " ";
			 		ligne2 = ligne2 + lb2 + " ";
			 		ligne3 = ligne3 + lb3 + " ";
			 		ligne4 = ligne4 + lb4 + " ";
			 		ligne5 = ligne5 + lb5 + " ";
			 		ligne6 = ligne6 + lb6 + " ";
			 		break;
			 	case 'C': 
			 	case 'c':
			 		ligne1 = ligne1 + lc1 + " ";
			 		ligne2 = ligne2 + lc2 + " ";
			 		ligne3 = ligne3 + lc3 + " ";
			 		ligne4 = ligne4 + lc4 + " ";
			 		ligne5 = ligne5 + lc5 + " ";
			 		ligne6 = ligne6 + lc6 + " ";
			 		break;
			 	case 'D': 
			 	case 'd':
			 		ligne1 = ligne1 + ld1 + " ";
			 		ligne2 = ligne2 + ld2 + " ";
			 		ligne3 = ligne3 + ld3 + " ";
			 		ligne4 = ligne4 + ld4 + " ";
			 		ligne5 = ligne5 + ld5 + " ";
			 		ligne6 = ligne6 + ld6 + " ";
			 		break;
			 	case 'F': 
			 	case 'f':
			 		ligne1 = ligne1 + lf1 + " ";
			 		ligne2 = ligne2 + lf2 + " ";
			 		ligne3 = ligne3 + lf3 + " ";
			 		ligne4 = ligne4 + lf4 + " ";
			 		ligne5 = ligne5 + lf5 + " ";
			 		ligne6 = ligne6 + lf6 + " ";
			 		break;
			 	case 'G': 
			 	case 'g':
			 		ligne1 = ligne1 + lg1 + " ";
			 		ligne2 = ligne2 + lg2 + " ";
			 		ligne3 = ligne3 + lg3 + " ";
			 		ligne4 = ligne4 + lg4 + " ";
			 		ligne5 = ligne5 + lg5 + " ";
			 		ligne6 = ligne6 + lg6 + " ";
			 		break;
			 	case 'I': 
			 	case 'i':
			 		ligne1 = ligne1 + li1 + " ";
			 		ligne2 = ligne2 + li2 + " ";
			 		ligne3 = ligne3 + li3 + " ";
			 		ligne4 = ligne4 + li4 + " ";
			 		ligne5 = ligne5 + li5 + " ";
			 		ligne6 = ligne6 + li6 + " ";
			 		break;
			 	case 'J': 
			 	case 'j':
			 		ligne1 = ligne1 + lj1 + " ";
			 		ligne2 = ligne2 + lj2 + " ";
			 		ligne3 = ligne3 + lj3 + " ";
			 		ligne4 = ligne4 + lj4 + " ";
			 		ligne5 = ligne5 + lj5 + " ";
			 		ligne6 = ligne6 + lj6 + " ";
			 		break;
			 	case 'K': 
			 	case 'k':
			 		ligne1 = ligne1 + lk1 + " ";
			 		ligne2 = ligne2 + lk2 + " ";
			 		ligne3 = ligne3 + lk3 + " ";
			 		ligne4 = ligne4 + lk4 + " ";
			 		ligne5 = ligne5 + lk5 + " ";
			 		ligne6 = ligne6 + lk6 + " ";
			 		break;
			 	case 'L': 
			 	case 'l':
			 		ligne1 = ligne1 + ll1 + " ";
			 		ligne2 = ligne2 + ll2 + " ";
			 		ligne3 = ligne3 + ll3 + " ";
			 		ligne4 = ligne4 + ll4 + " ";
			 		ligne5 = ligne5 + ll5 + " ";
			 		ligne6 = ligne6 + ll6 + " ";
			 		break;
			 	case 'O': 
			 	case 'o':
			 		ligne1 = ligne1 + lo1 + " ";
			 		ligne2 = ligne2 + lo2 + " ";
			 		ligne3 = ligne3 + lo3 + " ";
			 		ligne4 = ligne4 + lo4 + " ";
			 		ligne5 = ligne5 + lo5 + " ";
			 		ligne6 = ligne6 + lo6 + " ";
			 		break;
			 	case 'P': 
			 	case 'p':
			 		ligne1 = ligne1 + lp1 + " ";
			 		ligne2 = ligne2 + lp2 + " ";
			 		ligne3 = ligne3 + lp3 + " ";
			 		ligne4 = ligne4 + lp4 + " ";
			 		ligne5 = ligne5 + lp5 + " ";
			 		ligne6 = ligne6 + lp6 + " ";
			 		break;
			 	case 'Q': 
			 	case 'q':
			 		ligne1 = ligne1 + lq1 + " ";
			 		ligne2 = ligne2 + lq2 + " ";
			 		ligne3 = ligne3 + lq3 + " ";
			 		ligne4 = ligne4 + lq4 + " ";
			 		ligne5 = ligne5 + lq5 + " ";
			 		ligne6 = ligne6 + lq6 + " ";
			 		break;
			 	case 'R': 
			 	case 'r':
			 		ligne1 = ligne1 + lr1 + " ";
			 		ligne2 = ligne2 + lr2 + " ";
			 		ligne3 = ligne3 + lr3 + " ";
			 		ligne4 = ligne4 + lr4 + " ";
			 		ligne5 = ligne5 + lr5 + " ";
			 		ligne6 = ligne6 + lr6 + " ";
			 		break;
			 	case 'S': 
			 	case 's':
			 		ligne1 = ligne1 + ls1 + " ";
			 		ligne2 = ligne2 + ls2 + " ";
			 		ligne3 = ligne3 + ls3 + " ";
			 		ligne4 = ligne4 + ls4 + " ";
			 		ligne5 = ligne5 + ls5 + " ";
			 		ligne6 = ligne6 + ls6 + " ";
			 		break;
			 	case 'U': 
			 	case 'u':
			 		ligne1 = ligne1 + lu1 + " ";
			 		ligne2 = ligne2 + lu2 + " ";
			 		ligne3 = ligne3 + lu3 + " ";
			 		ligne4 = ligne4 + lu4 + " ";
			 		ligne5 = ligne5 + lu5 + " ";
			 		ligne6 = ligne6 + lu6 + " ";
			 		break;
			 	case 'V': 
			 	case 'v':
			 		ligne1 = ligne1 + lv1 + " ";
			 		ligne2 = ligne2 + lv2 + " ";
			 		ligne3 = ligne3 + lv3 + " ";
			 		ligne4 = ligne4 + lv4 + " ";
			 		ligne5 = ligne5 + lv5 + " ";
			 		ligne6 = ligne6 + lv6 + " ";
			 		break;
			 	case 'W': 
			 	case 'w':
			 		ligne1 = ligne1 + lw1 + " ";
			 		ligne2 = ligne2 + lw2 + " ";
			 		ligne3 = ligne3 + lw3 + " ";
			 		ligne4 = ligne4 + lw4 + " ";
			 		ligne5 = ligne5 + lw5 + " ";
			 		ligne6 = ligne6 + lw6 + " ";
			 		break;
			 	case 'X': 
			 	case 'x':
			 		ligne1 = ligne1 + lx1 + " ";
			 		ligne2 = ligne2 + lx2 + " ";
			 		ligne3 = ligne3 + lx3 + " ";
			 		ligne4 = ligne4 + lx4 + " ";
			 		ligne5 = ligne5 + lx5 + " ";
			 		ligne6 = ligne6 + lx6 + " ";
			 		break;
			 	case 'Y': 
			 	case 'y':
			 		ligne1 = ligne1 + ly1 + " ";
			 		ligne2 = ligne2 + ly2 + " ";
			 		ligne3 = ligne3 + ly3 + " ";
			 		ligne4 = ligne4 + ly4 + " ";
			 		ligne5 = ligne5 + ly5 + " ";
			 		ligne6 = ligne6 + ly6 + " ";
			 		break;
			 	case 'Z': 
			 	case 'z':
			 		ligne1 = ligne1 + lz1 + " ";
			 		ligne2 = ligne2 + lz2 + " ";
			 		ligne3 = ligne3 + lz3 + " ";
			 		ligne4 = ligne4 + lz4 + " ";
			 		ligne5 = ligne5 + lz5 + " ";
			 		ligne6 = ligne6 + lz6 + " ";
			 		break;
			default:
				ligne1 = ligne1 + l_1 + " ";
		 		ligne2 = ligne2 + l_2 + " ";
		 		ligne3 = ligne3 + l_3 + " ";
		 		ligne4 = ligne4 + l_4 + " ";
		 		ligne5 = ligne5 + l_5 + " ";
		 		ligne6 = ligne6 + l_6 + " ";
				break;
			}
		}
		 System.out.print(ligne1+"\n");
		 System.out.print(ligne2+"\n");
		 System.out.print(ligne3+"\n");
		 System.out.print(ligne4+"\n");
		 System.out.print(ligne5+"\n");
		 System.out.print(ligne6+"\n");
	}	
}

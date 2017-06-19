package manhattan;

import java.util.ArrayList;

public class Template2 {
	
	protected String la1 = "#######";
	protected String la2 = "#     #";
	protected String la3 = "#     #";
	protected String la4 = "#     #";
	protected String la5 = "#######";
	protected String la6 = "#     #";
	protected String la7 = "#     #";
	protected String la8 = "#     #";
	protected String la9 = "#     #";
	protected String la0 = "#     #";
	
	protected String le1 = "#######";
	protected String le2 = "#      ";
	protected String le3 = "#      ";
	protected String le4 = "#      ";
	protected String le5 = "#####  ";
	protected String le6 = "#      ";
	protected String le7 = "#      ";
	protected String le8 = "#      ";
	protected String le9 = "#      ";
	protected String le0 = "#######";
	
	
	protected String lh1 = "#     #";
	protected String lh2 = "#     #";
	protected String lh3 = "#     #";
	protected String lh4 = "#     #";
	protected String lh5 = "#######";
	protected String lh6 = "#     #";
	protected String lh7 = "#     #";
	protected String lh8 = "#     #";
	protected String lh9 = "#     #";
	protected String lh0 = "#     #";
	
	protected String lm1 = "#     #";
	protected String lm2 = "##   ##";
	protected String lm3 = "# # # #";
	protected String lm4 = "#  #  #";
	protected String lm5 = "#     #";
	protected String lm6 = "#     #";
	protected String lm7 = "#     #";
	protected String lm8 = "#     #";
	protected String lm9 = "#     #";
	protected String lm0 = "#     #";
	
	protected String ln1 = "#     #";
	protected String ln2 = "##    #";
	protected String ln3 = "# #   #";
	protected String ln4 = "# #   #";
	protected String ln5 = "#  #  #";
	protected String ln6 = "#  #  #";
	protected String ln7 = "#   # #";
	protected String ln8 = "#   # #";
	protected String ln9 = "#    ##";
	protected String ln0 = "#     #";
	
	protected String lt1 = "#######";
	protected String lt2 = "   #   ";
	protected String lt3 = "   #   ";
	protected String lt4 = "   #   ";
	protected String lt5 = "   #   ";
	protected String lt6 = "   #   ";
	protected String lt7 = "   #   ";
	protected String lt8 = "   #   ";
	protected String lt9 = "   #   ";
	protected String lt0 = "   #   ";
	
	protected String l_1 = " ##### ";
	protected String l_2 = "#     #";
	protected String l_3 = "#     #";
	protected String l_4 = " #    #";
	protected String l_5 = "     # ";
	protected String l_6 = "    #  ";
	protected String l_7 = "   #   ";
	protected String l_8 = "   #   ";
	protected String l_9 = "       ";
	protected String l_0 = "   #   ";
	
	
	public void afficherAscii(String mot){
		String ligne1 ="";
		String ligne2 ="";
		String ligne3 ="";
		String ligne4 ="";
		String ligne5 ="";
		String ligne6 ="";
		String ligne7 ="";
		String ligne8 ="";
		String ligne9 ="";
		String ligne0 ="";
		
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
			 		ligne7 = ligne7 + la7 + " ";
			 		ligne8 = ligne8 + la8 + " ";
			 		ligne9 = ligne9 + la9 + " ";
			 		ligne0 = ligne0 + la0 + " ";
			 		break;
			 	case 'E':
			 	case 'e':
			 		ligne1 = ligne1 + le1 + " ";
			 		ligne2 = ligne2 + le2 + " ";
			 		ligne3 = ligne3 + le3 + " ";
			 		ligne4 = ligne4 + le4 + " ";
			 		ligne5 = ligne5 + le5 + " ";
			 		ligne6 = ligne6 + le6 + " ";
			 		ligne7 = ligne7 + le7 + " ";
			 		ligne8 = ligne8 + le8 + " ";
			 		ligne9 = ligne9 + le9 + " ";
			 		ligne0 = ligne0 + le0 + " ";
			 		break;
			 	case 'H':
			 	case 'h':
			 		ligne1 = ligne1 + lh1 + " ";
			 		ligne2 = ligne2 + lh2 + " ";
			 		ligne3 = ligne3 + lh3 + " ";
			 		ligne4 = ligne4 + lh4 + " ";
			 		ligne5 = ligne5 + lh5 + " ";
			 		ligne6 = ligne6 + lh6 + " ";
			 		ligne7 = ligne7 + lh7 + " ";
			 		ligne8 = ligne8 + lh8 + " ";
			 		ligne9 = ligne9 + lh9 + " ";
			 		ligne0 = ligne0 + lh0 + " ";
			 		break;
			 	case 'M':
			 	case 'm':			 		
			 		ligne1 = ligne1 + lm1 + " ";
			 		ligne2 = ligne2 + lm2 + " ";
			 		ligne3 = ligne3 + lm3 + " ";
			 		ligne4 = ligne4 + lm4 + " ";
			 		ligne5 = ligne5 + lm5 + " ";
			 		ligne6 = ligne6 + lm6 + " ";
			 		ligne7 = ligne7 + lm7 + " ";
			 		ligne8 = ligne8 + lm8 + " ";
			 		ligne9 = ligne9 + lm9 + " ";
			 		ligne0 = ligne0 + lm0 + " ";
			 		break;
			 	case 'N':
			 	case 'n':
			 		ligne1 = ligne1 + ln1 + " ";
			 		ligne2 = ligne2 + ln2 + " ";
			 		ligne3 = ligne3 + ln3 + " ";
			 		ligne4 = ligne4 + ln4 + " ";
			 		ligne5 = ligne5 + ln5 + " ";
			 		ligne6 = ligne6 + ln6 + " ";
			 		ligne7 = ligne7 + ln7 + " ";
			 		ligne8 = ligne8 + ln8 + " ";
			 		ligne9 = ligne9 + ln9 + " ";
			 		ligne0 = ligne0 + ln0 + " ";
			 		break;
			 	case 'T':
			 	case 't':
			 		ligne1 = ligne1 + lt1 + " ";
			 		ligne2 = ligne2 + lt2 + " ";
			 		ligne3 = ligne3 + lt3 + " ";
			 		ligne4 = ligne4 + lt4 + " ";
			 		ligne5 = ligne5 + lt5 + " ";
			 		ligne6 = ligne6 + lt6 + " ";
			 		ligne7 = ligne7 + lt7 + " ";
			 		ligne8 = ligne8 + lt8 + " ";
			 		ligne9 = ligne9 + lt9 + " ";
			 		ligne0 = ligne0 + lt0 + " ";
			 		break;
			default:
				ligne1 = ligne1 + l_1 + " ";
		 		ligne2 = ligne2 + l_2 + " ";
		 		ligne3 = ligne3 + l_3 + " ";
		 		ligne4 = ligne4 + l_4 + " ";
		 		ligne5 = ligne5 + l_5 + " ";
		 		ligne6 = ligne6 + l_6 + " ";
		 		ligne7 = ligne7 + l_7 + " ";
		 		ligne8 = ligne8 + l_8 + " ";
		 		ligne9 = ligne9 + l_9 + " ";
		 		ligne0 = ligne0 + l_0 + " ";
				break;
			}
			
		}
		 System.out.println(ligne1);
		 System.out.println(ligne2);
		 System.out.println(ligne3);
		 System.out.println(ligne4);
		 System.out.println(ligne5);
		 System.out.println(ligne6);
		 System.out.println(ligne7);
		 System.out.println(ligne8);
		 System.out.println(ligne9);
		 System.out.println(ligne0);
	}	
}


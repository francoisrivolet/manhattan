/**
 * 
 */
package manhattan;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author fanfan
 *
 */
public class Template1Test {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	}
	
	@Test
	public void afficherAsciiTest() {
		
		String mot = "MANHATTAN";
		
		Template1 template = new Template1();
		
		
	    template.afficherAscii(mot);

	    assertEquals( "#   # ##### #   # #   # ##### ##### ##### ##### #   # \n"
		    		+ "## ## #   # ##  # #   # #   #   #     #   #   # ##  # \n"
		    		+ "# # # ##### # # # ##### #####   #     #   ##### # # # \n"
		    		+ "#   # #   # # # # #   # #   #   #     #   #   # # # # \n"
		    		+ "#   # #   # #  ## #   # #   #   #     #   #   # #  ## \n"
		    		+ "#   # #   # #   # #   # #   #   #     #   #   # #   # \n", outContent.toString());

	}
	
	@Test
	public void afficherAsciiTest2() {
		
		String mot = "ManhAtTan";
		
		Template1 template = new Template1();
		
		
	    template.afficherAscii(mot);

	    assertEquals( "#   # ##### #   # #   # ##### ##### ##### ##### #   # \n"
		    		+ "## ## #   # ##  # #   # #   #   #     #   #   # ##  # \n"
		    		+ "# # # ##### # # # ##### #####   #     #   ##### # # # \n"
		    		+ "#   # #   # # # # #   # #   #   #     #   #   # # # # \n"
		    		+ "#   # #   # #  ## #   # #   #   #     #   #   # #  ## \n"
		    		+ "#   # #   # #   # #   # #   #   #     #   #   # #   # \n", outContent.toString());

	}
	
	@Test
	public void afficherAsciiTest3() {
		
		String mot = "E";
		
		Template1 template = new Template1();
		
		
	    template.afficherAscii(mot);

	    assertEquals( "##### \n"
		    		+ "#     \n"
		    		+ "###   \n"
		    		+ "#     \n"
		    		+ "#     \n"
		    		+ "##### \n", outContent.toString());

	}
	
	

}

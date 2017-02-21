package BS.QACinema.dataLayer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import BS.QACinema.dataLayer.film.Classification;


public class ClassificationTest {
	
	Classification cl;

	@Before
	public void setUp() throws Exception {
		cl = Classification.CLASS_18;
	}

	@Test
	public void testGetClassification() {
		String classi = cl.getClassification();
		
		System.out.println(classi);
		
		
		assertEquals("18", classi);
	}

}

package BS.QACinema.dataLayer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import BS.QACinema.dataLayer.film.Media;
import BS.QACinema.dataLayer.film.Media.MediaType;

public class MediaTest {
	
	Media med;

	@Before
	public void setUp() throws Exception {
		med = new Media("http://ourwebsite.com/mediafolder/img001.png", MediaType.IMAGE, 3);
	}

	@Test
	public void testGetURL() {
		String s = med.getUrl();
		System.out.println(s);
		assertEquals("http://ourwebsite.com/mediafolder/img001.png",med.getUrl());
	}
	
	@Test
	public void testGetMediaType() {
		String s = med.getMediaType().toString();
		System.out.println(s);
		assertEquals("IMAGE",s);
	}	
	
	@Test
	public void testGetMediaID() {
		int i = med.getMediaID();
		assertEquals(0,i);
	}
	
	@Test
	public void testGetFilmID() {
		assertEquals(3,med.getFilmID());
	}
	
	@Test
	public void testSetUrl() {
		med.setUrl("database.table");
		assertEquals("database.table",med.getUrl());
	}
	
	@Test
	public void testSetMediaType() {
		med.setMediaType(MediaType.SOUNDCLIP);
		assertEquals(MediaType.SOUNDCLIP,med.getMediaType());
	}
	
		
	

}

package qacinema.data.film;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import qacinema.data.film.Media.MediaType;



public class MediaTest {
	
	Media med;

	@Before
	public void setUp() {
		med = new Media("http://ourwebsite.com/mediafolder/img001.png", MediaType.IMAGE);
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

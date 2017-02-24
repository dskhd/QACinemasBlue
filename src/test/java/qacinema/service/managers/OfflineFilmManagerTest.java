package qacinema.service.managers;

import javax.inject.Inject;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import qacinema.data.film.Actor;
import qacinema.data.film.Film;
import qacinema.data.film.Genre;
import qacinema.data.film.Role;
import qacinema.service.managers.offline.OfflineFilmManager;
import qacinema.testdata.TestData;

public class OfflineFilmManagerTest {
	
	Film film;
	Genre genre;
	List<Genre> gen;
	Role role;
	List<Role> rol;
	Actor actor;
	List<Actor> act;

	@Inject
	private TestData testData;
	private OfflineFilmManager ofm;

	@Before
	public void setUp() {

	}
	
	@Test
	public void testFindBtTitle(){
		
	}

}

package qacinema.service.managers.offline;

import qacinema.testdata.TestData;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import qacinema.annotations.Loggable;
import qacinema.data.cinema.Showing;
import qacinema.data.film.Film;
import qacinema.service.managers.ShowingManager;

/*
 * Created by James Lamkin
 */

@Stateless 
public class OfflineShowingManager implements ShowingManager {
	@Inject
	TestData testdata; 
	
	Collection<Showing> showings = testdata.getShowingMap().values();
	
	@Override
	public List<Showing> allShowings() {
		List<Showing> showings = new ArrayList<>(testdata.getShowingMap().values());
		return showings;
	}

	@Override @Loggable
	public List<Showing> findByHour(String hour) {

		hour = hour.substring(0, 7);
		List<Showing> byHour = new ArrayList<Showing>();
		for (Showing show : showings) {
			if (show.getDateTime().substring(0, 7) == hour) {
				byHour.add(show);
			}
		}
		return byHour;
	}

	@Override @Loggable
	public List<Showing> findByDay(String date) {

		date = date.substring(0, 6);
		List<Showing> byDate = new ArrayList<Showing>();
		for (Showing show : showings) {
			if (show.getDateTime().substring(0, 6) == date) {
				byDate.add(show);
			}
		}
		return byDate;
	}

	@Override
	public List<Showing> findByFilm(Film film) {

		List<Showing> filmShowings = new ArrayList<Showing>();
		for (Showing show : showings) {
			if (show.getFilm() == film) {
				filmShowings.add(show);
			}
		}

		return filmShowings;
	}


	@Override
	public List<Showing> byExperience(String experience) {


		List<Showing> byExperience = new ArrayList<Showing>();
		for (Showing show : showings) {
			if (show.getExperience() == experience) {
				byExperience.add(show);
			}
		}
		return byExperience;
	}

	@Override
	public List<Showing> byAccessabillity(String accessability) {

		List<Showing> byAccessability = new ArrayList<Showing>();
	
		for (Showing show : showings) {
			if (show.getAccessability() == accessability) {
				byAccessability.add(show);
			}
		}
		return byAccessability;
	}

}

package qa_cinema.service.managers.offline;

import qa_cinema.test_data.TestData;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import qa_cinema.data.cinema.Showing;
import qa_cinema.data.film.Film;
import qa_cinema.service.managers.ShowingManager;
import qa_cinema.logger.*;

/*
 * Created by James Lamkin
 */

@Stateless 
public class OfflineShowingManager implements ShowingManager {
	@Inject
	TestData testdata;
	
	@Override
	public List<Showing> allShowings() {
		List<Showing> showings = testdata.getShowingList();
		return showings;
	}

	@Override @Loggable
	public List<Showing> findByHour(String hour) {

		hour = hour.substring(0, 7);
		List<Showing> showings = testdata.getShowingList();
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
		List<Showing> showings = testdata.getShowingList();
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

		List<Showing> showings = testdata.getShowingList();
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


		List<Showing> showings = testdata.getShowingList();
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

		List<Showing> showings = testdata.getShowingList();
		List<Showing> byAccessability = new ArrayList<Showing>();
	
		for (Showing show : showings) {
			if (show.getAccessability() == accessability) {
				byAccessability.add(show);
			}
		}
		return byAccessability;
	}

}

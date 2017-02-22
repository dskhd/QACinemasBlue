package qa_cinema.service.managers.offline;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import qa_cinema.annotations.Loggable;
import qa_cinema.data.film.Film;
import qa_cinema.data.film.Media;
import qa_cinema.data.film.Media.MediaType;
import qa_cinema.service.managers.MediaManager;
import qa_cinema.test_data.TestData;

@Loggable @Default @Stateless
public class OfflineMediaManager implements MediaManager {

	@Inject private TestData test;
	
	@Override
	public List<Media> findImagesByFilm(Film film) {
		List<Media> medListTrimmed = new ArrayList<>();
		List<Media> medList = test.getMediaByFilm(film);
		for (Media m : medList){
			if (m.getMediaType() == MediaType.IMAGE){
				medListTrimmed.add(m);
			}
		}
		
		return medListTrimmed; 
		
	}

	@Override
	public List<Media> findVideosByFilm(Film film) {
		List<Media> medListTrimmed = new ArrayList<>();
		List<Media> medList = test.getMediaByFilm(film);
		for (Media m : medList){
			if (m.getMediaType() == MediaType.VIDEO){
				medListTrimmed.add(m);
			}
		}
		
		return medListTrimmed; 
	}

	@Override
	public List<Media> findSoundClipsByFilm(Film film) {
		List<Media> medListTrimmed = new ArrayList<>();
		List<Media> medList = test.getMediaByFilm(film);
		for (Media m : medList){
			if (m.getMediaType() == MediaType.SOUNDCLIP){
				medListTrimmed.add(m);
			}
		}
		
		return medListTrimmed; 
	}

	@Override
	public Media findFilmPoster(Film film) {
		Media poster;
		List<Media> medList = test.getMediaByFilm(film);
		for (Media m : medList){
			if (m.getMediaType() == MediaType.POSTER){
				poster = m;
			}
		}
		
		return poster; 
	}

	@Override
	public Media findFilmPosterByName(String name) {
		Media poster;
		List<Media> medList = test.getMediaByFilmName(name);
		for (Media m : medList){
			if (m.getMediaType() == MediaType.POSTER){
				poster = m;
			}
		}
		
		return poster; 
	}

}

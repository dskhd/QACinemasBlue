package qacinema.service.managers.offline;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import qacinema.annotations.Loggable;
import qacinema.data.film.Film;
import qacinema.data.film.Media;
import qacinema.data.film.Media.MediaType;
import qacinema.service.managers.MediaManager;
import qacinema.test_data.TestData;

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

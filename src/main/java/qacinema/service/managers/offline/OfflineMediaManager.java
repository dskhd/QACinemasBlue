package qacinema.service.managers.offline;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import qacinema.annotations.Loggable;
import qacinema.data.film.Film;
import qacinema.data.film.Media;
import qacinema.data.film.MediaType;
import qacinema.service.managers.MediaManager;
import qacinema.testdata.TestData;

@Loggable @Default @Stateless
public class OfflineMediaManager implements MediaManager {

	@Inject private TestData test;
	
	@Override
	public List<Media> findAllMediaByFilm(Film film) {
		Collection<Film> filmList = test.getFilmMap().values();
		List<Media> mediaList = new ArrayList<>();
		for (Film eachFilm : filmList){
			if (eachFilm == film){
				mediaList = eachFilm.getMedia();
			}	
		}
		return mediaList;
	}
	
	@Override
	public List<Media> findImagesByFilm(Film film) {
		List<Media> mediaList = findAllMediaByFilm(film);
		
		List<Media> mediaListTrimmed = new ArrayList<>();
		for (Media m : mediaList){
			if (m.getMediaType() == MediaType.IMAGE){
				mediaListTrimmed.add(m);
			}
		}
		
		return mediaListTrimmed; 
		
	}

	

	@Override
	public List<Media> findVideosByFilm(Film film) {
		List<Media> mediaList = findAllMediaByFilm(film);
		
		List<Media> mediaListTrimmed = new ArrayList<>();
		for (Media m : mediaList){
			if (m.getMediaType() == MediaType.VIDEO){
				mediaListTrimmed.add(m);
			}
		}
		
		return mediaListTrimmed; 
	}

	@Override
	public List<Media> findSoundClipsByFilm(Film film) {
		List<Media> mediaList = findAllMediaByFilm(film);
		
		List<Media> mediaListTrimmed = new ArrayList<>();
		for (Media m : mediaList){
			if (m.getMediaType() == MediaType.SOUNDCLIP){
				mediaListTrimmed.add(m);
			}
		}
		
		return mediaListTrimmed;  
	}

	@Override
	public Media findFilmPoster(Film film) {
		List<Media> mediaList = findAllMediaByFilm(film);
		
		Media filmPoster = new Media();
		for (Media m : mediaList){
			if (m.getMediaType() == MediaType.POSTER){
				filmPoster = m;
			}
		}
		
		return filmPoster; 
	}

	@Override
	public Media findFilmPosterByName(String name) {
		Film film = null;
		Collection<Film> filmList = test.getFilmMap().values();
		for (Film eachFilm : filmList){
			if (eachFilm.getTitle()==name){
				film = eachFilm;
			}
		}
		List<Media> mediaList = findAllMediaByFilm(film);
		
		Media filmPoster = new Media();
		for (Media m : mediaList){
			if (m.getMediaType() == MediaType.POSTER){
				filmPoster = m;
			}
		}
		
		return filmPoster; 
	}

}

package qacinema.service.managers.online;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import qacinema.data.film.Film;
import qacinema.data.film.Media;
import qacinema.data.film.MediaType;
import qacinema.service.managers.MediaManager;

public class OnlineMediaManager implements MediaManager{
	
	private EntityManager entityManager;


	@Override
	public List<Media> findAllMediaByFilm(Film film) {
		String filmID = film.getFilmId();		
		TypedQuery<Media> query =
				entityManager.createNamedQuery(
				Media.FIND_MEDIA_BY_FILM_ID, Media.class);
				query.setParameter("filmID", filmID);
				return query.getResultList();

	}

	@Override
	public List<Media> findImagesByFilm(Film film) {
		List<Media> mediaList = findAllMediaByFilm(film);
		List<Media> imgList = new ArrayList<>();
		for (Media m : mediaList){
			if (m.getMediaType() == MediaType.IMAGE){
				imgList.add(m);
			}
		}
		return imgList;
	}

	@Override
	public List<Media> findVideosByFilm(Film film) {
		List<Media> mediaList = findAllMediaByFilm(film);
		List<Media> vidList = new ArrayList<>();
		for (Media m : mediaList){
			if (m.getMediaType() == MediaType.VIDEO){
				vidList.add(m);
			}
		}
		return vidList;
	}

	@Override
	public List<Media> findThumbnailByFilm(Film film) {
		List<Media> mediaList = findAllMediaByFilm(film);
		List<Media> thumbList = new ArrayList<>();
		for (Media m : mediaList){
			if (m.getMediaType() == MediaType.THUMBNAIL){
				thumbList.add(m);
			}
		}
		return thumbList;
	}

	@Override
	public Media findFilmPoster(Film film) {
		List<Media> mediaList = findAllMediaByFilm(film);
		Media poster = null;
		for (Media m : mediaList){
			if (m.getMediaType() == MediaType.POSTER){
				poster = m;
			}
		}
		return poster;
	}

	@Override
	public List<Media> findAllMediaByName(String name) {		
		
		TypedQuery<Media> query =
				entityManager.createNamedQuery(
				Media.FIND_MEDIA_BY_FILM_NAME, Media.class);
				query.setParameter("name", name);
				return query.getResultList();

	}
	
	public Media findFilmPosterByName(String name) {
		List<Media> mediaList = findAllMediaByName(name);
		Media poster = null;
		for (Media m : mediaList){
			if (m.getMediaType() == MediaType.POSTER){
				poster = m;
			}
		}
		return poster;
	}

}

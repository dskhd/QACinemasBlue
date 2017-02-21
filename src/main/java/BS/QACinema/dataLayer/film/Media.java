package BS.QACinema.dataLayer.film;

public class Media {
	
	private int mediaID;
	private String url;
	public enum MediaType{IMAGE,VIDEO,SOUNDCLIP};
	private MediaType mediaType;
	private int filmID;
	
	
	
	public Media(String url, MediaType mediaType, int filmID) {
		super();
		this.url = url;
		this.mediaType = mediaType;
		this.filmID = filmID;
	}
	
	public int getMediaID() {
		return mediaID;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public MediaType getMediaType() {
		return mediaType;
	}
	public void setMediaType(MediaType mediaType) {
		this.mediaType = mediaType;
	}
	public int getFilmID() {
		return filmID;
	}

	
	
	
	

}

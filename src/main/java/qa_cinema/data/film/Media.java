package qa_cinema.data.film;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity @Table
public class Media {
	
	@NotNull
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable = false, unique = true)
	private int mediaID;
	
	@NotNull
	@Column (nullable = false)
	private String url;
	
	public enum MediaType{IMAGE,VIDEO,SOUNDCLIP};
	
	@NotNull
	@Column (nullable = false)
	private MediaType mediaType;
	
	@NotNull
	@Column (nullable = false)
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

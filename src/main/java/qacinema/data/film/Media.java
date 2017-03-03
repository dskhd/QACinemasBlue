package qacinema.data.film;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "media")
@NamedQueries({
		@NamedQuery(query = "SELECT m FROM Film f JOIN f.media m WHERE f.filmId=:filmId", name ="Media.FIND_MEDIA_BY_FILM_ID"),
		@NamedQuery(query = "SELECT m FROM Film f JOIN f.media m WHERE f.title=:name", name ="Media.FIND_MEDIA_BY_FILM_NAME")
	})
public class Media {
	
	public static final String FIND_MEDIA_BY_FILM_ID= "Media.FIND_MEDIA_BY_FILM_ID";
	public static final String FIND_MEDIA_BY_FILM_NAME= "Media.FIND_MEDIA_BY_FILM_NAME";

	@NotNull
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, unique = true)
	private int mediaID;

	@NotNull
	@Column(nullable = false)
	private String url;

	@NotNull
	@Column(nullable = false)
	private MediaType mediaType;
	
	@ManyToOne
	@JoinColumn(name="filmID", nullable=false)
	@Column
	private int filmId;

	public Media() {
		this.url = "N/a";
		this.mediaType = MediaType.ERROR;
		this.filmId = -1;
	}

	public Media(String url, MediaType mediaType) {
		this.url = url;
		this.mediaType = mediaType;
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

}

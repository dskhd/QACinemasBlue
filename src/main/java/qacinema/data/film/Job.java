package qacinema.data.film;

public enum Job {
	
	ACTOR("Actor"), VOICE("Voice"), DIRECTOR("Director"), PRODUCER("Producer");
	
	private final String job;
	
	private Job(String job){
		this.job = job;
	}

	public String getJob() {
		return this.job;
	}
}


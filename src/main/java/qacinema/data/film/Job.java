package qacinema.data.film;

public enum Job {
	
	ACTOR("Actor"), VOICE("Voice"), DIRECTOR("Director"), PRODUCER("Producer");
	
	private final String jobTitle;
	
	private Job(String job){
		this.jobTitle = job;
	}

	public String getJob() {
		return this.jobTitle;
	}
}


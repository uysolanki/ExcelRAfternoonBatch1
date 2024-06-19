package day28collectionday3;

public class Skill {
	private String frontend;
	private String backend;
	private String database;
	
	public Skill() {}
	public Skill(String frontend, String backend, String database) {
		this.frontend = frontend;
		this.backend = backend;
		this.database = database;
	}
	public String getFrontend() {
		return frontend;
	}
	public void setFrontend(String frontend) {
		this.frontend = frontend;
	}
	public String getBackend() {
		return backend;
	}
	public void setBackend(String backend) {
		this.backend = backend;
	}
	public String getDatabase() {
		return database;
	}
	public void setDatabase(String database) {
		this.database = database;
	}
	@Override
	public String toString() {
		return "Skill [frontend=" + frontend + ", backend=" + backend + ", database=" + database + "]";
	}
	
	
	
}

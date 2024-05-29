package day22solid.scp.solution;

public class Resume {
	private String candidateName;
	private String email;
	private long mobileNumber;
	private String technology;
	private int experience;
	private int graduationYear;
	
	public Resume(String candidateName, String email, long mobileNumber, String technology, int experience, int graduationYear) {
		this.candidateName = candidateName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.technology = technology;
		this.experience = experience;
		this.graduationYear = graduationYear;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(int graduationYear) {
		this.graduationYear = graduationYear;
	}

	@Override
	public String toString() {
		return "Resume [candidateName=" + candidateName + ", email=" + email + ", mobileNumber=" + mobileNumber
				+ ", technology=" + technology + ", experience=" + experience + ", graduationYear=" + graduationYear
				+ "]";
	}

	
	
	
	
	
}

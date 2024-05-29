package day22solid.scp.problem;

public class Resume {

	private String candidateName;
	private String email;
	private long mobileNumber;
	private String technology;
	private int experience;
	private String qualification;
	
	private Resume resumes[];

	public Resume() {}
	public Resume(String candidateName, String email, long mobileNumber, String technology, int experience) {
		this.candidateName = candidateName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.technology = technology;
		this.experience = experience;
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


	@Override
	public String toString() {
		return "Resume [candidateName=" + candidateName + ", email=" + email + ", mobileNumber=" + mobileNumber
				+ ", technology=" + technology + ", experience=" + experience + "]";
	}


	public void createResumeRepository()
	{
		resumes=new Resume[5];
		resumes[0]=new Resume("Alice","alice@gmail.com",9890111111L,"FSD", 3);
		resumes[1]=new Resume("Ben","ben@gmail.com",9890222222L,"FSD", 4);
		resumes[2]=new Resume("Chris","chris@gmail.com",9890333333L,"Java", 5);
		resumes[3]=new Resume("David","david@gmail.com",9890444444L,"Java", 6);
		resumes[4]=new Resume("Elcid","elcid@gmail.com",9890555555L,"React", 7);
	}
	
	public void filterByTechnology(String tech)
	{
		for(Resume r:this.resumes)
		{
			if(r.getTechnology().equals(tech))
			System.out.println(r);
		}
	}
	
	public void filterByTeExperience(int exp)
	{
		for(Resume r:this.resumes)
		{
			if(r.getExperience()>=exp)
			System.out.println(r);
		}
	}
	
	
	
}

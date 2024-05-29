package day22solid.scp.solution;

public class ResumeRepository {

	private Resume resumes[];

	public ResumeRepository(Resume[] resumes) {
		this.resumes = resumes;
	}
	
	public void filterByTechnology(String tech)
	{
		for(Resume r:this.resumes)
		{
			if(r.getTechnology().equals(tech))
			System.out.println(r.getEmail());
		}
	}
	
	public void filterByExperience(int exp)
	{
		for(Resume r:this.resumes)
		{
			if(r.getExperience()>=exp)
			System.out.println(r.getEmail());
		}
	}
	
	public void filterByGraduationYear(int year)
	{
		for(Resume r:this.resumes)
		{
			if(r.getGraduationYear()==year)
			System.out.println(r.getEmail());
		}
	}
	
}

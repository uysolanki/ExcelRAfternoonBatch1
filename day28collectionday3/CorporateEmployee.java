package day28collectionday3;

import java.util.List;

public class CorporateEmployee {

	private Employee emp;
	private List<Skill> skills;
	
	public CorporateEmployee() {}
	public CorporateEmployee(Employee emp, List<Skill> skills) {
		this.emp = emp;
		this.skills = skills;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public List<Skill> getSkills() {
		return skills;
	}
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "CorporateEmployee [emp=" + emp + ", skills=" + skills + "]";
	}
	
	
	
	
}
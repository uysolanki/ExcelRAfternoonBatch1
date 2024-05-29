package day22solid.scp.solution;

import java.util.Scanner;


public class JobPortalDriver {

	public static void main(String[] args) {
		Resume resumes[]=new Resume[5];
		resumes[0]=new Resume("Alice","alice@gmail.com",9890111111L,"FSD", 3, 2013);
		resumes[1]=new Resume("Ben","ben@gmail.com",9890222222L,"FSD", 4,2017);
		resumes[2]=new Resume("Chris","chris@gmail.com",9890333333L,"Java", 5,2016);
		resumes[3]=new Resume("David","david@gmail.com",9890444444L,"Java", 6,2017);
		resumes[4]=new Resume("Elcid","elcid@gmail.com",9890555555L,"React", 7,2012);
		
		Scanner sc=new Scanner(System.in);
		
		ResumeRepository shinedotcom=new ResumeRepository(resumes);
		System.out.println("Please enter technology to search");
		String tech=sc.next();
		shinedotcom.filterByTechnology(tech);
		
		System.out.println("Please enter years of Exp");
		int exp=sc.nextInt();
		shinedotcom.filterByExperience(exp);
		
		System.out.println("Please enter years of Graduation");
		int gyear=sc.nextInt();
		shinedotcom.filterByGraduationYear(gyear);

	}

}

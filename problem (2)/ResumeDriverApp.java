package day22solid.scp.problem;

import java.util.Scanner;

public class ResumeDriverApp {

	public static void main(String[] args) {
		Resume r=new Resume();
		r.createResumeRepository();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter technology to search");
		String tech=sc.next();
		r.filterByTechnology(tech);
		
		System.out.println("Please enter years of Exp");
		int exp=sc.nextInt();
		r.filterByTeExperience(exp);

	}

}

package day31collectionday6;

import day27collectionday2.Address;

public class Player //implements Comparable<Player>
{

	private int pno;
	private String pname;
	private int age;
	private String house;
	
	
	public Player() {}


	public Player(int pno, String pname, int age, String house) {
		this.pno = pno;
		this.pname = pname;
		this.age = age;
		this.house = house;
	}


	public int getPno() {
		return pno;
	}


	public void setPno(int pno) {
		this.pno = pno;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getHouse() {
		return house;
	}


	public void setHouse(String house) {
		this.house = house;
	}


	@Override
	public String toString() {
		return "Player [pno=" + pno + ", pname=" + pname + ", age=" + age + ", house=" + house + "]";
	}
	
		
	
}

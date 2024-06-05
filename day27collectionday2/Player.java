package day27collectionday2;

public class Player {

	private int pno;
	private String pname;
	private int innings;
	private int runs;
	private Address location;
	
	public Player() {}
	
	public Player(int pno, String pname, int innings, int runs) {
		this.pno = pno;
		this.pname = pname;
		this.innings = innings;
		this.runs = runs;
	}
	public Player(int pno, String pname, int innings, int runs, Address location) {
		this.pno = pno;
		this.pname = pname;
		this.innings = innings;
		this.runs = runs;
		this.location = location;
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
	public int getInnings() {
		return innings;
	}
	public void setInnings(int innings) {
		this.innings = innings;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public Address getLocation() {
		return location;
	}
	public void setLocation(Address location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Player [pno=" + pno + ", pname=" + pname + ", innings=" + innings + ", runs=" + runs + ", location="
				+ location + "]";
	}
	
	
	
}

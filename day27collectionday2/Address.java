package day27collectionday2;

import java.util.ArrayList;
import java.util.Arrays;

public class Address {
	private int houseno;
    private String area;
    private int pincode;
    private ArrayList<String> landmarks;
    public Address() {}
    
	public Address(int houseno, String area, int pincode) {
		this.houseno = houseno;
		this.area = area;
		this.pincode = pincode;
	}
	
	public Address(int houseno, String area, int pincode,ArrayList<String> landmarks) {
		this.houseno = houseno;
		this.area = area;
		this.pincode = pincode;
		this.landmarks=landmarks;
	}

	public int getHouseno() {
		return houseno;
	}

	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public ArrayList<String> getLandmarks() {
		return landmarks;
	}

	public void setLandmarks(ArrayList<String> landmarks) {
		this.landmarks = landmarks;
	}

	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", area=" + area + ", pincode=" + pincode + ", landmarks=" + landmarks
				+ "]";
	}

	
	
    
    
}

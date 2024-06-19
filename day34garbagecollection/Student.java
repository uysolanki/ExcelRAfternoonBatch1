package day34garbagecollection;

import java.beans.Transient;
import java.io.Serializable;

public class Student {
		int rno;
		String sname;
		
		
		public Student()
		{
			rno=1;
			sname="Alice";
			System.out.println("I am being initialized");
		}
		
		public Student(int rno, String sname)
		{
			this.rno=rno;
			this.sname=sname;
			System.out.println("I am being initialized");
		}
		
		@Override
		protected void finalize() throws Throwable {
		System.out.println("I am getting Destroyed");
		}
		
		
		
}

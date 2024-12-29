package com.main.beans;

public class SpringBean {
	private int studentid;
	private String studenName;
	@Override
	public String toString() {
		return "SpringBean [studentid=" + studentid + ", studenName=" + studenName + "]";
	}

	
	public SpringBean(int studentid, String studenName) {
		this.studentid = studentid;
		this.studenName = studenName;
	}
	public SpringBean() {
		// TODO Auto-generated constructor stub
	}
	//veracity softaware pvt lmt
	public void greet() {
		System.out.println("Hello Spring");
	}


	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}


	public void setStudenName(String studenName) {
		this.studenName = studenName;
	}
}

package com.java.inheritance;

public class Subject_Score {
	private String name;
	private String classroom;
	protected String sub1;
	protected String sub2;
	protected String sub3;
	protected String sub4;
	protected double s1;
	protected double s2;
	protected double s3;
	protected double s4;
	protected String review;
	
	public Subject_Score(String sub1, String sub2, String sub3, String sub4) {
		
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
	}

	public Subject_Score(double s1, double s2, double s3, double s4) {
		this("代数","英语","语文","政治");
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
	}
	
	public double getSum() {
		return s1+s2+s3+s4;
	}
	
	public double getAverage() {
		return (s1+s2+s3+s4)/4;
	}
	public String setRemark(String review) {
		return this.review=review;
		
	}
    public String getRemark(String review) {
    	return review;
    }

	
}

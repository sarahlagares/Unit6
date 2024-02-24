package com.coderscampus.lesson1;

public class Teacher {
	// properties
	private String classes;
	private String levelOfEducation;
	protected int totalNumberOfMarkedPapers;
	
	protected void markPapers () {
		System.out.println("I'm a teacher and I'm now marking papers");
	}

	private void giveARaise() {
		System.out.println("Teacher Gets a raise!");
	}

	private void teach() {
		System.out.println("I'm a teacher and I am now teaching");
	}
	
	public void teach (String teacherName, int age) {
		System.out.println("I'm a teacher called " + teacherName + " and I am now teaching");
	}

	public void teach (int age) {
		System.out.println("I'm a " + age + " year old teacher and I am now teaching");
	}
	
	// constructor
	public Teacher() {
		this.classes = "No classes assighned";
		this.levelOfEducation = "No education assighned";
	}

	// getters and setters
	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public String getLevelOfEducation() {
		return levelOfEducation;
	}

	public void setLevelOfEducation(String levelOfEducation) {
		this.levelOfEducation = levelOfEducation;
	}

}
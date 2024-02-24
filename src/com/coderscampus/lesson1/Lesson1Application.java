package com.coderscampus.lesson1;

import com.coderscampus.lesson1.compsci.CompSciTeacher;
import com.coderscampus.lesson1.phys.PhysicsTeacher;
import com.coderscampus.lesson1.qphy.QuantumPhysicsTeacher;


public class Lesson1Application {

	public static void main(String[] args) {
		PackageAccessModifierExample example = new PackageAccessModifierExample();
		System.out.println(example.someValue);
		System.out.println("----");

		Teacher physicsTeacher = new PhysicsTeacher();

		// PhysicsTeacher castedPhysicsTeacher = (PhysicsTeacher)physicsTeacher; -->
		// verbose version part 1
		// castedPhysicsTeacher.teach("Sarah Lagares"); --> verbose version part 2
		// Do casting like below. Example above is verbose an for example

		System.out.println(physicsTeacher.getClasses());
		System.out.println(physicsTeacher.getLevelOfEducation());
		// This is how you cast variable from a child class on top of a parent class
		((PhysicsTeacher) physicsTeacher).teach("Sarah Lagares"); // --> cast like this
		((PhysicsTeacher) physicsTeacher).markPapers();
		System.out.println("----");

		CompSciTeacher compSciTeacher = new CompSciTeacher();
		System.out.println(compSciTeacher.getClasses());
		System.out.println(compSciTeacher.getLevelOfEducation());
		compSciTeacher.teach("Sarah Lagares", 23);
		System.out.println("----");

		QuantumPhysicsTeacher quantumTeacher = new QuantumPhysicsTeacher();
		System.out.println(quantumTeacher.getClasses());
		System.out.println(quantumTeacher.getLevelOfEducation());
		quantumTeacher.teach();
		System.out.println("----");
	}

}

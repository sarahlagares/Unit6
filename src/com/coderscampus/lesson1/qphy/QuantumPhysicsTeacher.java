package com.coderscampus.lesson1.qphy;

import com.coderscampus.lesson1.phys.PhysicsTeacher;

public class QuantumPhysicsTeacher extends PhysicsTeacher{
	
	public QuantumPhysicsTeacher () {
		System.out.println("Inside the QuantumOhysicsTeacher constructor");
		this.setClasses("QPHY 101, QPHY 201");
		this.setLevelOfEducation("PhD");
	}
	
	public void teach () {
		System.out.println("I am a quantum physics teacher, and I'm now in a super-position");
	}

}

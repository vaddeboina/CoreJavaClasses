package com.learn;

import com.learn.interfaces.Animal;

public class AnimalFactory {
	
	public Animal create(String animalName) {
		if(!animalName.isEmpty()) {
			if(animalName.equalsIgnoreCase("elephant"))
				return new Elephant();
			else if(animalName.equalsIgnoreCase("dog"))
				return new Dog();
		}
		return null;
	}
}

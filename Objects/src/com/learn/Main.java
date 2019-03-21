package com.learn;

import com.learn.interfaces.Animal;

public class Main {

	public static void main(String[] args) {
		//First way
		Elephant elephant = new Elephant();
		String sound = elephant.sound();
		System.out.println(sound);
		
		
		//Second way
		Animal animal_elephant = new Elephant();
		System.out.println(animal_elephant.sound());
		
		Animal animal_dog = new Dog();
		System.out.println(animal_dog.sound());
		
		//Third Way - Factory pattern
		AnimalFactory animalFactory = new AnimalFactory();
		Animal dog = animalFactory.create("dog");
		
		Animal elephant3 = animalFactory.create("elephanT");
	}

}

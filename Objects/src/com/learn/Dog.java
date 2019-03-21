package com.learn;

import com.learn.interfaces.Animal;

public class Dog implements Animal {
	private String name;
	private String sound = "Bark";
	private int weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String sound() {
		return sound;
	}

}

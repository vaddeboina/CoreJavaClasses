package com.learn;

import com.learn.interfaces.Animal;

public class Elephant implements Animal {
	private String name;
	private int weight;
	private String sound = "Trumpet";
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
	public String sound() {
		return sound;
	}
}

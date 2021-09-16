package com.prac;

class Animal{
	public String noise() {
		return "peep";
	}
}
class Dog extends Animal{
	public String noise() {
		return "bark";
	}
	public void doIt(){
		
	}
}

class Cat extends Animal{
	public String noise() {
		return "meow";
	}
	public void moveIt() {
		
	}
}
public class Main27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal = new Dog();
		System.out.println(animal.noise());
		
		Dog d = (Dog)animal;
		System.out.println(d.noise());
		
		//animal.doIt() wrong
		//d.doIt(); right
		
		Cat c = (Cat)animal;
		System.out.println(c.noise());
	}

}

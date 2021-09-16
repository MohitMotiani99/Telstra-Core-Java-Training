package com.prac;

interface Hungry <E> {void munch(E x);}
abstract class Animal{}
interface Carnivore<E extends Animal> extends Hungry<E>{}
interface Herbivore<E extends Animal> extends Hungry<E>{}
abstract class Plant{}
class Grass extends Plant{}
class Sheep extends Animal implements Herbivore<Sheep>{

	@Override
	public void munch(Sheep x) {
		// TODO Auto-generated method stub
		
	}
	
}
class Wolf extends Animal implements Carnivore<Sheep>{

	@Override
	public void munch(Sheep x) {
		// TODO Auto-generated method stub
		
	}
	
}

public class main47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

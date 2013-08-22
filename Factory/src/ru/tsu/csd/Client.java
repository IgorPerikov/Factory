package ru.tsu.csd;

public class Client {
	public static void main(String[] args) {
		Factory c = new PudgeFactory();
		Hero h = c.factoryMethod();
		System.out.println(h.getClass());
	}
}

abstract class Hero {}

class Pudge extends Hero {}

class Mirana extends Hero {}

abstract class Factory {
	public abstract Hero factoryMethod();
}

class PudgeFactory extends Factory {
	@Override
	public Hero factoryMethod() {
		return new Pudge();
	}
}

class MiranaFactory extends Factory {
	@Override
	public Hero factoryMethod() {
		return new Mirana();
	}
}
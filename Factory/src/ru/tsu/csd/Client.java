package ru.tsu.csd;

public class Client {
	public static void main(String[] args) {
		Creator c = new PudgeCreator();
		Hero h = c.factoryMethod();
		System.out.println(h.getClass());
	}
}

abstract class Hero {}

class Pudge extends Hero {}

class Mirana extends Hero {}

abstract class Creator {
	public abstract Hero factoryMethod();
}

class PudgeCreator extends Creator {
	@Override
	public Hero factoryMethod() {
		return new Pudge();
	}
}

class MiranaCreator extends Creator {
	@Override
	public Hero factoryMethod() {
		return new Mirana();
	}
}
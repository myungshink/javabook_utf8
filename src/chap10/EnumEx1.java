package chap10;

import chap10.EnumEx1.Car;

//[예제 10-5]
public class EnumEx1 {
	public enum Car {
		AVANTE, SONATA, GRANDURE 
	}
	public static void main(String[] args) {
		Car car = Car.AVANTE;
		System.out.println("My Car : " + car);
		System.out.println("SONATA : " + Car.SONATA);
		car = Car.GRANDURE;
		//객체?
		if(car instanceof Object) {
			System.out.println(car.toString());
			System.out.println(car.getClass().getName());
		}
		Car[] cars = Car.values();
		for(Car c : cars) {
		  System.out.println(c + ":" + c.ordinal());
		}
	}
}

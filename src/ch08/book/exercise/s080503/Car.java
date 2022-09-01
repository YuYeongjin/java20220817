package ch08.book.exercise.s080503;

import ch08.book.exercise.s080502.HankookTire;
import ch08.book.exercise.s080502.Tire;

public class Car {
	Tire[] tires= {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()	
	};
	
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}

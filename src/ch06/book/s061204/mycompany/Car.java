package ch06.book.s061204.mycompany;

//import ch06.book.s061204.hankook.SnowTire;
//import ch06.book.s061204.hankook.Tire;
// 패키지 내 모든 클래스 import
import ch06.book.s061204.hankook.*;

import ch06.book.s061204.hyundai.Engine;
import ch06.book.s061204.kumho.BigWidthTire;

public class Car {
	//필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	Tire tire3 ;
	ch06.book.s061204.kumho.Tire tire4 = new ch06.book.s061204.kumho.Tire();
}

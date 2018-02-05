package com.imooc.pattern.strategy;

import com.imooc.pattern.strategy.Duck;
import com.imooc.pattern.strategy.SpaceDuck;

public class DuckTest {

	public static void main(String[] args){
		System.out.println("≤‚ ‘—º◊”≥Ã–Ú");
		System.out.println("************************");
		Duck duck = null;
//		duck = new MallardDuck();
//		duck = new RedheadDuck();
//		duck = new RubberDuck();
//		duck = new BigYellow();
		duck = new SpaceDuck();
		
		duck.display();
		duck.quacking();
		duck.fly();
		System.out.println("************************");
		System.out.println("≤‚ ‘ÕÍ±œ");
	}

}

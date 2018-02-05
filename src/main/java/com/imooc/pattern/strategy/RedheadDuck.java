package com.imooc.pattern.strategy;

import com.imooc.pattern.strategy.impl.FlyWithWin;
import com.imooc.pattern.strategy.impl.QuackGaga;


public class RedheadDuck extends Duck {

	public RedheadDuck(){
		super();
		super.setFlyingStragety(new FlyWithWin());
		super.setQuackStragety(new QuackGaga());
	}
	
	@Override
	public void display() {
		System.out.println("我的头是红色的");
	}

}

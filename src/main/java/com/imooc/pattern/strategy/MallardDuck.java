package com.imooc.pattern.strategy;

import com.imooc.pattern.strategy.impl.FlyWithWin;
import com.imooc.pattern.strategy.impl.QuackGaga;


public class MallardDuck extends Duck {

	
	public MallardDuck(){
		super();
		super.setFlyingStragety(new FlyWithWin());
		super.setQuackStragety(new QuackGaga());
	}
	
	@Override
	public void display() {
		System.out.println("我的脖子是绿色的");
	}

}

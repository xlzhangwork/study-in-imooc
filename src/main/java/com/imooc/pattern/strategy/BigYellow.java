package com.imooc.pattern.strategy;

import com.imooc.pattern.strategy.impl.FlyNoWay;
import com.imooc.pattern.strategy.impl.QuackNoVoice;

public class BigYellow extends Duck {

	public BigYellow() {
		super();
		super.setFlyingStragety(new FlyNoWay());
		super.setQuackStragety(new QuackNoVoice());
	}

	@Override
	public void display() {
		System.out.println("我身体很大，全身黄黄");
	}

}

package com.imooc.pattern.strategy;

import com.imooc.pattern.strategy.impl.FlyWithRocket;
import com.imooc.pattern.strategy.impl.QuackWifi;

public class SpaceDuck extends Duck {

	public SpaceDuck() {
		super();
		super.setFlyingStragety(new FlyWithRocket());
		super.setQuackStragety(new QuackWifi());
	}

	@Override
	public void display() {
		System.out.println("ÎÒÍ·´÷Óîº½Í·¿ø");
	}
	


}

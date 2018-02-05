package com.imooc.pattern.strategy;

import com.imooc.pattern.strategy.impl.FlyNoWay;
import com.imooc.pattern.strategy.impl.QuackSeSe;

public class RubberDuck extends Duck {

	public RubberDuck() {
		super();
		super.setFlyingStragety(new FlyNoWay());
		super.setQuackStragety(new QuackSeSe());
	}

	@Override
	public void display() {
		System.out.println("��ȫ���ƣ���ͺܺ�");
	}

//	public void quack(){
//		System.out.println("��~��~��~");
//	}

}

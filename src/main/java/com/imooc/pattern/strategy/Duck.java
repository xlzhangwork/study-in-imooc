package com.imooc.pattern.strategy;

/*
 * ���࣬���е�Ѽ�Ӷ�Ҫ�̳д���
 * ������Ѽ�ӵ���Ϊ����ʾ������
 */
public abstract class Duck {
  
	/*
	 * Ѽ�ӷ�������
	 * ͨ����Ϊ���ɳ���ʵ��
	 */
//	public void quack(){
//		System.out.println("�¸¸�");
//	}
	
	/*
	 * ��ʾѼ�ӵ����
	 * Ѽ�ӵ���۸�����ͬ������Ϊabstract�� ������ʵ��
	 */
	public abstract void display();
	
	//���в���
	private FlyingStragety flyingStragety;

	public void setFlyingStragety(FlyingStragety flyingStragety) {
		this.flyingStragety = flyingStragety;
	}
	
	public void fly(){
		flyingStragety.performFly();
	}

	//��������
	public QuackStragety quackStragety;

	public void setQuackStragety(QuackStragety quackStragety) {
		this.quackStragety = quackStragety;
	}

	public void quacking(){
		quackStragety.quack();
	}
}

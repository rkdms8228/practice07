package com.javaex.ex02;

public class Duck extends Bird {

	//필드
	
	//생성자
	
	//메소드-gs
	
	//메소드-일반
	public void fly() {
		System.out.println("오리("+super.getName()+")가 날지 않습니다.");
	}
	
	public void sing() {
		System.out.println("오리("+super.getName()+")가 소리내어 웁니다.");
	}

    @Override
	public String toString() {
		return "Duck [getName()=" + getName() + "]";
	}

	public void showName() {
    	System.out.println("오리의 이름은 "+super.getName()+" 입니다.");
    }
    
}

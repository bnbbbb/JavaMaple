package Character;

import java.util.Scanner;
import java.util.Stack;

public abstract class Character {
	protected int hp; 
	protected int strength; 
	protected int defence;
	public int lv=0;

	public String location;

	String NPC;

	Character(int lv, int hp , int strength ,int defence , String location ){
		this.lv = lv;
		this.hp = hp;
		this.strength =strength;
		this.defence = defence;
		this.location = location ;
	}
	
	public void move(String location) {
		this.location = location ;
		System.out.println(location+"으로 이동합니다");
	}

	public void meet (String NPC) {
		System.out.println(NPC+"에게 말을 겁니다 .");
	}
	
	void status() {
		System.out.println("HP:"+hp);
		System.out.println("strength:"+strength);
		System.out.println("defence:"+defence);
		System.out.println("location:"+location);
	}

	abstract void LevelUp(int n);
	//
	
	public int getHp() {
		return hp;
	}
	
	public abstract String getName();
	
	public void setHp(int hp) {
		this.hp =hp;
	}
	
	//
	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		 this.strength=strength;
	}
	
	//
	public int getDefence() {
		return defence;
	}
	
	public void setDefence(int defence) {
		this.defence=defence;
	}
	
}




	


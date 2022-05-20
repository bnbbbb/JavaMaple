package Boss;

import Character.Luminus;

public abstract class Boss {
	
	protected int hp;
	protected int strength;
	protected int defence ;
	
	Boss(int hp, int strength , int armor){
		this.hp =hp;
		this.strength = strength;
		this.defence = defence;
	}
	
	
	public abstract void attack(Luminus lu);

	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp=hp;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public void setStrength(int strength) {
		this.strength=strength;
		
	}
	
	public int getDefence() {
		return defence;
	}
	
	public void setDefence(int defence) {
		this.defence = defence;
	}
}
	








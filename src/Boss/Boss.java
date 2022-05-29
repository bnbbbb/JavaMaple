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

	public abstract String getName();
	
	public abstract int getHp() ;
	
	public abstract  void setHp(int hp); 
	
	
	public abstract  int getStrength() ;
	
	public abstract  void setStrength(int strength);
	
	public abstract  int getDefence(); 
	
	public abstract void setDefence(int defence); 


	public abstract int MAX_Hp();



}
	








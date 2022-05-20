package Boss;

import Character.Luminus;

public class Ravana extends Boss{
	
	public Ravana(){
		super(1000, 200, 300);
	}
	
	public void attack(Luminus lu){
		System.out.println("보스가 루미너스를 공격합니다");
//		target.getHp() -= damage;
		lu.setHp(lu.getHp() - getStrength());
		System.out.printf("루미너스의 hp가 "+lu.getHp()+"되었습니다");
	
	}
}

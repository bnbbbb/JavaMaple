package Boss;

import Character.Luminus;

public class Ravana extends Boss{
	
	public Ravana(){
		super(1000, 200, 300);
	}
	
	public void attack(Luminus lu){
		System.out.println("������ ��̳ʽ��� �����մϴ�");
//		target.getHp() -= damage;
		lu.setHp(lu.getHp() - getStrength());
		System.out.printf("��̳ʽ��� hp�� "+lu.getHp()+"�Ǿ����ϴ�");
	
	}
}

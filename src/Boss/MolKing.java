package Boss;

import Character.Luminus;

public class MolKing extends Boss{
	
	public MolKing(){
		super(200, 30, 150);
	}
	
	public void attack(Luminus lu){
		System.out.println("������ ��̳ʽ��� �����մϴ�");
//		target.getHp() -= damage;
		lu.setHp(lu.getHp() - getStrength());
		System.out.printf("��̳ʽ��� hp�� "+lu.getHp()+"�Ǿ����ϴ�");
	
	}
	
}

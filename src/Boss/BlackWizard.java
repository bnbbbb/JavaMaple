package Boss;

import Character.Luminus;

public class BlackWizard extends Boss{
	
	BlackWizard(){
		super(1000000, 10000, 500);
	}
	
	public void attack(Luminus lu){
		System.out.println("������ ��̳ʽ��� �����մϴ�");
//		target.getHp() -= damage;
		lu.setHp(lu.getHp() - getStrength());
		System.out.printf("��̳ʽ��� hp�� "+lu.getHp()+"�Ǿ����ϴ�");
	
	}
}

package Boss;

import Character.Luminus;

public class BlackSlime  extends Boss{
	 
		public BlackSlime(){
			super(10000,1300,3000);
		}
		
		public void attack(Luminus lu){
			System.out.println("������ ��̳ʽ��� �����մϴ�");
//			target.getHp() -= damage;
			lu.setHp(lu.getHp() - getStrength());
			System.out.printf("��̳ʽ��� hp�� "+lu.getHp()+"�Ǿ����ϴ�");
		
		}

	
	}
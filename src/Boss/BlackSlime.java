package Boss;

import java.lang.invoke.SwitchPoint;

import Character.Luminus;

public class BlackSlime  extends Boss{
	 
		public BlackSlime(){
			super(10000,1300,3000);
		}
		
		public String getName() {
			return "�� ������";
		}
		public int MAX_Hp() {
			return 15000;
		}
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

		
		public void attack(Luminus lu){
			
//			System.out.println("\t\t\t\t\t\t\t������ ��̳ʽ�  �����ϱ� �����մϴ�.");
			int percent = (int )(Math.random()*8);
			
			if(percent >1) {
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t\t["+getName()+" �⺻����]");
//			System.out.println("\t\t\t\t\t\t\t\t      __ ");
//			System.out.println("\t\t\t\t\t\t\t\t_____|  |_   ");
//			System.out.println("\t\t\t\t\t\t\t\t|_______   |___");
//			System.out.println("\t\t\t\t\t\t\t\t|_______       |");
//			System.out.println("\t\t\t\t\t\t\t\t|_______       |");
//			System.out.println("\t\t\t\t\t\t\t\t|______________|");
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t\t"+getName()+" "+lu.getName()+"�� "+getStrength()+"������");
			lu.setHp(lu.getHp() - getStrength());
			
			}
		
			else {
				System.out.println("\t\t\t\t\t\t\t\t["+getName()+"�ñر�]");
				System.out.println("\t\t\t\t\t\t\t\t"+getName()+" "+(int)(lu.MAX_Hp()*0.43)+"������");
				lu.setHp(lu.getHp()-(int)(lu.MAX_Hp()*0.43));
//				if (lu.getHp()<0)
//					lu.setHp(0);
				
			}
//	
	}
		
}
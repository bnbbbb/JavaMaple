package Character;

import java.awt.image.MultiPixelPackedSampleModel;
import java.util.Stack;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import Boss.Boss;

public class Luminus extends Character {
	private int mp;
	
	public Luminus (){
		this(1,500,500,500,"엘리니아");
	}
	
	 Luminus(int lv, int hp ,int strength, int defence, String location){
			super(lv,hp, strength,defence,location);
	}
	 	
	public void LevelUp(){
		lv+=5;
		setHp(getHp()+1000*5);
		setStrength(getStrength()+300*5);
		setDefence(getDefence()+100*5);
		System.out.printf(lv+"Lv이 되었습니다.");
	}
	public void LevelUp(int n) {
		lv +=n;
		hp +=1000*n;
		strength+=300*n;
		defence +=50*n ;
		System.out.printf( "Lv "+n+" 올라 "+lv+"Lv이 되었습니다.");
		
	}
	
	
//	public double getMp() {
//		return mp;
//	}
//	public void setMp(int mp) {
//		this.mp = mp;
//	}
	
	public void attack(Boss boss) {
		
	System.out.println("......---aaaaaaaaa\\\\");
	System.out.println("....---aaaaaaaaaaaa\\\\");
	System.out.println("...---aaaaaaoaoaoaaa\\\\");
	System.out.println("-----aaaaaaaaaaaaaaaa\\\\");
	System.out.println("----aaaaaaaaaaaaaaaaa//");
	System.out.println("-----aaaaaaaaaaaaaaa//");
	System.out.println("..----aaaaaaaaaaaaa//");
	System.out.println("....---aaaaaaaaaaa// ");
	System.out.println("......---aaaaaaaa//  ");
	System.out.println();
		
//		double percent = 0.1*((int)(Math.random()*3)+8); //
//		int damage =0 ;
//		damage = (int)(getStrength()-boss.get)
		
		boss.setHp(boss.getHp()-this.getStrength());
		
	}
	
	public void heal() {
		int max_h = 1000*lv;
		int size =(int)(max_h*0.3);
		int tmp = hp;
		
		System.out.println("__________________________________________________ ");
		System.out.println("|                                                 |");
		System.out.println("| H     H     EEEEEEE         A         LL        |");
		System.out.println("| H     H     E	             A A        LL        |");
		System.out.println("| H     H     E	            A   A       LL        |");
		System.out.println("| HHHHHHH     EEEEEEE      AAAAAAA      LL        |");
		System.out.println("| H     H     E	          AA     AA     LL        |");
		System.out.println("| H     N     E	         A         A    LL        |");
		System.out.println("| H     N     EEEEEEE   A           A   LLLLLLLLL |"); 
		System.out.println("|_________________________________________________|");
		System.out.println();
		
		
		if(hp > max_h*0.7) {
			System.out.println("1.루미너스 HP"+(max_h-hp)+"회복");
			hp = max_h;
		System.out.println("루미너스 HP = "+hp+"\n");
		}
		else {
		System.out.println("2.루미너스 HP "+size+"회복 ");
		hp+=size;
		System.out.println("루미너스 HP = "+hp+"\n");
		}
		}
	public void hyperAttack(Boss boss) {
		
		}
	
	public void stun() {
			
		}
		
		
}


	
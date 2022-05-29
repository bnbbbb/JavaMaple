package Character;

import java.awt.image.MultiPixelPackedSampleModel;
import java.util.Stack;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import Boss.Boss;
import NPC.DarkRoad1;
import Thread.SkillEffectThread;

public class Luminus extends Character {
	private int mp;
	
	public int MAX_Hp() {
		return 1000+400*(lv-1);
	}
	public Luminus (){
		this(1,1000,500,120,"엘리니아");
	}
	public Luminus (int lv) {
		this(lv ,1000+400*(lv-1),500+200*lv,120+100*lv,"시간의 신전");
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "루미너스";
	}
	
	 Luminus(int lv, int hp ,int strength, int defence, String location){
			super(lv,hp, strength,defence,location);
	}
	 	
	public void LevelUp(){
		lv+=5;
		setHp(getHp()+400*5);
		setStrength(getStrength()+200*5);
		setDefence(getDefence()+100*5);
		System.out.printf(lv+"Lv이 되었습니다.");
	}
	public void LevelUp(int n) {
		lv +=n;
		hp +=400*n;
		strength+=200*n;
		defence +=50*n ;
		System.out.printf( "Lv "+n+" 올라 "+lv+"Lv이 되었습니다.\n");
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {}
		
	}
	
	
//	public double getMp() {
//		return mp;
//	}
//	public void setMp(int mp) {
//		this.mp = mp;
//	}
	
	public void attack(Boss boss) {
	System.out.println("=====================");
	System.out.println(" ________________ ");
	System.out.println("|                |");
	System.out.println("|     ATTACK     |");
	System.out.println("|     ATTACK     |");
	System.out.println("|     ATTACK     |");
	System.out.println("|     ATTACK     |");
	System.out.println("|     ATTACK     |");
	System.out.println("|     ATTACK     |");
	System.out.println("|________________|");
	System.out.println("                  ");
	System.out.println("======================");
	System.out.println();
		
//		double percent = 0.1*((int)(Math.random()*3)+8); //
//		int damage =0 ;
//		damage = (int)(getStrength()-boss.get)
		System.out.println(getName()+" "+boss.getName()+"에 "+getStrength()+"데미지");
		boss.setHp(boss.getHp()-this.getStrength());
		
	}
	
	public void heal() {
		int max_h = MAX_Hp();
		int hsize =(int)(max_h*0.4);
		int tmp = getHp();
		
		System.out.println("===================================================");
		System.out.println("                                                   ");
		System.out.println("  H     H     EEEEEEE         A         LL         ");
		System.out.println("  H     H     E	             A A        LL         ");
		System.out.println("  H     H     E	            A   A       LL         ");
		System.out.println("  HHHHHHH     EEEEEEE      AAAAAAA      LL         ");
		System.out.println("  H     H     E	          AA     AA     LL         ");
		System.out.println("  H     N     E	         A         A    LL         ");
		System.out.println("  H     N     EEEEEEE   A           A   LLLLLLLLL  "); 
		System.out.println("                                                   ");
		System.out.println("===================================================");
		
		
		if(getHp() > max_h*0.4) {
			System.out.println("1.루미너스 HP"+(max_h-getHp())+"회복");
			hp = max_h;

		}
		else {
		System.out.println("2.루미너스 HP "+hsize+"회복 ");
		setHp(getHp()+hsize);
		
		System.out.println("루미너스 HP = "+getHp()+"\n");
		}
		
		}
	public void hyperAttack(Boss boss) {
		 System.out.println("\n|| 아  || 포  || 칼  || 립  || 스 ||");
		 
		System.out.println();
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||");
		
		System.out.println();
		Thread s1 = new Thread(new SkillEffectThread());
		s1.start();
		 try {
			 s1.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		
		System.out.println(getName()+" "+boss.getName()+"에 "+3*getStrength()+"데미지");
		boss.setHp(boss.getHp()-3*this.getStrength());
		}
	
	public void stun() {
			
		}
		
		
}


	
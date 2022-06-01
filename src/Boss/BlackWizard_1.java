package Boss;

import Character.Luminus;

public class BlackWizard_1 extends Thread {
	
	protected int hp;
	protected int strength;
	protected int defence ;
	protected String name;
	
	BlackWizard_1(int hp, int strength , int armor){
		this.hp =hp;
		this.strength = strength;
		this.defence = defence;
	}
	
	public BlackWizard_1(){
		this(1000000, 10000, 500);
	}
	public String getName(String name) {
		return name;
	}
	public int MAX_Hp() {
		return 1000000;
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
		
//		System.out.println("\t\t\t\t\t\t\t보스가 루미너스  공격하기 시작합니다.");
		int percent = (int )(Math.random()*13);
		
		if(percent >7) {
			setStrength((int)(lu.MAX_Hp()*0.25));
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\t["+getName()+" 기본공격]");
		//기본 공격 이팩트 쓰레드 
		System.out.println("\t\t\t\t\t\t\t\t"+getName()+" "+lu.getName()+"에 "+getStrength()+"데미지\n");
	
		lu.setHp(lu.getHp() - getStrength());
		System.out.println("_____________________________________________________________");
		System.out.println("루미너스  MAX_HP : "+lu.MAX_Hp()+
						   "\n루미너스  CUR_HP :"+lu.getHp());
		System.out.println("_____________________________________________________________");
		}
	
		else {
			setStrength((int)(lu.MAX_Hp()*0.43));
			System.out.println("\t\t\t\t\t\t\t\t["+getName()+"궁극기]");
			//궁극기 이팩트 쓰레드 
			System.out.println("\t\t\t\t\t\t\t\t"+getName()+" "+getStrength()+"데미지\n");
			
			 lu.setHp(lu.getHp()-getStrength());
			System.out.println("_____________________________________________________________");
			System.out.println("루미너스  MAX_HP : "+lu.MAX_Hp()+
							   "\n루미너스  CUR_HP :"+lu.getHp());
			System.out.println("_____________________________________________________________");
		}
	}
	public void attack() {
		Luminus lu = new Luminus();
		attack(lu);
	}
	
	@Override
	public void run() {

//		while(true) {
		for(int i = 0 ; i<10 ; i++) {
		 
		 
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
		
			}	
		}	
	}


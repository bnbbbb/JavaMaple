package scene;

import java.util.Scanner;

import javax.naming.LinkLoopException;

import Boss.Boss;
import Character.Luminus;

public class Battle {
	
	public void printHp(Luminus lu, Boss b) {
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t_____________________________________________________________");
		System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t루미너스  MAX_HP : "+lu.MAX_Hp()+"\t 보 스     MAX_HP : "+b.MAX_Hp()+
						 "\n\t\t\t\t\t\t\t\t\t\t\t\t\t루미너스  CUR_HP : "+lu.getHp()+"\t 보 스     CUR_HP : "+b.getHp()+"\n");	
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t_____________________________________________________________");
	
		
	}
	
		
	public void print(Luminus lu , Boss b) {
		System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t__________[Battle]___________________________________________");
		
		System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t루미너스  MAX_HP : "+lu.MAX_Hp()+"\t 보 스     MAX_HP : "+b.MAX_Hp()+
						  "\n\t\t\t\t\t\t\t\t\t\t\t\t\t루미너스  CUR_HP : "+lu.MAX_Hp()+"\t 보 스     CUR_HP : "+b.MAX_Hp()+"\n");
	       	System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t_____________________________________________________________");
		
		
		 do {
			Scanner input = new Scanner(System.in);
			
			System.out.println("\n어떤 행동을 하시겠습니까 >>");
			String act = input.nextLine();
			
	if("q".equalsIgnoreCase(act)) {
			lu.attack(b);
			printHp(lu, b);
			if(b.getHp()<=0) {
				System.out.println("전투에서 승리했습니다.\n");
				break ;
					}
			
	}if ("w".equalsIgnoreCase(act)) {
		
				lu.heal();
				printHp(lu, b);
			}
	
	
	if("e".equalsIgnoreCase(act)) {
		System.out.println("대기");
 
		
	}else if("r".equalsIgnoreCase(act)) {
		
	}	
	
	
	try {
		Thread.sleep(1000);
	}catch(InterruptedException e) {}
	
		b.attack(lu);
		 if(lu.getHp()<=0) {
			 for(int i = 0 ; i< 60 ; i++) 
			 System.out.println();
			 
			
			 System.out.println("루미너스가 사망했습니다....");
			 lu.setHp(0);
//				System.out.println("_____________________________________________________________");
//				System.out.printf("\t루미너스  MAX_HP : "+lu.MAX_Hp()+"\t 보 스     MAX_HP : "+b.MAX_Hp()+
//								 "\n\t루미너스  CUR_HP : "+lu.getHp()+"\t 보 스     CUR_HP : "+b.getHp()+"\n");	
//				System.out.println("_____________________________________________________________");
//			
			 printHp(lu, b);
			System.out.println("\n부활 하시겠습니까 [ y / n ]");
			
			do {
					String c = input.nextLine();
					System.out.print("[y/n] :");
					if("y".equals(c)) {
						System.out.println("루미너스가 부활합니다.");
						lu.setHp(lu.MAX_Hp());
						b.setHp(b.MAX_Hp());
						break;
						
					}
					if("n".equals(c)) {
						System.out.println("게임을 종료합니다.");
						System.exit(0);
					}
					else {	
						System.out.println("잘못된 입력입니다.");
						continue;
					}
					
		 }while(true);
	 }
		 
	try {
			Thread.sleep(1000);
	}catch(InterruptedException e) {}
	for(int i = 0 ; i<40 ; i++)
		System.out.println();
	
//	System.out.println("_____________________________________________________________");
//	System.out.printf("\t루미너스  MAX_HP : "+lu.MAX_Hp()+"\t 보 스     MAX_HP : "+b.MAX_Hp()+
//					 "\n\t루미너스  CUR_HP : "+lu.getHp()+"\t 보 스     CUR_HP : "+b.getHp()+"\n");	
//	System.out.println("_____________________________________________________________");
		 	printHp(lu, b);
		}while(true);
	}
	
}

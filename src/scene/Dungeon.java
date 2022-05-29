package scene;

import java.util.Scanner;

import Boss.BlackWizard;
import Boss.Boss;
import Character.Luminus;

public class Dungeon{
		
		public void printHp(Luminus lu, Boss b) {
		System.out.println("____________________________________________________________");
		System.out.printf("\t\t\t\t\t 보 스     MAX_HP : "+b.MAX_Hp()+
						 "\n\t\t\t\t\t 보 스     CUR_HP : "+b.getHp()+"\n");	
		System.out.println("_____________________________________________________________");
	
		
	}
	
	public void start(Luminus lu , BlackWizard b) {
		Scanner input = new Scanner(System.in);
		
		Thread bw = new Thread(b);
		bw.start();
		
		
		System.out.println("\n\n__________[Battle]___________________________________________");
		
		System.out.printf("\t루미너스  MAX_HP : "+lu.MAX_Hp()+"\t 보 스     MAX_HP : "+b.MAX_Hp()+
						  "\n\t루미너스  CUR_HP : "+lu.MAX_Hp()+"\t 보 스     CUR_HP : "+b.MAX_Hp()+"\n");
	       	System.out.println("_____________________________________________________________");
		
		
		 while(true) {
			
				System.out.println();
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
			
			}
	
	
	if("e".equalsIgnoreCase(act)) {
		System.out.println("대기");
 
		
	}else if("r".equalsIgnoreCase(act)) {
		
				}		
	
		 }
	}

	
}

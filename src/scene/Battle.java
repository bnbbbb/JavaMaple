package scene;

import java.util.Scanner;

import javax.naming.LinkLoopException;

import Boss.Boss;
import Character.Luminus;

public class Battle {
	
	public void printHp(Luminus lu, Boss b) {
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t_____________________________________________________________");
		System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t��̳ʽ�  MAX_HP : "+lu.MAX_Hp()+"\t �� ��     MAX_HP : "+b.MAX_Hp()+
						 "\n\t\t\t\t\t\t\t\t\t\t\t\t\t��̳ʽ�  CUR_HP : "+lu.getHp()+"\t �� ��     CUR_HP : "+b.getHp()+"\n");	
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t_____________________________________________________________");
	
		
	}
	
		
	public void print(Luminus lu , Boss b) {
		System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t__________[Battle]___________________________________________");
		
		System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t��̳ʽ�  MAX_HP : "+lu.MAX_Hp()+"\t �� ��     MAX_HP : "+b.MAX_Hp()+
						  "\n\t\t\t\t\t\t\t\t\t\t\t\t\t��̳ʽ�  CUR_HP : "+lu.MAX_Hp()+"\t �� ��     CUR_HP : "+b.MAX_Hp()+"\n");
	       	System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t_____________________________________________________________");
		
		
		 do {
			Scanner input = new Scanner(System.in);
			
			System.out.println("\n� �ൿ�� �Ͻðڽ��ϱ� >>");
			String act = input.nextLine();
			
	if("q".equalsIgnoreCase(act)) {
			lu.attack(b);
			printHp(lu, b);
			if(b.getHp()<=0) {
				System.out.println("�������� �¸��߽��ϴ�.\n");
				break ;
					}
			
	}if ("w".equalsIgnoreCase(act)) {
		
				lu.heal();
				printHp(lu, b);
			}
	
	
	if("e".equalsIgnoreCase(act)) {
		System.out.println("���");
 
		
	}else if("r".equalsIgnoreCase(act)) {
		
	}	
	
	
	try {
		Thread.sleep(1000);
	}catch(InterruptedException e) {}
	
		b.attack(lu);
		 if(lu.getHp()<=0) {
			 for(int i = 0 ; i< 60 ; i++) 
			 System.out.println();
			 
			
			 System.out.println("��̳ʽ��� ����߽��ϴ�....");
			 lu.setHp(0);
//				System.out.println("_____________________________________________________________");
//				System.out.printf("\t��̳ʽ�  MAX_HP : "+lu.MAX_Hp()+"\t �� ��     MAX_HP : "+b.MAX_Hp()+
//								 "\n\t��̳ʽ�  CUR_HP : "+lu.getHp()+"\t �� ��     CUR_HP : "+b.getHp()+"\n");	
//				System.out.println("_____________________________________________________________");
//			
			 printHp(lu, b);
			System.out.println("\n��Ȱ �Ͻðڽ��ϱ� [ y / n ]");
			
			do {
					String c = input.nextLine();
					System.out.print("[y/n] :");
					if("y".equals(c)) {
						System.out.println("��̳ʽ��� ��Ȱ�մϴ�.");
						lu.setHp(lu.MAX_Hp());
						b.setHp(b.MAX_Hp());
						break;
						
					}
					if("n".equals(c)) {
						System.out.println("������ �����մϴ�.");
						System.exit(0);
					}
					else {	
						System.out.println("�߸��� �Է��Դϴ�.");
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
//	System.out.printf("\t��̳ʽ�  MAX_HP : "+lu.MAX_Hp()+"\t �� ��     MAX_HP : "+b.MAX_Hp()+
//					 "\n\t��̳ʽ�  CUR_HP : "+lu.getHp()+"\t �� ��     CUR_HP : "+b.getHp()+"\n");	
//	System.out.println("_____________________________________________________________");
		 	printHp(lu, b);
		}while(true);
	}
	
}

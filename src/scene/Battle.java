package scene;

import java.util.Scanner;

import Boss.Boss;
import Character.Luminus;

public class Battle {

	public void print(Luminus lu , Boss b) {
		System.out.println("\n\n__________[Battle]________________________________");
		
		while(true) {
			Scanner input = new Scanner(System.in);
		
			System.out.println("\n� �ൿ�� �Ͻðڽ��ϱ� >>");
			String act = input.nextLine();
			
	if("q".equals(act)) {
			lu.attack(b);
			if(b.getHp()>0)
					System.out.printf("���� HP = "+b.getHp());		
			else
					System.out.println("������ �׾����ϴ�.");
			}
	if ("w".equals(act)) {
		
				lu.heal();
			
			}
	if("e".equals(act)) {
		System.out.println("���");
			}
	
	if(b.getHp()<=0) {
		System.out.println("�������� �¸��߽��ϴ�.\n");
			break;
			}


	
b.attack(lu);
}
	}
}
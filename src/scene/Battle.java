package scene;

import java.util.Scanner;

import Boss.Boss;
import Character.Luminus;

public class Battle {

	public void print(Luminus lu , Boss b) {
		System.out.println("\n\n__________[Battle]________________________________");
		
		while(true) {
			Scanner input = new Scanner(System.in);
		
			System.out.println("\n어떤 행동을 하시겠습니까 >>");
			String act = input.nextLine();
			
	if("q".equals(act)) {
			lu.attack(b);
			if(b.getHp()>0)
					System.out.printf("보스 HP = "+b.getHp());		
			else
					System.out.println("보스가 죽었습니다.");
			}
	if ("w".equals(act)) {
		
				lu.heal();
			
			}
	if("e".equals(act)) {
		System.out.println("대기");
			}
	
	if(b.getHp()<=0) {
		System.out.println("전투에서 승리했습니다.\n");
			break;
			}


	
b.attack(lu);
}
	}
}
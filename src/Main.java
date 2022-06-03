import java.util.Scanner;

import javax.tools.DocumentationTool.Location;

import Character.Luminus;


public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("진행할 캐릭터를 선택 하세요\n(1)Luminus (2)Pantom>>");
		int select =input.nextInt();
		
		if(select==1) {
			
		Start_Story story = new Start_Story();
		System.out.println("\n>>루미너스가 선택되었습니다\n\n<Story>");
		
		story.start_story();
		story.birth();
		
		//기억 잃기 전  - 검은 마법사랑 싸우는 것 구현 예정 
//		Luminus lu_120 = new Luminus(120,100000000,100000000,"시간의 신전");
			
		//기억 잃은 후 
		System.out.println("루미너스가 기억을 잃었습니다\n");
		Luminus lu = new Luminus();
//		story.memory();
	
			}
		
		System.out.println("하이헬로우");
		}
	}


		// 		이동시키는 예시 
//		while(true) {
//			System.out.print("어디로 이동하실건가요 :");
//			Scanner w  =new Scanner(System.in);
//			world=w.nextLine();
//		if(world.equals("엘리니아")) {
//			lu.move(world);System.out.println(); break;
//		}
//		else {lu.move(world);
//			System.out.println("->엘리니아으로 가서 하인즈를 만나야 합니다\n");
//		}
		
		
		
		

	




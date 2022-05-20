package World;

import java.util.Scanner;
import java.util.Set;

public class PhantomSkill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		while(true) {
			String job1;
			String skill;
			Scanner input = new Scanner(System.in);
		System.out.println("->어떤 계열 스킬을 훔치시겠습니까  "); // 전사 , 도적 

		String job = input.nextLine();
		if("전사".equals(job){
		
			System.out.println("어떤 직업 을 훔치시겠습니까?\n 1.다크나이트 /n 2.팔라딘 ");
			job1 = input.nextLine();
				if("다크나이트".equals(job1)) {
					DarkNight d = new DarkNight();
						System.out.println("어떤 스킬 가져오시겠습니까./n(1)__\t(2)__\t(3)__");
							skill =input.nextLine();
						
							if("(1)".equals(skill)) {
								
							}
				}else if ("팔라딘".equals(job1)) {
					Palladin p = new Palladin();
					}
				
		}
		else if{"도적".equals(job){
			System.out.println("어떤 직업 을 훔치시겠습니까?\n 1.다크나이트 /n 2.팔라딘 ");
			job1 = input.nextLine();
	
		}
		
		
	
			
		
		}
	}

}

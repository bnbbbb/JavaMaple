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
		System.out.println("->� �迭 ��ų�� ��ġ�ðڽ��ϱ�  "); // ���� , ���� 

		String job = input.nextLine();
		if("����".equals(job){
		
			System.out.println("� ���� �� ��ġ�ðڽ��ϱ�?\n 1.��ũ����Ʈ /n 2.�ȶ�� ");
			job1 = input.nextLine();
				if("��ũ����Ʈ".equals(job1)) {
					DarkNight d = new DarkNight();
						System.out.println("� ��ų �������ðڽ��ϱ�./n(1)__\t(2)__\t(3)__");
							skill =input.nextLine();
						
							if("(1)".equals(skill)) {
								
							}
				}else if ("�ȶ��".equals(job1)) {
					Palladin p = new Palladin();
					}
				
		}
		else if{"����".equals(job){
			System.out.println("� ���� �� ��ġ�ðڽ��ϱ�?\n 1.��ũ����Ʈ /n 2.�ȶ�� ");
			job1 = input.nextLine();
	
		}
		
		
	
			
		
		}
	}

}

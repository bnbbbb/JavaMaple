import java.util.Scanner;

import javax.tools.DocumentationTool.Location;

import Character.Luminus;


public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("������ ĳ���͸� ���� �ϼ���\n(1)Luminus (2)Pantom>>");
		int select =input.nextInt();
		
		if(select==1) {
			
		Start_Story story = new Start_Story();
		System.out.println("\n>>��̳ʽ��� ���õǾ����ϴ�\n\n<Story>");
		
		story.start_story();
		story.birth();
		
		//��� �ұ� ��  - ���� ������� �ο�� �� ���� ���� 
//		Luminus lu_120 = new Luminus(120,100000000,100000000,"�ð��� ����");
			
		//��� ���� �� 
		System.out.println("��̳ʽ��� ����� �Ҿ����ϴ�\n");
		Luminus lu = new Luminus();
//		story.memory();
	
			}
		
		System.out.println("������ο�");
		}
	}


		// 		�̵���Ű�� ���� 
//		while(true) {
//			System.out.print("���� �̵��Ͻǰǰ��� :");
//			Scanner w  =new Scanner(System.in);
//			world=w.nextLine();
//		if(world.equals("�����Ͼ�")) {
//			lu.move(world);System.out.println(); break;
//		}
//		else {lu.move(world);
//			System.out.println("->�����Ͼ����� ���� ����� ������ �մϴ�\n");
//		}
		
		
		
		

	




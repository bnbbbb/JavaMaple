import java.util.Scanner;

public class Story {
	
	void indent() {
		Scanner ch = new Scanner(System.in) ;
				ch.nextLine();
			
//		if("q".equals(ch)) {
//			System.out.println("��ųâ�� ���ϴ� .");
//			ch.nextLine();
//		}
//		if("status".equals(ch)) {
//			System.out.println("��̳ʽ� ������ �����ݴϴ�.");
//			ch.nextLine();
//		}
//		if("i".equals(ch)) {
//			System.out.println("�κ��丮 â�� �����ݴϴ�");
//			ch.nextLine();
//		}
//
		}
	
	
	
	void start_story() {
		indent();
		System.out.println(
				"���� ��, �� õ�� �����簡 �־���. \n"
				+ "�״�  ���󿡼� ���� �پ ���� ������� �̸��� �˷ȴٰ� �Ѵ�.\n"
				+ "�ʼ��Ⱓ ������ ������ ��ģ���� å�� ���� ������� ����鼭, �״� ����鿡�� �Ͼ� �������� �̸����� �Ҹ��� �ȴ�.>>");
		indent();
		System.out.println(	 "���� �˷��� ������ �Ͼ� �������� �̻� ���ϸ� �ʹ� ������\n"
				+ " �״� ������ ������ ���� �ƹ��͵� ���� ���� ���İ� �㹫���� �ʹ��� �Ǵ�.>>");
		indent();
		System.out.println("�׷��� �Ͼ� ������� �ñ��� ������ �� ó������ �ƿ� ��������\n"
				+ " �ñ��� ����� �����Ѵٸ� �̰��� �ڽ��� ���� ����̶�� ���� �� Ÿ���ϰ� ����.>> ");
		indent();
		System.out.println("Ÿ���� �Ͼ� ������� ����� ���� ����� �����ϰ�, �ڽ��� ������ ���ζ��� �Ͽ� �ټ��� �׿����� �� ��������.>> ");
		indent();
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڰ��� �������� ź���̾��١ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		indent();
	}
	
	void birth() {
		System.out.println("���� �����簡 ���� ���ڸ���  ������ ���� �������� �����־���>> ");
		indent();
		System.out.println("�� ���� ������ ���ζ�� ���� ���� �̿��� �� �ʳ� ȯ���� �� �ְ� �ߴ�.>>");
		indent();
		System.out.println("�װ� �ٷ� ���� �������� ���������� ���󿡼� ���� ������ ���� ���� ���� ������ ź���̾��� .");
	}
	
	void memory() {
		System.out.println("��̳ʽ� >>");
		indent();
		System.out.println("��Ͼ� : ������ ���� ����̱���... �׷�  ������������ ��������� ã�ư� ���°� ���?>>");
		indent();
		System.out.println("��̳ʽ�:  >>");
		
	}
	
	
	
}

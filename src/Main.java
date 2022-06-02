import Skillset.*;
import Thread.PhantomStory;
import Thread.Skillend;
import Thread.Skillset;
import Thread.*;

import java.util.*;
//�߰��� �� ����Ʈ ��� �߰��ϰ� �Ǵ°� ����
public class Main {
	static void indent() {
		System.out.printf("\n\t\t\t\t\tENTER\n");
		Scanner a = new Scanner(System.in) ;
		a.nextLine();
	}
	static Queue skill_p = new LinkedList();
	public static void save(String input) {
		System.out.println(input+"��ų�� ȹ���Ͽ����ϴ�.");
		
//		if (skill_p.size() < 3) {
//			skill_p.offer(input);
//		}
		if (!"".equals(input)) {
			skill_p.offer(input);
		}
		if(skill_p.size() > 3) {
			
			System.out.println("��ų�� ��á���ϴ�.");
			skill_p.poll();
		}
	}

	public static void main(String[] args) {
		Thread Storystart = new Thread(new Storystart());
		Storystart.start();
		try {
			Storystart.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		indent();
		Thread PhantomStory = new Thread(new PhantomStory());
		PhantomStory.start();
		try {
			PhantomStory.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread Skillset = new Thread(new Skillset());
		Skillset.start();
		try {
			Skillset.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		Scanner input = new Scanner(System.in);
		Darknight d = new Darknight();
		DualBlade b = new DualBlade();
		NightLoad n = new NightLoad();
		Paladin p = new Paladin();
		//		HashSet hash = new HashSet(skill_p);
		//		LinkedList list = new LinkedList(hash);
		// TODO Auto-generated method stub
		LinkedList list = (LinkedList)skill_p;
		while(true) {
		indent();
		System.out.println("���� ������ ���÷��� help�� �����ּ���");
		String help = input.nextLine();
		if("help".equals(help)) {
			System.out.println("k - ��ų ����Ʈ�� �����ݴϴ�.");
			System.out.println("j - ��ų ����Ʈ�� �ʱ�ȭ�����ݴϴ�.");
		}
		System.out.println("��ų ����Ʈ�� ���÷��� k�� �����ּ���");
		String skillset = input.nextLine();
		if("k".equals(skillset)) {
			System.out.println(skill_p);
			System.out.println(list);
//			LinkedList list = (LinkedList)skill_p;
			final int SIZE =  list.size();
			for(int i=0; i<SIZE; i++)
				System.out.println((i+1)+"."+list.get(i));
		}
		System.out.println("��ų�� �ʱ�ȭ �Ϸ��� j�� �����ּ���");
		String sk = input.nextLine();
		if("j".equals(sk)) {
			skill_p.clear();
			System.out.println("��ų�� �ʱ�ȭ �Ǿ����ϴ�.");
		}
		System.out.println("��ų�� �� 3�� ��ĥ �� �ֽ��ϴ�! \n"
				+ "��ų�� �߰��� ���� ó�� ������ ���� ������ϴ�.");
		indent();
		while(true) {
			try {
			System.out.println("� �迭�� ��ų�� ��ġ�ðڽ��ϱ�?\n"
					+ "1. ����\t 2. ����\n"
					+ "����, �������� �Է����ּ���.");
			String job = input.nextLine();
			if("1".equals(job)) {
				indent();
				System.out.println("� ������ ��ġ�ðڽ��ϱ�?\n1.��ũ����Ʈ \t2.�ȶ��\n"
						+ "�������� �Է����ּ���.");
				String job1 = input.nextLine();
				System.out.println("Enter�� ���� ��ĥ ��ų�� Ȯ�� �ϼ���.");
				indent();
				if ("1".equals(job1)) {
					System.out.println("� ��ų�� �������ðڽ��ϱ�?\n"
							+ "1. " + d.skill1 + " 2. "+d.skill2 + " 3. " + d.skill3) ;
					String skill = input.nextLine();
					if("1".equals(skill)) {
						save(d.skill1);
						indent();
						continue;
					}
					if("2".equals(skill)) {
						save(d.skill2);
						indent();
						continue;
					}
					if("3".equals(skill)) {
						save(d.skill3);
						indent();
						continue;
					}
				}
				if ("2".equals(job1)) {
					System.out.println("� ��ų�� �������ðڽ��ϱ�?\n"
							+ "1. " + p.skill1 + " 2. "+p.skill2 + " 3. " + p.skill3) ;
					String skill = input.nextLine();
					if("1".equals(skill)) {
						save(p.skill1);
						indent();
						continue;
					}
					if("2".equals(skill)) {
						save(p.skill2);
						indent();
						continue;
					}
					if("3".equals(skill)) {
						save(p.skill3);
						indent();
						continue;
					}
				}

			}
			if("2".equals(job)) {
				System.out.println("� ������ ��ġ�ðڽ��ϱ�?\n1.����Ʈ�ε� \t2.�����̵�\n"
						+ "�������� �Է����ּ���.");
				String job1 = input.nextLine();
				System.out.println("Enter�� ���� ��ĥ ��ų�� Ȯ�� �ϼ���.");
				indent();
				if ("1".equals(job1)) {
					System.out.println("� ��ų�� �������ðڽ��ϱ�?\n"
							+ "1. " + n.skill1 + " 2. "+n.skill2 + " 3. " + n.skill3) ;
					String skill = input.nextLine();
					if("1".equals(skill)) {
						save(n.skill1);
						indent();
						continue;
					}
					if("2".equals(skill)) {
						save(n.skill2);
						indent();
						continue;
					}
					if("3".equals(skill)) {
						save(n.skill3);
						indent();
						continue;
					}
				}
				if ("2".equals(job1)) {
					System.out.println("� ��ų�� �������ðڽ��ϱ�?\n"
							+ "1. " + b.skill1 + " 2. "+b.skill2 + " 3. " + b.skill3) ;
					String skill = input.nextLine();
					if("1".equals(skill)) {
						save(b.skill1);
						indent();
						continue;
					}
					if("2".equals(skill)) {
						save(b.skill2);
						indent();
						continue;
					}
					if("3".equals(skill)) {
						save(b.skill3);
						indent();
						continue;
					}
				}
			}
			if(skill_p.size() == 3) {
				System.out.println("��ų ������ ���Ḧ ���Ͻø� exit�� �����ּ���");
				String exit = input.nextLine();
				if("exit".equals(exit)) {
					Thread Skillend = new Thread(new Skillend());
					Skillend.start();
					try {
						Skillend.join();
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
					break;
					// Thread�� ���� ���� ���� �˸��� 
				}
			}
		
		}catch(Exception e) {
			System.out.println("�Է� ����!");
		}
	}
	}

}
}

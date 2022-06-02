import Skillset.*;
import Thread.PhantomStory;
import Thread.Skillend;
import Thread.Skillset;
import Thread.*;

import java.util.*;
//추가할 것 리스트 계속 추가하게 되는거 구현
public class Main {
	static void indent() {
		System.out.printf("\n\t\t\t\t\tENTER\n");
		Scanner a = new Scanner(System.in) ;
		a.nextLine();
	}
	static Queue skill_p = new LinkedList();
	public static void save(String input) {
		System.out.println(input+"스킬을 획득하였습니다.");
		
//		if (skill_p.size() < 3) {
//			skill_p.offer(input);
//		}
		if (!"".equals(input)) {
			skill_p.offer(input);
		}
		if(skill_p.size() > 3) {
			
			System.out.println("스킬이 꽉찼습니다.");
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
		System.out.println("팬텀 도움말을 보시려면 help를 눌러주세요");
		String help = input.nextLine();
		if("help".equals(help)) {
			System.out.println("k - 스킬 리스트를 보여줍니다.");
			System.out.println("j - 스킬 리스트를 초기화시켜줍니다.");
		}
		System.out.println("스킬 리스트를 보시려면 k를 눌러주세요");
		String skillset = input.nextLine();
		if("k".equals(skillset)) {
			System.out.println(skill_p);
			System.out.println(list);
//			LinkedList list = (LinkedList)skill_p;
			final int SIZE =  list.size();
			for(int i=0; i<SIZE; i++)
				System.out.println((i+1)+"."+list.get(i));
		}
		System.out.println("스킬을 초기화 하려면 j를 눌러주세요");
		String sk = input.nextLine();
		if("j".equals(sk)) {
			skill_p.clear();
			System.out.println("스킬이 초기화 되었습니다.");
		}
		System.out.println("스킬은 총 3개 훔칠 수 있습니다! \n"
				+ "스킬을 추가할 수록 처음 넣은거 부터 사라집니다.");
		indent();
		while(true) {
			try {
			System.out.println("어떤 계열의 스킬을 훔치시겠습니까?\n"
					+ "1. 전사\t 2. 도적\n"
					+ "전사, 도적으로 입력해주세요.");
			String job = input.nextLine();
			if("1".equals(job)) {
				indent();
				System.out.println("어떤 직업을 훔치시겠습니까?\n1.다크나이트 \t2.팔라딘\n"
						+ "직업명을 입력해주세요.");
				String job1 = input.nextLine();
				System.out.println("Enter를 눌러 훔칠 스킬을 확인 하세요.");
				indent();
				if ("1".equals(job1)) {
					System.out.println("어떤 스킬을 가져오시겠습니까?\n"
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
					System.out.println("어떤 스킬을 가져오시겠습니까?\n"
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
				System.out.println("어떤 직업을 훔치시겠습니까?\n1.나이트로드 \t2.듀얼블레이드\n"
						+ "직업명을 입력해주세요.");
				String job1 = input.nextLine();
				System.out.println("Enter를 눌러 훔칠 스킬을 확인 하세요.");
				indent();
				if ("1".equals(job1)) {
					System.out.println("어떤 스킬을 가져오시겠습니까?\n"
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
					System.out.println("어떤 스킬을 가져오시겠습니까?\n"
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
				System.out.println("스킬 리스르 종료를 원하시면 exit를 눌러주세요");
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
					// Thread로 게임 종료 문구 알리기 
				}
			}
		
		}catch(Exception e) {
			System.out.println("입력 오류!");
		}
	}
	}

}
}

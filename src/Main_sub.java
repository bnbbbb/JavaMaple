import java.sql.Savepoint;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Boss.BlackSlime;
import Boss.Boss;
import Boss.MolKing;
import Boss.Ravana;
import Character.Luminus;
import NPC.Manzi;

public class Main_sub {
	
	static void indent() {
		System.out.printf("\n\t\t\t\t\tENTER\n");
		Scanner ch = new Scanner(System.in) ;
				ch.nextLine();
			
			}
	
	static Queue inventory_l = new LinkedList();
	
//	static Queue armor = new LinkedList();

	static void save(String input) {
		
			if(inventory_l.size()<5) 
				inventory_l.offer(input);
				
			else System.out.println("인벤토리가 꽉 찼습니다.");
			
		}
	
	static void battle (Luminus lu ,Boss boss) {
		
		while(true) {
						Scanner input = new Scanner(System.in);
						
						System.out.println("\n[Battle]어떤 행동을 하시겠습니까 >>");
						String act = input.nextLine();
				if("q".equals(act)) {
						lu.attack(boss);
						if(boss.getHp()>0)
								System.out.printf("보스 HP = "+boss.getHp());		
						else
								System.out.println("보스가 죽었습니다.");
						}
				if ("w".equals(act)) {
							System.out.println("힐!");
							lu.heal();
						
						}
				if("e".equals(act)) {
					System.out.println("대기");
						}
				
				if(boss.getHp()<=0) {
					System.out.println("전투에서 승리했습니다.\n");
						break;
						}
	
		indent();
		boss.attack(lu);
}
		

	}
	// 인물 <> 몬스터 ## 인벤 || 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Luminus lu = new Luminus();
		int num = 0, num1= 1;
		//하인즈 --> 전체적인 개요 (비보에 대한 설명 )
		save("|두루마기|");
//		
		while(true) {
		Scanner input = new Scanner(System.in);
		System.out.println("->어디로 이동하시겠습니까  / (인벤토리 보려면 :i 입니다)   ");

		String world = input.nextLine();
		
			if("페리온".equals(world)) {// 만지 
//					System.out.println("\n[페리온] 으로 왔습니다.");indent();
					lu.location ="페리온";
		
					Manzi manzi = new Manzi();
					manzi.story1();indent();
					
					System.out.printf("|비보1|을 획득합니다.");indent();
					lu.LevelUp();indent();
					System.out.printf("[세레니티]로 가서 <비어만>과 대화하십시오.>>");indent();
	
					save("비보1");
					num1++; //2
					
			}else if("커닝시티".equals(world) && ( lu.lv >= 10)){  
					System.out.println("\n[커닝시티]로 왔습니다.");
					lu.location ="커닝시티";
					
					System.out.println("\t#블랙 슬라임#이 나타났습니다 ");
					System.out.println("*************전투가 시작됩니다.**************************\n");
//					
					battle(lu, new BlackSlime());
					

					lu.LevelUp(4);indent();
					System.out.printf("|비보2|을 획득합니다.");indent();
					
					lu.LevelUp(3);indent();
					System.out.printf("[세레니티]로 가서 <비어만>과 대화하십시오.>>");indent();
		
					save("|비보2|");
					num1++;//4
					
			}else if("리에나".equals(world) && ( lu.lv>= 20)) {
					System.out.println("\n[리에나]로 왔습니다");
					lu.location ="리에나";
					
					System.out.println("#몰킹#이 나타났습니다");
					battle(lu, new MolKing());
					
					lu.LevelUp(5);indent();
					System.out.printf("|비보3|를 획득합니다 ");indent();
					lu.LevelUp(3);indent();
					System.out.printf("[세레니티]로 가서 <비어만>과 대화하십시오.>>");indent();
					save("|비보4|");
					num1++;//6
					
			}else if("황금사원".equals(world) &&(lu.lv >= 30)){
					System.out.println("\n[황금 사원]으롤 왔습니다.");
					lu.location="황금사원";
					
					System.out.println("#라바나#가 나타났습니다 ");
					battle(lu,new Ravana());
					
					lu.LevelUp();indent();
					System.out.printf("|궁극의_비보|을 획득합니다.");indent();
					lu.LevelUp();indent();
					
					save("궁극의_비보");
					num1++;//8
					
			}else if("i".equals(world)) {
				
					LinkedList list = (LinkedList)inventory_l;
					
					final int SIZE = list.size();
					for(int i = 0; i<SIZE;i++)
						System.out.println(i+1+"."+list.get(i));
				
			}else if("도움말 ".equals(world)) {
					System.out.println("도움말을 줍니다");
						
			}else if("세레니티".equals(world) && (num1%2==0)) {
						System.out.println("\n[세레니티]로 이동합니다");
						lu.location="세레니티";
				
				if(num== 0) {
						System.out.println("[페리온] 끝 입니다.\n");
						lu.LevelUp(4);indent();
							}
				
				else if ( num ==1) {
					
						System.out.println("[커닝시티] 끝 입니다.\n");
						lu.LevelUp(3);indent();
				}else if ( num ==2) {
				
						System.out.println("[리에나] 끝 입니다.\n");
						lu.LevelUp(2);indent();
				
				}else if( num == 3) {
						System.out.println("[황금사원] 끝 입니다\n");
						break;
				}	

			num++;num1++; //3 //5 //7
		}else System.out.println("단계를 따라가십시오.\n현재 레벨 ="+lu.lv+"\n1~10 [페리온] -> [세레니티]\n11~20 [커닝시티] -> [세레니티] \n"
				+ "21~30 [리에나] -> [세레니티]\n31~40 [황금사원] -> [세레니티]\n");
		
						}//while
		
		System.out.println("2대 마스터 등장 ");
		BlackSlime boss= new BlackSlime();
		lu.attack(boss);
//		
		
		
		
				}//main
		}//class
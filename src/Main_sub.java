import java.sql.Savepoint;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Boss.BlackSlime;
import Boss.Boss;
import Boss.MolKing;
import Boss.Ravana;
import Character.Luminus;
import NPC.DarkRoad1;
import NPC.Manzi1;
import Thread.LoadingThread;
import scene.Battle;

public class Main_sub {
	
   static void printSpace() {
	        for (int i = 0; i < 60; i++) {
	            System.out.println("");
	        }
	  	    }
	   
	static void indent() {
		System.out.printf("\n\t\t\t\t\tENTER\n");
		Scanner ch = new Scanner(System.in) ;
				ch.nextLine();
			
			}
	static void sleep_15() {
		
		try {
            Thread.sleep(1500);
        } catch (InterruptedException e) { }
	
	}
	
	static Queue inventory_l = new LinkedList();
	
//	static Queue armor = new LinkedList();

	static void save(String input) {
		
			if(inventory_l.size()<5) 
				inventory_l.offer(input);
				
			else System.out.println("인벤토리가 꽉 찼습니다.");
			
		}
	
	
	// 인물 <> 몬스터 ## 인벤 || 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//__________________________________________________________
//화면 구성 
		Battle battle = new Battle();
		
		
// __________________________________________________________
		Luminus lu = new Luminus();
		int num = 0, num1= 1;
//		//하인즈 --> 전체적인 개요 (비보에 대한 설명 )
//		save("|두루마기|");
////		
//		Thread loading = new Thread(new LoadingThread("loading"));
//		loading.start();
//		try {
//			loading.join();
//		}catch (InterruptedException e) {}
//		
//		while(true) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("<단계>\n=========================\n 1~10 [페리온]  -> [세레니티]\n10~20 [커닝시티] -> [세레니티]\n"
//				+ "20~30 [리에나]  -> [세레니티]\n30~40 [황금사원] -> [세레니티]\n==========================\n\n[현재 레벨 ="+lu.lv+"]\n");
//		System.out.println("->어디로 이동하시겠습니까  / (인벤토리 보려면 :i 입니다)   ");
//
//		String world = input.nextLine();
//		
//			if("페리온".equals(world)) {// 만지 
////					System.out.println("\n[페리온] 으로 왔습니다.");indent();s
//					printSpace();
//					Thread p = new Thread(new LoadingThread("Pmove"));
//					p.start();
//					try {
//						p.join();
//					}catch (InterruptedException e) {}
//				
//					System.out.println("\n__________[페리온]____________________\n");
//					lu.location ="페리온";
//		
//			
//					Thread manzi1 = new Thread(new Manzi1());
//					manzi1.start();
//					 try {
//						 manzi1.join();
//				        } catch (InterruptedException e) {
//				            e.printStackTrace();
//				        }
//					 
//					indent();
//					
//					System.out.printf("|비보1|을 획득합니다.");indent();
//					save("비보1");
//					lu.LevelUp();indent();
//					printSpace();
//					System.out.printf("[세레니티]로 가서 <비어만>과 대화하십시오.>>");indent();
//	
//				
//					num1++; //2
//					
//			}else if("커닝시티".equals(world) && ( lu.lv >= 10)){  
//					printSpace();
//					Thread c = new Thread(new LoadingThread("Cmove"));
//					c.start();
//				try {
//					c.join();
//				}catch (InterruptedException e) {}
//				
//					System.out.println("\n__________[커닝시티]____________________\n");
//					lu.location ="커닝시티";
//					
//					Thread darkroad1 = new Thread(new DarkRoad1());
//					darkroad1.start();
//					 try {
//						 darkroad1.join();
//				        } catch (InterruptedException e) {
//				            e.printStackTrace();
//				        }
//					 
//					indent();
//					System.out.println("\t#블랙 슬라임#이 나타났습니다 ");
//					indent();
////					System.out.println("*************전투가 시작됩니다.**************************\n");
//					Thread b= new Thread(new LoadingThread("battle"));
//					b.start();
//					try {
//						b.join();
//					}catch (InterruptedException e) {}
//					battle(lu, new BlackSlime());
//					
//
//					lu.LevelUp(4);indent();
//					System.out.printf("|비보2|을 획득합니다.");indent();
//					save("|비보2|");
//					
//					lu.LevelUp(3);indent();
//					printSpace();
//					System.out.printf("[세레니티]로 가서 <비어만>과 대화하십시오.>>");indent();
//		
//					
//					num1++;//4
//					
//			}else if("리에나".equals(world) && ( lu.lv>= 20)) {
//				printSpace();
//				Thread l = new Thread(new LoadingThread("Lmove"));
//					l.start();
//				try {
//					l.join();
//				}catch (InterruptedException e) {}
//				
//					System.out.println("\n__________[리에나]____________________\n");
//					lu.location ="리에나";
//					
//					System.out.println("\t#몰킹#이 나타났습니다");indent();
//					
//					Thread b= new Thread(new LoadingThread("battle"));
//					b.start();
//					try {
//						b.join();
//					}catch (InterruptedException e) {}
//					
//					battle(lu, new MolKing());
//					
//					lu.LevelUp(5);indent();
//					System.out.printf("|비보3|를 획득합니다 ");indent();
//					save("|비보4|");
//					lu.LevelUp(3);indent();
//					printSpace();
//					System.out.printf("[세레니티]로 가서 <비어만>과 대화하십시오.>>");indent();
//					
//					num1++;//6
//					
//			}else if("황금사원".equals(world) &&(lu.lv >= 30)){
//				printSpace();
//				Thread h = new Thread(new LoadingThread("Hmove"));indent();
//					h.start();
//				try {
//					h.join();
//				}catch (InterruptedException e) {}
//				
//					System.out.println("\n__________[황금 사원]____________________\n");
//					lu.location="황금사원";
//					
//					indent();
//					System.out.println("\t#라바나#가 나타났습니다 ");
//					indent();
//					
//					Thread b= new Thread(new LoadingThread("battle"));
//					b.start();
//					try {
//						b.join();
//					}catch (InterruptedException e) {}
//					
//					battle(lu,new Ravana());
//					
//					lu.LevelUp();indent();
//					System.out.printf("|궁극의_비보|을 획득합니다.");indent();
//					save("궁극의_비보");
//					printSpace();
//					System.out.printf("[세레니티]로 가서 <비어만>과 대화하십시오.>>");indent();
//					
//					
//					lu.LevelUp();indent();
//					
//					
//					num1++;//8
//					
//			}else if("i".equals(world)) {
//				
//					LinkedList list = (LinkedList)inventory_l;
//					
//					final int SIZE = list.size();
//					for(int i = 0; i<SIZE;i++)
//						System.out.println(i+1+"."+list.get(i));
//				
//			}else if("도움말 ".equals(world)) {
//					
//					System.out.println("도움말을 줍니다");
//						
//			}else if("세레니티".equals(world) && (num1%2==0)) {
//				printSpace();
//				Thread s = new Thread(new LoadingThread("Smove"));
//					s.start();
//				try {
//					s.join();
//				}catch (InterruptedException e) {}
//				
//						System.out.println("\n__________[세레니티]____________________\n");
//						lu.location="세레니티";
//				
//				if(num== 0) {
//						
//						System.out.println("[페리온] 끝 입니다.\n");indent();
//						lu.LevelUp(4);indent();
//						
//						System.out.printf("\n[커닝시티]로 가서 <다크로드>와 대화하십시오.>>");indent();
//						lu.LevelUp(4);indent();
//							}
//				
//				else if ( num ==1) {
//					
//						System.out.println("[커닝시티] 끝 입니다.\n");indent();
//						lu.LevelUp(3);indent();
//						System.out.printf("\n[리에나]로 가서 <몰킹>을  처치 하십시오>>");indent();
//						lu.LevelUp(3);indent();
//				}else if ( num ==2) {
//						
//						System.out.println("[리에나] 끝 입니다.\n");indent();
//						lu.LevelUp(2);indent();
//				
//				}else if( num == 3) {
//						
//						System.out.println("[황금사원] 끝 입니다\n");
//						
//						break;
//				}	
//
//			num++;num1++; //3 //5 //7
//		}else	{ 		printSpace();
//						System.out.println("!!!!!!!!!단계를 따라가십시오!!!!!!!!!!!!\n\n"); }
//							
//		
//						}//while
//		
//		printSpace();
//		System.out.println("2대 마스터 등장 ");
		BlackSlime bs= new BlackSlime();
		System.out.println("\t#블랙 슬라임#이 나타났습니다\n");
		sleep_15();
//		System.out.println("*************전투가 시작됩니다.**************************\n");
		Thread b= new Thread(new LoadingThread("battle"));
		b.start();
		try {
			b.join();
		}catch (InterruptedException e) {}
		
		battle.print(lu, bs);		
		
		
				}//main
		}//class
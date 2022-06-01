import java.sql.Savepoint;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Boss.BlackSlime;
import Boss.BlackWizard;
import Boss.Boss;
import Boss.MolKing;
import Boss.Ravana;
import Character.Luminus;
import NPC.DarkRoad1;
import NPC.GoldTemple;
import NPC.Hainz;
import NPC.Manzi1;
import NPC.Second_Master;
import NPC.Viouwan;
import Thread.LoadingThread;
import scene.Battle;
import scene.Dungeon;

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
//	static Queue inventory_P = new LinkedList();
	
//	static Queue armor = new LinkedList();

	static void save(String input) {
		
		System.out.println(input+"을 획득했습니다.\n");
		
			if(inventory_l.size()<5) 
				inventory_l.offer(input);
				
			
			else System.out.println("인벤토리가 꽉 찼습니다.");
			
		}
	
	static Scanner input = new Scanner(System.in);
	// 인물 <> 몬스터 ## 인벤 || 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//__________________________________________________________
//화면 구성 
		Battle battle = new Battle();
		Dungeon dungeon = new Dungeon();
		
		
// __________________________________________________________
	
		Start_Story story = new Start_Story();
		
//		story.start_story();
//		story.birth();
//				Thread loading1 = new Thread(new LoadingThread("loading"));
//				loading1.start();
//				try {
//					loading1.join();
//				}catch (InterruptedException e) {}
				
		
		
	
		
		Luminus lu = new Luminus();
		int num = 0, num1= 1;
		//하인즈 --> 전체적인 개요 (비보에 대한 설명 )
		save("|두루마기|");
		
				Thread Hainz = new Thread(new Hainz());
				Hainz.start();
				 try {
					 Hainz.join();
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
				
				Thread loading2 = new Thread(new LoadingThread("loading"));
				loading2.start();
				try {
					loading2.join();
				}catch (InterruptedException e) {}
				
				Thread v1 = new Thread(new Viouwan("start"));
				v1.start();
				try {
					v1.join();
				}catch (InterruptedException e) {}
				
		while(true) {
	
		System.out.println("<단계>\n=========================\n 1~10 [페리온]  -> [세레니티]\n10~20 [커닝시티] -> [세레니티]\n"
				+ "20~30 [리에나]  -> [세레니티]\n30~40 [황금사원] -> [세레니티]\n==========================\n\n[현재 레벨 ="+lu.lv+"]\n");
		System.out.println("->어디로 이동하시겠습니까  / (인벤토리 보려면 : i 입니다)   ");

		String world = input.nextLine();
		
			if("페리온".equals(world)) {// 만지 
					
					printSpace();
					Thread p = new Thread(new LoadingThread("Pmove"));
					
					p.start();
					try {
						p.join();
					}catch (InterruptedException e) {}
				
					System.out.println("\n__________[페리온]____________________\n");
					lu.location ="페리온";
		
			
					Thread manzi1 = new Thread(new Manzi1());
					manzi1.start();
					 try {
						 manzi1.join();
				        } catch (InterruptedException e) {
				            e.printStackTrace();
				        }
					 
					indent();
					
					
					save("|태양의 비보|");
					lu.LevelUp();indent();//6
					printSpace();
					System.out.printf("[세레니티]로 가서 <비어만>과 대화하십시오.>>");indent();
	
				
					num1++; //2
					
			}else if("커닝시티".equals(world) && ( lu.lv >= 10)){  
					printSpace();
					Thread c = new Thread(new LoadingThread("Cmove"));
					c.start();
				try {
					c.join();
				}catch (InterruptedException e) {}
				
					System.out.println("\n__________[커닝시티]____________________\n");
					lu.location ="커닝시티";
					
							Thread darkroad1 = new Thread(new DarkRoad1("start1"));
							darkroad1.start();
							 try {
								 darkroad1.join();
						        } catch (InterruptedException e) {
						            e.printStackTrace();
						        }
					 
					indent();
					
							Thread darkroad2 = new Thread(new DarkRoad1("start2"));
							darkroad2.start();
							 try {
								 darkroad2.join();
						        } catch (InterruptedException e) {
						            e.printStackTrace();
						        } 
					 indent();
					BlackSlime bs= new BlackSlime();
					System.out.println("\t#블랙 슬라임#이 나타났습니다 ");
					indent();
		
					System.out.println("*************전투가 시작됩니다.**************************\n");
					Thread b= new Thread(new LoadingThread("battle"));
					b.start();
					try {
						b.join();
					}catch (InterruptedException e) {}
		
					battle.print(lu, bs);	

					lu.LevelUp(4);indent();//14
					System.out.printf("|어둠의 비보|을 획득합니다.");indent();
					save("|어둠의 비보|");
					
					lu.LevelUp(3);indent();//17
					printSpace();
					System.out.printf("[세레니티]로 가서 <비어만>과 대화하십시오.>>");indent();
		
					
					num1++;//4
					
			}else if("리에나".equals(world) && ( lu.lv>= 20)) {
				printSpace();
				Thread l = new Thread(new LoadingThread("Lmove"));
					l.start();
				try {
					l.join();
				}catch (InterruptedException e) {}
				
					System.out.println("\n__________[리에나]____________________\n");
					lu.location ="리에나";
					
					System.out.println("\t#몰킹#이 나타났습니다");indent();
					MolKing ml= new MolKing();
					Thread b= new Thread(new LoadingThread("battle"));
					b.start();
					try {
						b.join();
					}catch (InterruptedException e) {}
					
					battle.print(lu,ml);
					
					lu.LevelUp(3);indent();//23
					
					save("|얼음의 비보|");
					lu.LevelUp(3);indent();//26
					printSpace();
					System.out.printf("[세레니티]로 가서 <비어만>과 대화하십시오.>>");indent();
					
					num1++;//6
					
			}else if("황금사원".equals(world) &&(lu.lv >= 30)){
				printSpace();
				Thread h = new Thread(new LoadingThread("Hmove"));indent();
					h.start();
				try {
					h.join();
				}catch (InterruptedException e) {}
				
					System.out.println("\n__________[황금 사원]____________________\n");
					lu.location="황금사원";
									Thread g2 = new Thread(new GoldTemple());
									g2.start();
									try {
										g2.join();
									} catch (InterruptedException e) {
							        	e.printStackTrace();
							        }
				
					Ravana ra= new Ravana();
					System.out.println("\t#라바나#가 나타났습니다 ");
					indent();
					
					Thread b= new Thread(new LoadingThread("battle"));
					b.start();
					
					try {
						b.join();
					}catch (InterruptedException e) {}
			
					
					battle.print(lu,ra);
					lu.LevelUp(2);indent();//35
					System.out.printf("|궁극의_비보|을 획득합니다.");indent();
					save("|궁극의의_비보|");
					printSpace();
					System.out.printf("[세레니티]로 가서 <비어만>과 대화하십시오.>>");indent();
					
					
					lu.LevelUp();indent();
					
					
					num1++;//8
					
			}else if("i".equals(world)) {
				
					LinkedList list = (LinkedList)inventory_l;
					
					final int SIZE = list.size();
					for(int i = 0; i<SIZE;i++)
						System.out.println(i+1+"."+list.get(i));
				
			}else if("도움말 ".equals(world)) {
					
					System.out.println("도움말을 줍니다");
						
			}else if("세레니티".equals(world) && (num1%2==0)) {
				printSpace();
				Thread s = new Thread(new LoadingThread("Smove"));
					s.start();
				try {
					s.join();
				}catch (InterruptedException e) {}
				
						System.out.println("\n__________[세레니티]____________________\n");
						lu.location="세레니티";
				
				if(num== 0) {
						
						
						lu.LevelUp(2);indent();//8		
						
						System.out.println("[비어완] : [커닝시티] 정보상이 보내온 정보에 따르면 다크로드 문은 대대로 오로라에 속해있었다고합니다\n");indent();
						System.out.println("\t그에게 미리 접촉해 [루미너스]님이 간다고 전해놓은 상태입니다.");indent();
					
						lu.LevelUp(2);indent();//8	
						System.out.printf("\n[커닝시티]로 가서 <다크로드>와 대화하십시오.>>");indent();
						lu.LevelUp(2);indent();//10
							}
				
				else if ( num ==1) {
					
						System.out.println("[비어완] : [리에나]의 리엔은 외부인에 매우 적대적인 인물입니다.");indent();
						System.out.print("[리에나]로 가서 <몰킹>을  처치 하면 더 나을지도 모릅니다.>>");indent();
						lu.LevelUp(1);indent();	//18
						System.out.println("[비어만] : 행운을 빕니다....");indent();
						lu.LevelUp(2);indent();//20
				}else if ( num ==2) {
						
						
						
						Thread v2 = new Thread(new Viouwan("start2"));indent();
						v2.start();
					try {
						v2.join();
					}catch (InterruptedException e) {};indent();
					
						lu.LevelUp();indent();//30
				}else if( num == 3) {
						
						System.out.println("드디어 비보를 다 모았군요 .....\n");indent();
						lu.LevelUp();
						
						break;
				}	

			num++;num1++; //3 //5 //7
		}else	{ 		printSpace();
						System.out.println("!!!!!!!!!단계를 따라가십시오!!!!!!!!!!!!\n\n"); }
							
		
						}//while
		
		
		printSpace();
		System.out.println("비보들이 빛을 내며 무언가 나옵니다!!! ");
		indent();
		Thread m2 = new Thread(new Second_Master());
		m2.start();
		 try {
			 m2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		
		 
		 while(true) {
			 System.out.print("던전에 입장하시겠습니까 ? >>");
			
			 
		 }
//***************************************************************************************
//보스 1 2 3  확인용 		
//		lu.LevelUp(14);
//		BlackSlime bs= new BlackSlime();
//		System.out.println("\n\t#블랙 슬라임#이 나타났습니다\n");
//		sleep_15();
//		System.out.println("*************전투가 시작됩니다.**************************\n");
//		Thread b= new Thread(new LoadingThread("battle"));
//		b.start();
//		try {
//			b.join();
//		}catch (InterruptedException e) {}
//		
//		battle.print(lu, bs);		
//***************************************************************************************
// 던전 
//
		
//***************************************************************************************	


				}//main
		}//class
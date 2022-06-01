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
		
		System.out.println(input+"�� ȹ���߽��ϴ�.\n");
		
			if(inventory_l.size()<5) 
				inventory_l.offer(input);
				
			
			else System.out.println("�κ��丮�� �� á���ϴ�.");
			
		}
	
	static Scanner input = new Scanner(System.in);
	// �ι� <> ���� ## �κ� || 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//__________________________________________________________
//ȭ�� ���� 
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
		//������ --> ��ü���� ���� (�񺸿� ���� ���� )
		save("|�η縶��|");
		
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
	
		System.out.println("<�ܰ�>\n=========================\n 1~10 [�丮��]  -> [������Ƽ]\n10~20 [Ŀ�׽�Ƽ] -> [������Ƽ]\n"
				+ "20~30 [������]  -> [������Ƽ]\n30~40 [Ȳ�ݻ��] -> [������Ƽ]\n==========================\n\n[���� ���� ="+lu.lv+"]\n");
		System.out.println("->���� �̵��Ͻðڽ��ϱ�  / (�κ��丮 ������ : i �Դϴ�)   ");

		String world = input.nextLine();
		
			if("�丮��".equals(world)) {// ���� 
					
					printSpace();
					Thread p = new Thread(new LoadingThread("Pmove"));
					
					p.start();
					try {
						p.join();
					}catch (InterruptedException e) {}
				
					System.out.println("\n__________[�丮��]____________________\n");
					lu.location ="�丮��";
		
			
					Thread manzi1 = new Thread(new Manzi1());
					manzi1.start();
					 try {
						 manzi1.join();
				        } catch (InterruptedException e) {
				            e.printStackTrace();
				        }
					 
					indent();
					
					
					save("|�¾��� ��|");
					lu.LevelUp();indent();//6
					printSpace();
					System.out.printf("[������Ƽ]�� ���� <��>�� ��ȭ�Ͻʽÿ�.>>");indent();
	
				
					num1++; //2
					
			}else if("Ŀ�׽�Ƽ".equals(world) && ( lu.lv >= 10)){  
					printSpace();
					Thread c = new Thread(new LoadingThread("Cmove"));
					c.start();
				try {
					c.join();
				}catch (InterruptedException e) {}
				
					System.out.println("\n__________[Ŀ�׽�Ƽ]____________________\n");
					lu.location ="Ŀ�׽�Ƽ";
					
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
					System.out.println("\t#�� ������#�� ��Ÿ�����ϴ� ");
					indent();
		
					System.out.println("*************������ ���۵˴ϴ�.**************************\n");
					Thread b= new Thread(new LoadingThread("battle"));
					b.start();
					try {
						b.join();
					}catch (InterruptedException e) {}
		
					battle.print(lu, bs);	

					lu.LevelUp(4);indent();//14
					System.out.printf("|����� ��|�� ȹ���մϴ�.");indent();
					save("|����� ��|");
					
					lu.LevelUp(3);indent();//17
					printSpace();
					System.out.printf("[������Ƽ]�� ���� <��>�� ��ȭ�Ͻʽÿ�.>>");indent();
		
					
					num1++;//4
					
			}else if("������".equals(world) && ( lu.lv>= 20)) {
				printSpace();
				Thread l = new Thread(new LoadingThread("Lmove"));
					l.start();
				try {
					l.join();
				}catch (InterruptedException e) {}
				
					System.out.println("\n__________[������]____________________\n");
					lu.location ="������";
					
					System.out.println("\t#��ŷ#�� ��Ÿ�����ϴ�");indent();
					MolKing ml= new MolKing();
					Thread b= new Thread(new LoadingThread("battle"));
					b.start();
					try {
						b.join();
					}catch (InterruptedException e) {}
					
					battle.print(lu,ml);
					
					lu.LevelUp(3);indent();//23
					
					save("|������ ��|");
					lu.LevelUp(3);indent();//26
					printSpace();
					System.out.printf("[������Ƽ]�� ���� <��>�� ��ȭ�Ͻʽÿ�.>>");indent();
					
					num1++;//6
					
			}else if("Ȳ�ݻ��".equals(world) &&(lu.lv >= 30)){
				printSpace();
				Thread h = new Thread(new LoadingThread("Hmove"));indent();
					h.start();
				try {
					h.join();
				}catch (InterruptedException e) {}
				
					System.out.println("\n__________[Ȳ�� ���]____________________\n");
					lu.location="Ȳ�ݻ��";
									Thread g2 = new Thread(new GoldTemple());
									g2.start();
									try {
										g2.join();
									} catch (InterruptedException e) {
							        	e.printStackTrace();
							        }
				
					Ravana ra= new Ravana();
					System.out.println("\t#��ٳ�#�� ��Ÿ�����ϴ� ");
					indent();
					
					Thread b= new Thread(new LoadingThread("battle"));
					b.start();
					
					try {
						b.join();
					}catch (InterruptedException e) {}
			
					
					battle.print(lu,ra);
					lu.LevelUp(2);indent();//35
					System.out.printf("|�ñ���_��|�� ȹ���մϴ�.");indent();
					save("|�ñ�����_��|");
					printSpace();
					System.out.printf("[������Ƽ]�� ���� <��>�� ��ȭ�Ͻʽÿ�.>>");indent();
					
					
					lu.LevelUp();indent();
					
					
					num1++;//8
					
			}else if("i".equals(world)) {
				
					LinkedList list = (LinkedList)inventory_l;
					
					final int SIZE = list.size();
					for(int i = 0; i<SIZE;i++)
						System.out.println(i+1+"."+list.get(i));
				
			}else if("���� ".equals(world)) {
					
					System.out.println("������ �ݴϴ�");
						
			}else if("������Ƽ".equals(world) && (num1%2==0)) {
				printSpace();
				Thread s = new Thread(new LoadingThread("Smove"));
					s.start();
				try {
					s.join();
				}catch (InterruptedException e) {}
				
						System.out.println("\n__________[������Ƽ]____________________\n");
						lu.location="������Ƽ";
				
				if(num== 0) {
						
						
						lu.LevelUp(2);indent();//8		
						
						System.out.println("[����] : [Ŀ�׽�Ƽ] �������� ������ ������ ������ ��ũ�ε� ���� ���� ���ζ� �����־��ٰ��մϴ�\n");indent();
						System.out.println("\t�׿��� �̸� ������ [��̳ʽ�]���� ���ٰ� ���س��� �����Դϴ�.");indent();
					
						lu.LevelUp(2);indent();//8	
						System.out.printf("\n[Ŀ�׽�Ƽ]�� ���� <��ũ�ε�>�� ��ȭ�Ͻʽÿ�.>>");indent();
						lu.LevelUp(2);indent();//10
							}
				
				else if ( num ==1) {
					
						System.out.println("[����] : [������]�� ������ �ܺ��ο� �ſ� �������� �ι��Դϴ�.");indent();
						System.out.print("[������]�� ���� <��ŷ>��  óġ �ϸ� �� �������� �𸨴ϴ�.>>");indent();
						lu.LevelUp(1);indent();	//18
						System.out.println("[��] : ����� ���ϴ�....");indent();
						lu.LevelUp(2);indent();//20
				}else if ( num ==2) {
						
						
						
						Thread v2 = new Thread(new Viouwan("start2"));indent();
						v2.start();
					try {
						v2.join();
					}catch (InterruptedException e) {};indent();
					
						lu.LevelUp();indent();//30
				}else if( num == 3) {
						
						System.out.println("���� �񺸸� �� ��ұ��� .....\n");indent();
						lu.LevelUp();
						
						break;
				}	

			num++;num1++; //3 //5 //7
		}else	{ 		printSpace();
						System.out.println("!!!!!!!!!�ܰ踦 ���󰡽ʽÿ�!!!!!!!!!!!!\n\n"); }
							
		
						}//while
		
		
		printSpace();
		System.out.println("�񺸵��� ���� ���� ���� ���ɴϴ�!!! ");
		indent();
		Thread m2 = new Thread(new Second_Master());
		m2.start();
		 try {
			 m2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		
		 
		 while(true) {
			 System.out.print("������ �����Ͻðڽ��ϱ� ? >>");
			
			 
		 }
//***************************************************************************************
//���� 1 2 3  Ȯ�ο� 		
//		lu.LevelUp(14);
//		BlackSlime bs= new BlackSlime();
//		System.out.println("\n\t#�� ������#�� ��Ÿ�����ϴ�\n");
//		sleep_15();
//		System.out.println("*************������ ���۵˴ϴ�.**************************\n");
//		Thread b= new Thread(new LoadingThread("battle"));
//		b.start();
//		try {
//			b.join();
//		}catch (InterruptedException e) {}
//		
//		battle.print(lu, bs);		
//***************************************************************************************
// ���� 
//
		
//***************************************************************************************	


				}//main
		}//class
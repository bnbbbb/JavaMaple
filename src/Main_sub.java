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
				
			else System.out.println("�κ��丮�� �� á���ϴ�.");
			
		}
	
	
	// �ι� <> ���� ## �κ� || 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//__________________________________________________________
//ȭ�� ���� 
		Battle battle = new Battle();
		
		
// __________________________________________________________
		Luminus lu = new Luminus();
		int num = 0, num1= 1;
//		//������ --> ��ü���� ���� (�񺸿� ���� ���� )
//		save("|�η縶��|");
////		
//		Thread loading = new Thread(new LoadingThread("loading"));
//		loading.start();
//		try {
//			loading.join();
//		}catch (InterruptedException e) {}
//		
//		while(true) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("<�ܰ�>\n=========================\n 1~10 [�丮��]  -> [������Ƽ]\n10~20 [Ŀ�׽�Ƽ] -> [������Ƽ]\n"
//				+ "20~30 [������]  -> [������Ƽ]\n30~40 [Ȳ�ݻ��] -> [������Ƽ]\n==========================\n\n[���� ���� ="+lu.lv+"]\n");
//		System.out.println("->���� �̵��Ͻðڽ��ϱ�  / (�κ��丮 ������ :i �Դϴ�)   ");
//
//		String world = input.nextLine();
//		
//			if("�丮��".equals(world)) {// ���� 
////					System.out.println("\n[�丮��] ���� �Խ��ϴ�.");indent();s
//					printSpace();
//					Thread p = new Thread(new LoadingThread("Pmove"));
//					p.start();
//					try {
//						p.join();
//					}catch (InterruptedException e) {}
//				
//					System.out.println("\n__________[�丮��]____________________\n");
//					lu.location ="�丮��";
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
//					System.out.printf("|��1|�� ȹ���մϴ�.");indent();
//					save("��1");
//					lu.LevelUp();indent();
//					printSpace();
//					System.out.printf("[������Ƽ]�� ���� <��>�� ��ȭ�Ͻʽÿ�.>>");indent();
//	
//				
//					num1++; //2
//					
//			}else if("Ŀ�׽�Ƽ".equals(world) && ( lu.lv >= 10)){  
//					printSpace();
//					Thread c = new Thread(new LoadingThread("Cmove"));
//					c.start();
//				try {
//					c.join();
//				}catch (InterruptedException e) {}
//				
//					System.out.println("\n__________[Ŀ�׽�Ƽ]____________________\n");
//					lu.location ="Ŀ�׽�Ƽ";
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
//					System.out.println("\t#�� ������#�� ��Ÿ�����ϴ� ");
//					indent();
////					System.out.println("*************������ ���۵˴ϴ�.**************************\n");
//					Thread b= new Thread(new LoadingThread("battle"));
//					b.start();
//					try {
//						b.join();
//					}catch (InterruptedException e) {}
//					battle(lu, new BlackSlime());
//					
//
//					lu.LevelUp(4);indent();
//					System.out.printf("|��2|�� ȹ���մϴ�.");indent();
//					save("|��2|");
//					
//					lu.LevelUp(3);indent();
//					printSpace();
//					System.out.printf("[������Ƽ]�� ���� <��>�� ��ȭ�Ͻʽÿ�.>>");indent();
//		
//					
//					num1++;//4
//					
//			}else if("������".equals(world) && ( lu.lv>= 20)) {
//				printSpace();
//				Thread l = new Thread(new LoadingThread("Lmove"));
//					l.start();
//				try {
//					l.join();
//				}catch (InterruptedException e) {}
//				
//					System.out.println("\n__________[������]____________________\n");
//					lu.location ="������";
//					
//					System.out.println("\t#��ŷ#�� ��Ÿ�����ϴ�");indent();
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
//					System.out.printf("|��3|�� ȹ���մϴ� ");indent();
//					save("|��4|");
//					lu.LevelUp(3);indent();
//					printSpace();
//					System.out.printf("[������Ƽ]�� ���� <��>�� ��ȭ�Ͻʽÿ�.>>");indent();
//					
//					num1++;//6
//					
//			}else if("Ȳ�ݻ��".equals(world) &&(lu.lv >= 30)){
//				printSpace();
//				Thread h = new Thread(new LoadingThread("Hmove"));indent();
//					h.start();
//				try {
//					h.join();
//				}catch (InterruptedException e) {}
//				
//					System.out.println("\n__________[Ȳ�� ���]____________________\n");
//					lu.location="Ȳ�ݻ��";
//					
//					indent();
//					System.out.println("\t#��ٳ�#�� ��Ÿ�����ϴ� ");
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
//					System.out.printf("|�ñ���_��|�� ȹ���մϴ�.");indent();
//					save("�ñ���_��");
//					printSpace();
//					System.out.printf("[������Ƽ]�� ���� <��>�� ��ȭ�Ͻʽÿ�.>>");indent();
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
//			}else if("���� ".equals(world)) {
//					
//					System.out.println("������ �ݴϴ�");
//						
//			}else if("������Ƽ".equals(world) && (num1%2==0)) {
//				printSpace();
//				Thread s = new Thread(new LoadingThread("Smove"));
//					s.start();
//				try {
//					s.join();
//				}catch (InterruptedException e) {}
//				
//						System.out.println("\n__________[������Ƽ]____________________\n");
//						lu.location="������Ƽ";
//				
//				if(num== 0) {
//						
//						System.out.println("[�丮��] �� �Դϴ�.\n");indent();
//						lu.LevelUp(4);indent();
//						
//						System.out.printf("\n[Ŀ�׽�Ƽ]�� ���� <��ũ�ε�>�� ��ȭ�Ͻʽÿ�.>>");indent();
//						lu.LevelUp(4);indent();
//							}
//				
//				else if ( num ==1) {
//					
//						System.out.println("[Ŀ�׽�Ƽ] �� �Դϴ�.\n");indent();
//						lu.LevelUp(3);indent();
//						System.out.printf("\n[������]�� ���� <��ŷ>��  óġ �Ͻʽÿ�>>");indent();
//						lu.LevelUp(3);indent();
//				}else if ( num ==2) {
//						
//						System.out.println("[������] �� �Դϴ�.\n");indent();
//						lu.LevelUp(2);indent();
//				
//				}else if( num == 3) {
//						
//						System.out.println("[Ȳ�ݻ��] �� �Դϴ�\n");
//						
//						break;
//				}	
//
//			num++;num1++; //3 //5 //7
//		}else	{ 		printSpace();
//						System.out.println("!!!!!!!!!�ܰ踦 ���󰡽ʽÿ�!!!!!!!!!!!!\n\n"); }
//							
//		
//						}//while
//		
//		printSpace();
//		System.out.println("2�� ������ ���� ");
		BlackSlime bs= new BlackSlime();
		System.out.println("\t#�� ������#�� ��Ÿ�����ϴ�\n");
		sleep_15();
//		System.out.println("*************������ ���۵˴ϴ�.**************************\n");
		Thread b= new Thread(new LoadingThread("battle"));
		b.start();
		try {
			b.join();
		}catch (InterruptedException e) {}
		
		battle.print(lu, bs);		
		
		
				}//main
		}//class
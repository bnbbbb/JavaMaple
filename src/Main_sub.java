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
				
			else System.out.println("�κ��丮�� �� á���ϴ�.");
			
		}
	
	static void battle (Luminus lu ,Boss boss) {
		
		while(true) {
						Scanner input = new Scanner(System.in);
						
						System.out.println("\n[Battle]� �ൿ�� �Ͻðڽ��ϱ� >>");
						String act = input.nextLine();
				if("q".equals(act)) {
						lu.attack(boss);
						if(boss.getHp()>0)
								System.out.printf("���� HP = "+boss.getHp());		
						else
								System.out.println("������ �׾����ϴ�.");
						}
				if ("w".equals(act)) {
							System.out.println("��!");
							lu.heal();
						
						}
				if("e".equals(act)) {
					System.out.println("���");
						}
				
				if(boss.getHp()<=0) {
					System.out.println("�������� �¸��߽��ϴ�.\n");
						break;
						}
	
		indent();
		boss.attack(lu);
}
		

	}
	// �ι� <> ���� ## �κ� || 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Luminus lu = new Luminus();
		int num = 0, num1= 1;
		//������ --> ��ü���� ���� (�񺸿� ���� ���� )
		save("|�η縶��|");
//		
		while(true) {
		Scanner input = new Scanner(System.in);
		System.out.println("->���� �̵��Ͻðڽ��ϱ�  / (�κ��丮 ������ :i �Դϴ�)   ");

		String world = input.nextLine();
		
			if("�丮��".equals(world)) {// ���� 
//					System.out.println("\n[�丮��] ���� �Խ��ϴ�.");indent();
					lu.location ="�丮��";
		
					Manzi manzi = new Manzi();
					manzi.story1();indent();
					
					System.out.printf("|��1|�� ȹ���մϴ�.");indent();
					lu.LevelUp();indent();
					System.out.printf("[������Ƽ]�� ���� <��>�� ��ȭ�Ͻʽÿ�.>>");indent();
	
					save("��1");
					num1++; //2
					
			}else if("Ŀ�׽�Ƽ".equals(world) && ( lu.lv >= 10)){  
					System.out.println("\n[Ŀ�׽�Ƽ]�� �Խ��ϴ�.");
					lu.location ="Ŀ�׽�Ƽ";
					
					System.out.println("\t#�� ������#�� ��Ÿ�����ϴ� ");
					System.out.println("*************������ ���۵˴ϴ�.**************************\n");
//					
					battle(lu, new BlackSlime());
					

					lu.LevelUp(4);indent();
					System.out.printf("|��2|�� ȹ���մϴ�.");indent();
					
					lu.LevelUp(3);indent();
					System.out.printf("[������Ƽ]�� ���� <��>�� ��ȭ�Ͻʽÿ�.>>");indent();
		
					save("|��2|");
					num1++;//4
					
			}else if("������".equals(world) && ( lu.lv>= 20)) {
					System.out.println("\n[������]�� �Խ��ϴ�");
					lu.location ="������";
					
					System.out.println("#��ŷ#�� ��Ÿ�����ϴ�");
					battle(lu, new MolKing());
					
					lu.LevelUp(5);indent();
					System.out.printf("|��3|�� ȹ���մϴ� ");indent();
					lu.LevelUp(3);indent();
					System.out.printf("[������Ƽ]�� ���� <��>�� ��ȭ�Ͻʽÿ�.>>");indent();
					save("|��4|");
					num1++;//6
					
			}else if("Ȳ�ݻ��".equals(world) &&(lu.lv >= 30)){
					System.out.println("\n[Ȳ�� ���]���� �Խ��ϴ�.");
					lu.location="Ȳ�ݻ��";
					
					System.out.println("#��ٳ�#�� ��Ÿ�����ϴ� ");
					battle(lu,new Ravana());
					
					lu.LevelUp();indent();
					System.out.printf("|�ñ���_��|�� ȹ���մϴ�.");indent();
					lu.LevelUp();indent();
					
					save("�ñ���_��");
					num1++;//8
					
			}else if("i".equals(world)) {
				
					LinkedList list = (LinkedList)inventory_l;
					
					final int SIZE = list.size();
					for(int i = 0; i<SIZE;i++)
						System.out.println(i+1+"."+list.get(i));
				
			}else if("���� ".equals(world)) {
					System.out.println("������ �ݴϴ�");
						
			}else if("������Ƽ".equals(world) && (num1%2==0)) {
						System.out.println("\n[������Ƽ]�� �̵��մϴ�");
						lu.location="������Ƽ";
				
				if(num== 0) {
						System.out.println("[�丮��] �� �Դϴ�.\n");
						lu.LevelUp(4);indent();
							}
				
				else if ( num ==1) {
					
						System.out.println("[Ŀ�׽�Ƽ] �� �Դϴ�.\n");
						lu.LevelUp(3);indent();
				}else if ( num ==2) {
				
						System.out.println("[������] �� �Դϴ�.\n");
						lu.LevelUp(2);indent();
				
				}else if( num == 3) {
						System.out.println("[Ȳ�ݻ��] �� �Դϴ�\n");
						break;
				}	

			num++;num1++; //3 //5 //7
		}else System.out.println("�ܰ踦 ���󰡽ʽÿ�.\n���� ���� ="+lu.lv+"\n1~10 [�丮��] -> [������Ƽ]\n11~20 [Ŀ�׽�Ƽ] -> [������Ƽ] \n"
				+ "21~30 [������] -> [������Ƽ]\n31~40 [Ȳ�ݻ��] -> [������Ƽ]\n");
		
						}//while
		
		System.out.println("2�� ������ ���� ");
		BlackSlime boss= new BlackSlime();
		lu.attack(boss);
//		
		
		
		
				}//main
		}//class
package NPC;

import javax.xml.stream.events.StartDocument;

public class Viouwan implements Runnable{
	private String type;
	
	public Viouwan(String type) {
		this.type = type;
	}
	
	public void start() {
		
	
		String [] v1 = {"[����] : ","��","Ģ"," ","��","��"," "," "," "," "," "
				,"\n\n\t","1.�� �ʿ��� ���ζ� �ܿ��� �Ŀ�","  [����],"," [��ũ�ε�]"," [����]"," "
				,"��","�ֽ��ϴ�."," "," "," "," "," ","\n\n\t"
				,"2.���� ������ [������Ƽ]�� ���ƿɴϴ�. "," "," "," "," ","\n\n\t"
				,"Q (�⺻����)\n\n\tW (ü�� 30% ȸ��)\n\n\tR(�ñر� - �� ��ų 5���� 1�� ��밡�� )"};
		
		for(int i = 0; i<v1.length;i++) {
			System.out.print(v1[i]);

	
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {}
			
		
		}
		
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
		
		for(int i = 0 ; i<60 ; i++)
			System.out.println();
	}
	
	
	public void start2() {
		String [] v2 = {"[����] : ", "���� �����ٰ� �̷� ������ �߰��߽��ϴ� .\n\n\t","'�ñ��� ���� Ȳ������ �ѷ� �׿� ����� ����\n\n\t"
				,"Ȳ�� ����� �ѹ� ������ �� ��ġ�� ������ �����ϴ�.\n\n\t","Ȳ�� ����� �ѹ� ������ �ֽʽÿ�."};
		
	for(int i = 0; i<v2.length;i++) {
		System.out.print(v2[i]);


		try {
			Thread.sleep(400);
		}catch(InterruptedException e) {}
		
	
	
	}
	}

	@Override
	public void run() {
		
		switch(type) {
		case "start":
			start(); break;
		
		case "start2":
		start2(); break;
	}
		
	}

}

package NPC;

public class Manzi1 implements Runnable{
	
	public void run() {	
		System.out.print("[만지] :");
		
	String[] manzi1 = {"나","는"," ","마","지","막"," ","검","사","의"," ","후","예","다",".",".",".","."};
	
		for(int i = 0; i<manzi1.length;i++) {
			System.out.print(manzi1[i]);

	
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {}
	}
	}		
}


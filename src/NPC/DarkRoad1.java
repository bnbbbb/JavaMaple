package NPC;

public class DarkRoad1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("[��ũ�ε�]: ");
		String[] d1 = {"��","��","��"," ","��","��"," ","��","��"," ","��","��"," ","��","��","��",".",".",".","."};
		
		for(int i = 0; i<d1.length;i++) {
			System.out.print(d1[i]);

	
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {}
	}
	}
	
}

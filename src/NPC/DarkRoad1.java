package NPC;

public class DarkRoad1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("[다크로드]: ");
		String[] d1 = {"도","적","이"," ","되","고"," ","싶","은"," ","자","는"," ","나","에","게",".",".",".","."};
		
		for(int i = 0; i<d1.length;i++) {
			System.out.print(d1[i]);

	
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {}
	}
	}
	
}

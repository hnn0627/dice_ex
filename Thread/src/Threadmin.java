class Snail implements Runnable{
	String name;
	
	public Snail(String name){
		this.name=name;
	}
	
	
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(name+"�����尡 ����~~");
			try{
				Thread.sleep(1000); // 1�� ����
			}catch(Exception e){
				
			}
		}
	}
}

public class Threadmin {
	
	public static void main(String[] args) {
		
		//1) Runnable ��ü�� ����
		Snail sl1 = new Snail("���");
		Snail sl2 = new Snail("����");
		Snail sl3 = new Snail("����");
		
		//2) Thread ��ü�� ������ �� ������ �ȿ� Runnable ��ü�� �����Ѵ�
		Thread sr1 = new Thread(sl1);
		Thread sr2 = new Thread(sl2);
		Thread sr3 = new Thread(sl3);
		
		//3) Thread start() �޼ҵ带 ȣ��
		sr1.start(); sr2.start(); sr3.start();
			
	}
}

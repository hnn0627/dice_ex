class Snail implements Runnable{
	String name;
	
	public Snail(String name){
		this.name=name;
	}
	
	
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(name+"스레드가 기어가요~~");
			try{
				Thread.sleep(1000); // 1초 쉬기
			}catch(Exception e){
				
			}
		}
	}
}

public class Threadmin {
	
	public static void main(String[] args) {
		
		//1) Runnable 객체를 생성
		Snail sl1 = new Snail("사과");
		Snail sl2 = new Snail("포도");
		Snail sl3 = new Snail("딸기");
		
		//2) Thread 객체를 생성할 때 생성자 안에 Runnable 객체를 전달한다
		Thread sr1 = new Thread(sl1);
		Thread sr2 = new Thread(sl2);
		Thread sr3 = new Thread(sl3);
		
		//3) Thread start() 메소드를 호출
		sr1.start(); sr2.start(); sr3.start();
			
	}
}

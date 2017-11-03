package mini;
import java.util.Scanner;

public class mini_5ex9 {
	public static void main(String[] args) {
		
		boolean run=true;
		int studentnum = 0;
		int[] scores= null;
		Scanner scanner=new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수  ㅣ 2.점수입력 ㅣ 3.점수리스트 ㅣ 4.분석 ㅣ 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택>>");
			
			int selectno =scanner.nextInt();
			
			if(selectno ==1) {
			studentnum = scanner.nextInt();
			scores=new int[studentnum];
			}else if(selectno ==2) {
			for(int i=0; i<studentnum;i++) {
				System.out.println("scores["+i+"]>");
				int score=scanner.nextInt();
				scores[i]=score;
			}
			}else if(selectno ==3) {
				for(int i =0; i<studentnum; i++) {
					System.out.println("scores["+i+"]:" +scores[i]);
				}
			}else if(selectno ==4) {
				int max=0;
				int sum= 0;
				double avg=0;
				for (int i =0; i <studentnum;i++) {
					sum +=scores[i];
					if(scores[i]>max)
						max=scores[i];
				}
				avg=(double)sum/studentnum;
				System.out.println("최고 점수 :" +max);
				System.out.println("평균 점수 :" +avg);
			}else if(selectno ==5) {
				run=false;
				System.out.println("프로그램 종료");
			}
		}
		
	}
}

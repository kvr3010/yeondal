import java.util.ArrayList;
import java.util.Scanner;

public class InputClass {
	
	ArrayList<Integer> result = new ArrayList<Integer>();
	int o;
	int x;
	
	public void start() {
		Oper op = new Oper();
		
		for(;;) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 0.종료 번호선택 :");
			int select = sc.nextInt();
			if(select ==0) {
				System.out.println("종료합니다.");
				break;
			}
		
			for(int i=1; i<11; i++) {
			System.out.println("<"+i+"번>");
			boolean a = op.oper(op.Nums(), select);
			if(a) {
				o++;
			}else {
				x++;
			}
			}
			System.out.println("<결과>");
			System.out.println("정답 :"+ o +" 오답 :"+ x);
		
		}catch (Exception e) {
			System.out.println("번호(정수)를 입력하세요");
			continue;
		}
		}
		}

	
	public int asw() {
		Scanner sc = new Scanner(System.in);
		int asww = sc.nextInt();
		return asww;
	}
	
	public void count() {

	}
	
	
}

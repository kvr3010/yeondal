import java.util.ArrayList;
import java.util.Random;



public class Oper {
	
	InputClass ip = new InputClass();
	int o = 0;
	int x = 0;
	
	public ArrayList<Integer> Nums() {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random rand = new Random();
		list.add(rand.nextInt(90)+10);
		list.add(rand.nextInt(90)+10);
		return  list;
		
	}
	
	
	
	public ArrayList<Integer> end(Boolean comm) {
		ArrayList<Integer> resultt = new ArrayList<Integer>();
		if(comm) {
			o++;
			resultt.add(0, o);
		}else {
			x++;
			resultt.add(1, x);
		}
		return resultt;
	}
	
	
	public boolean oper(ArrayList<Integer> list, int select) {
		int corr = 0;
			if(select == 1) {
				System.out.print(list.get(0) + "+" + list.get(1) + "=" );
				corr = list.get(0) + list.get(1);
			}else if(select ==2) {
				System.out.print(list.get(0) + "-" + list.get(1) + "=" );
				corr = list.get(0) + list.get(1);
			}else if(select ==3) {
				System.out.print(list.get(0) + "*" + list.get(1) + "=" );
				corr = list.get(0) + list.get(1);
			}else if(select ==4) {
				System.out.print(list.get(0) + "/" + list.get(1) + "=" );
				corr = list.get(0) + list.get(1);
			}

			if(corr == ip.asw()) {
				System.out.println("정답입니다.");
				return true;
			}
			else {
					System.out.println("땡");
				return false;
			}
			
	

	 }



}

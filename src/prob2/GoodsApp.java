package prob2;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		Goods goods1 = new Goods();
		Goods goods2 = new Goods();
		Goods goods3 = new Goods();
		
		System.out.println("실행결과 : ");
		System.out.println("-------");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();
		
		String[] sarray = input.split(" ");
		String[] sarray1 = input2.split(" ");
		String[] sarray2 = input3.split(" ");
		
		goods1.setName(sarray[0]);
		goods1.setPrice(Integer.parseInt(sarray[1]));
		goods1.setCountStock(Integer.parseInt(sarray[2]));
		
		goods2.setName(sarray1[0]);
		goods2.setPrice(Integer.parseInt(sarray1[1]));
		goods2.setCountStock(Integer.parseInt(sarray1[2]));
		
		goods3.setName(sarray2[0]);
		goods3.setPrice(Integer.parseInt(sarray2[1]));
		goods3.setCountStock(Integer.parseInt(sarray2[2]));
		
		goods1.printGoods();
		goods2.printGoods();
		goods3.printGoods();
		
		scanner.close();
		
	}

}

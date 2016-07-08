package prob5;

import java.util.Scanner;

public class CalcApp {
	private int a;
	private int b;
	private char c;
	
	public void setValue(int a, int b){
		this.a=a;
		this.b=b;
	}
	public void calculate(char c){
		switch(c){
		case '+':
			Add.calculate(a,b);
			break;
		case '-':
			Sub.calculate(a,b);
			break;
		case '*':
			Mul.calculate(a,b);
			break;
		case '/':
			Div.calculate(a,b);
			break;
		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		CalcApp calc = new CalcApp();
		
		while(true){
			System.out.println("실행 결과: ");
			System.out.println("-------");
			System.out.print(">> ");
			
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();

			System.out.println("");
			
			String[] sarray = input.split(" ");
			
			int x = Integer.parseInt(sarray[0]);
			int y = Integer.parseInt(sarray[2]);
			char k = sarray[1].charAt(0);
			
			calc.setValue(x,y);
			calc.calculate(k);
			
			System.out.print(">> ");
			String end = scanner.nextLine();
			
			if(end.equals("quit")){
				System.out.println("종료합니다.");
				break;
			}
		}
	}

}

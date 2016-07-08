package prob1;

public class ArrayParameter {

	public static void main(String[] args) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };
		printCharArray(c); // 원래 배열 원소 출력

		replaceSpace(c); // 공백 문자 바꾸기
		printCharArray(c); // 수정된 배열 원소 출력
	}

	static void replaceSpace( char a[] ) {
//		String input = new String(a,0,a.length);
//		input.replaceAll(" ",",");
//		System.out.println(input);
		
		for(int k=0; k < a.length; k++){
			if(a[k]==' '){
				a[k]=',';
			}
		}
		
	}

	static void printCharArray( char a[] ) {
		for(int j=0; j<a.length;j++){
			System.out.print(a[j]);
		}
		System.out.println("");
			
	}
}

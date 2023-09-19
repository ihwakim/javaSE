package section05;

public class LoopHomeWork {
	public static void main(String[] args) {
		
		for(int a = 0; a < 7; a++) {
			for(int b = 0; b < a+1; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int a = 0; a < 4; a++) {
			for(int b = 0; b < a+1; b++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		for(int a = 0; a < 7; a++) {
			for(int b = 0 ; b < a+1 && b != 2 ||b != 4 ||b != 6 ||b != 8 ||; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}


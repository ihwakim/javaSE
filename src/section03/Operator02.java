package section03;

/*
 * 2. 증감연산자
 *  ++ : 1씩 증가시킨다.
 *  -- : 1씩 감소시킨다.
 * 
 */
public class Operator02 {
	public static void main(String[] args) {
		int num = 0;
		num = num + 1;
		System.out.println(num);
		
		num++;  // 다음줄에서 증가된다
		System.out.println(num);
		
		// 전위 증감연산자 - 명령어가 실행 전 1증가
		System.out.println(++num);
		
		// 후위 증감연산자 - 명령어가 실행 후 1증가
		System.out.println(num++);
		System.out.println(num);
		
		
	}

}
package A1_기본이론;

public class 기본이론7_서식문자 {

	public static void main(String[] args) {
		System.out.println("정수");
		System.out.printf("%d",10);
		System.out.println();
		System.out.println("소수");
		System.out.printf("%f",3.14);
		System.out.println();
		System.out.println("소수점2개만표시");
		System.out.printf("%.2f",3.14);
		System.out.println();
		System.out.println("소수점 20개 표시");
		System.out.printf("%.20f",3.14);
		System.out.println();
		System.out.println("문자 한 개");
		System.out.printf("%c",'b');
		System.out.println();
		System.out.println("문자열");
		System.out.printf("%s","출력문의 이해");
		System.out.println();
		System.out.println("함수설정");
		String	fruit = "사과";
		int cnt = 5;
		System.out.printf("%s가 %d개 있습니다",fruit,cnt);
		
				
		

	}

}

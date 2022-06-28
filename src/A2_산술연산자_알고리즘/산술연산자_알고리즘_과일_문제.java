package A2_산술연산자_알고리즘;

public class 산술연산자_알고리즘_과일_문제 {
	public static void main(String[] args) {
		/*
		[문제]  
			 현금 10000원이있다 .
			 사과 1개의 200원이고 귤의 가격은  110원이다 . 
		     사과 3 개  와 귤 10개를 사려고 한다 .  
		     모두 사면 거르름돈은 얼마인지 구하시오.			 
		 */
		/*
		  [주석]
				사과 3개 ==> 200 * 3
				귤 10개 ==> 110 * 10
				현금 - (사과3 + 귤10)
		 */

		System.out.println("사과 3개="+200*3);
		System.out.println("귤   10개="+110*10);
		System.out.println("합계 :    "+(600+1100));
		System.out.println("거스름돈은 "+(10000-1700));
		System.out.print("거스름돈은 ");
		System.out.println(10000-((200*3)+(110*10)));
	}
}

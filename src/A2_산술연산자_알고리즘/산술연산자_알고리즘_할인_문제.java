package A2_산술연산자_알고리즘;

public class 산술연산자_알고리즘_할인_문제 {
	public static void main(String[] args) {
		/*
		 * [문제]
		 * 		현금이 10000원있다.
		 * 		1200원짜리 과자 6개를 구입 후  거스름돈을 구하시오.
		 * 		(추가조건) 과자를 3개 살때마다 200원씩 할인해준다.
		 */
		/*
		 	과자 6개 = 1200*6
		 	할인금액 = 6/3*200
		*/
		System.out.println(10000-(1200*6-(6/3*200)));
		System.out.println(10000-1200*6+(6/3*200));
		System.out.println(10000-1200*6+(200*(6/3)));
		System.out.println(10000 - 1200 * 6 + 200 * 2);

	}
}
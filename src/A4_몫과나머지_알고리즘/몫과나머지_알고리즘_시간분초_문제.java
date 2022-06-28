package A4_몫과나머지_알고리즘;

public class 몫과나머지_알고리즘_시간분초_문제 {
	public static void main(String[] args) {	
		/*
		 *  [문제] 
		 *  	123123초 는 몇시간 몇분 몇초인가 ?			
		 */
		/*
		 * 시간 = 60초 * 60분 = 3600초 -> 3600초로 나눈다
		 * 분 = 시간을 3600초로 나눈 나머지를 60으로 나눈다
		 * 초 = 60으로 나눈 나머지
		 */
		int a = 123123;
		System.out.printf("%d시 %d분 %d초\n",a/3600,a%3600/60,a%60);
		System.out.println(123123/3600 + "시간");
		System.out.println((123123 - (123123/3600*3600)) / 60 + "분");
		System.out.println((123123 % 3600) / 60 + "분");
		System.out.println(123123 % 60 + "초");
     }
}
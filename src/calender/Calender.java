package calender;

import java.util.Scanner;

public class Calender {
	// 배열로 해결하는 방법이 가장 효과적이고 편하다.
	//2월 윤년계산법
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] Leap_Max_Days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public boolean Is_Leap(int year){
		if(year%4==0&&(year%100!=0||year%400==0)){
			return true;
		}
		else
			return false;
	}
	public int getMaxDaysOfMonth(int year,int month) {
		if(Is_Leap(year))
		{
			return Leap_Max_Days[month-1];
		}
		else
			return MAX_DAYS[month - 1];
	}

	public void printCalendar(int year, int month,int date) {
		System.out.printf("    <<%4d년 %3d월>>\n", year, month);
		System.out.println("  월   화    수    목    금    토    일");
		System.out.println(" --------------------");
		// System.out.println("1 2 3 4 5 6 7");
		// System.out.println("8 9 10 11 12 13 14");
		// System.out.println("15 16 17 18 19 20 21 ");
		// System.out.println("22 23 24 25 26 27 28 ");
		for (int i = 1; i <= date; i++) {
			System.out.printf("%3d",i);
			if (i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		// 월을 입력하면 해당 월의 달력을 출력한다.!
		// 달력의 모양은 1단계에서 작성한 모양으로 만든다.
		// 1일은 1요일로 정해도 무관하다.
		// -1을 입력받기 전까지 반복 입력받는다.!
		// 프롬프트를 출력한다.!
	}
}

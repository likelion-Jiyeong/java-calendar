package calender;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT="cal >";
	public void runPrompt(){
		Calender cal = new Calender();
		int month = 0;
		Scanner input = new Scanner(System.in);
		while (true) {

			System.out.println("달을 입력해주세요");
			System.out.println(PROMPT);
			month = input.nextInt();

			if (month == -1) // month가 -1 이면 반복문을 빠져나감
			{
				break;
			}
			if (month > 12 || month == 0) {
				continue; // 만나면 루프의 처음으로 돌아가서 다시 반복
			}
			// 달력함수가 들어 갈 곳
			cal.printCalendar(2017,month,cal.getMaxDaysOfMonth(month));
			
			//System.out.println(month + "월달은 " + cal.getMaxDaysOfMonth(month) + "일 입니다");

		}
		System.out.println("Bye");

		
	}
	public static void main(String[] args) {
		
		Prompt p = new Prompt();
		p.runPrompt();

	}

}

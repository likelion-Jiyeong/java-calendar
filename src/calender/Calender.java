package calender;
import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("월 ,화 ,수 ,목 ,금 , 토 ,일");
		System.out.println("--------------------");
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9  10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21 ");
		System.out.println("22 23 24 25 26 27 28 ");
		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		int month;
		Scanner input = new Scanner(System.in);
		System.out.println("달을 입력해주세요");
		month = input.nextInt();
		//if문으로 해결하는 방법
		if(month==2)
		{
			System.out.println(month +"월 달은 28일까지 있습니다.");
		}
		else if(month==4||month==6||month==9||month==11)
		{
			System.out.println(month +"월 달은 30까지 있습니다.");
		}
		else
		{
			System.out.println(month +"월 달은 31까지 있습니다.");
		}
		

	}

}

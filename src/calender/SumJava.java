package calender;
import java.util.Scanner;
public class SumJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//두 수의 입력을 받고 결과를 출력해 주는 프로그램을 만들기
		//입력 : 키보드로 두 수를 입력을 받는다., 출력 : 화면에 두 수의 합을 출력한다.
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.println("정수 두 수를 입력받으세요");
		a = input.nextInt();
		b = input.nextInt();
		int sum = a+b;
		System.out.println("두 수의 합은 "+sum +"입니다");
		
	}

}

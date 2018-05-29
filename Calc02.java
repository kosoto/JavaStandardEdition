import java.util.Scanner;
public class Calc02{
	public static void main(String[] args){
		System.out.println("정수를 2개 입력하십시오.");
		Scanner scan = new Scanner(System.in);
		String num1 = scan.next();
		String num2 = scan.next();

		int int1 = Integer.parseInt(num1);
		int int2 = Integer.parseInt(num2);

		double int3 = int1;

		System.out.println("두 정수의 합은 " + (int1+int2) + "입니다.");
		System.out.println("두 정수의 차는 " + (int1-int2) + "입니다.");
		System.out.println("두 정수의 곱은 " + (int1*int2) + "입니다.");
		System.out.print("두 정수의 나눗셈은 " + (int3/int2) + "입니다.");

	}
}
import java.util.Scanner;
public class Hello{
	public static void main(String[] args){
		System.out.println("정수를 3개 입력 하십시오.");
		Scanner scan = new Scanner(System.in);
		String num1 = scan.next();
		//String num2 = scan.next();
		double num2 =2;
		String num3 = scan.next();

		int A = 0;

		int int1 = Integer.parseInt(num1);
		int int2 = (int)num2;
		int int3 = Integer.parseInt(num3);

		A = A+ int1;  //타입선언은 한번만!!
		A = A + int2;
		A = A + int3;

		System.out.print("세 정수의 합은 " + A + "입니다.");
	}
}
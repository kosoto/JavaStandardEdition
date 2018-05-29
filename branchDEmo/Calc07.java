import java.util.Scanner;
public class Calc07{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요. ");
		int num1 = scan.nextInt();
		System.out.print("연산기호를 입력하세요. ");
		String opcode = scan.next();
		System.out.print("두번째 수를 입력하세요. ");
		int num2 = scan.nextInt();

		int num3 = 0;
		String result = "";
		switch(opcode){
			case "+" : num3 = num1 + num2; break;
			case "-" : num3 = num1 - num2; break;
			case "*" : num3 = num1 * num2; break;
			case "/" : num3 = num1 / num2; break;
			case "%" : num3 = num1 % num2; break;
			default : ; result = "잘못된 연산기호를 입력하였습니다."; break;
		}
		if(!result.equals("잘못된 연산기호를 입력하였습니다.")){
			result = num1 +" "+  opcode + " " +  num2 +" = "+  num3;
		}
		System.out.print(result);
		

	}
}
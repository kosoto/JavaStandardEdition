import java.util.Scanner;
public class Calc05{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요. ");
		int num1 = scan.nextInt();
		System.out.print("연산기호를 입력하세요. ");
		String opcode = scan.next();
		System.out.print("두번째 수를 입력하세요. ");
		int num2 = scan.nextInt();

		int num3 = 0;

		if(opcode.equals("+")){
			num3 = num1 + num2;
		}else if(opcode.equals("-")){
			num3 = num1 - num2;
		}else if(opcode.equals("*")){
			num3 = num1 * num2;
		}else if(opcode.equals("/")){
			num3 = num1 / num2;
		}else{
			num3 = num1 % num2;
		}
		System.out.print(num1 + " " + opcode + " " + num2 +" = " + num3);
	}

}
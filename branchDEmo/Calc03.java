import java.util.Scanner;
public class Calc03{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하십시오. ");
		int num1 = scan.nextInt();	
		System.out.println("덧셈을 하려면 1을 입력하십시오. ");
		System.out.println("뺄셈을 하려면 2을 입력하십시오. ");
		System.out.println("곱셈을 하려면 3을 입력하십시오. ");
		System.out.println("나눗셈을 하려면 4을 입력하십시오. ");
		System.out.println("나머지를 구하려면 5를 입력하십시오. ");
		int opcode = scan.nextInt();
		System.out.println("두번째 수를 입력하십시오. ");
		int num2 = scan.nextInt();
		int num3 = 0;
		String op = "";	
		if(opcode == 1){
			num3 = num1 + num2;
			op = "+";
		}else if(opcode == 2){
			num3 = num1 - num2;
			op = "-";			
		}else if(opcode == 3){
			num3 = num1 * num2;		
			op = "*";
		}else if(opcode == 4){
			num3 = num1 / num2;
			op = "/";			
		}else{
			num3 = num1 % num2;
			op = "%";			
		}


		System.out.print(num1 + " " + op + " " + num2 + " = "  + num3);
		

			
		/*int num3 = num1 + num2;
		int num4 = num1 - num2;
		int num5 = num1 * num2;
		int num6 = num1 / num2;
		int num7 = num1 % num2;
		
		System.out.println(num1 + " + " + num2 + " = " + num3);
		System.out.println(num1 + " - " + num2 + " = " + num4);
		System.out.println(num1 + " * " + num2 + " = " + num5);
		System.out.println(num1 + " / " + num2 + " = " + num6);
		System.out.print(num1 + " % " + num2 + " = " + num7);*/
		
	}
}
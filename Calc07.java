import java.util.Scanner;
public class Calc07{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ���� �Է��ϼ���. ");
		int num1 = scan.nextInt();
		System.out.print("�����ȣ�� �Է��ϼ���. ");
		String opcode = scan.next();
		System.out.print("�ι�° ���� �Է��ϼ���. ");
		int num2 = scan.nextInt();

		int num3 = 0;
		String result = "";
		switch(opcode){
			case "+" : num3 = num1 + num2; break;
			case "-" : num3 = num1 - num2; break;
			case "*" : num3 = num1 * num2; break;
			case "/" : num3 = num1 / num2; break;
			case "%" : num3 = num1 % num2; break;
			default : ; result = "�߸��� �����ȣ�� �Է��Ͽ����ϴ�."; break;
		}
		if(!result.equals("�߸��� �����ȣ�� �Է��Ͽ����ϴ�.")){
			result = num1 +" "+  opcode + " " +  num2 +" = "+  num3;
		}
		System.out.print(result);
		

	}
}
import java.util.Scanner;
public class Calc04{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("ù��° ���� �Է��ϼ���. ");
	int num1 = scan.nextInt();
	System.out.println("�����ȣ�� �Է��ϼ���. ");
	String opcode = scan.next();
	System.out.print("�ι�° ���� �Է��ϼ���. ");
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
		
	}else {
		num3 = num1 % num2;
		
	}
	System.out.print(num1 + " " + opcode + " " + num2 + "=" + num3);

}


}
import java.util.Scanner;
public class Calc03{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ���� �Է��Ͻʽÿ�. ");
		int num1 = scan.nextInt();	
		System.out.println("������ �Ϸ��� 1�� �Է��Ͻʽÿ�. ");
		System.out.println("������ �Ϸ��� 2�� �Է��Ͻʽÿ�. ");
		System.out.println("������ �Ϸ��� 3�� �Է��Ͻʽÿ�. ");
		System.out.println("�������� �Ϸ��� 4�� �Է��Ͻʽÿ�. ");
		System.out.println("�������� ���Ϸ��� 5�� �Է��Ͻʽÿ�. ");
		int opcode = scan.nextInt();
		System.out.println("�ι�° ���� �Է��Ͻʽÿ�. ");
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
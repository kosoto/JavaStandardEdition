import java.util.Scanner;
public class Hello{
	public static void main(String[] args){
		System.out.println("������ 3�� �Է� �Ͻʽÿ�.");
		Scanner scan = new Scanner(System.in);
		String num1 = scan.next();
		//String num2 = scan.next();
		double num2 =2;
		String num3 = scan.next();

		int A = 0;

		int int1 = Integer.parseInt(num1);
		int int2 = (int)num2;
		int int3 = Integer.parseInt(num3);

		A = A+ int1;  //Ÿ�Լ����� �ѹ���!!
		A = A + int2;
		A = A + int3;

		System.out.print("�� ������ ���� " + A + "�Դϴ�.");
	}
}
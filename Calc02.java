import java.util.Scanner;
public class Calc02{
	public static void main(String[] args){
		System.out.println("������ 2�� �Է��Ͻʽÿ�.");
		Scanner scan = new Scanner(System.in);
		String num1 = scan.next();
		String num2 = scan.next();

		int int1 = Integer.parseInt(num1);
		int int2 = Integer.parseInt(num2);

		double int3 = int1;

		System.out.println("�� ������ ���� " + (int1+int2) + "�Դϴ�.");
		System.out.println("�� ������ ���� " + (int1-int2) + "�Դϴ�.");
		System.out.println("�� ������ ���� " + (int1*int2) + "�Դϴ�.");
		System.out.print("�� ������ �������� " + (int3/int2) + "�Դϴ�.");

	}
}
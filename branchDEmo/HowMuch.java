import java.util.Scanner;
public class HowMuch{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�󸶿���?");
		int num1 = scan.nextInt();
		System.out.println(num1 + "���Դϴ�.");

		System.out.println("� �帱���?");
		int num2 = scan.nextInt();
		System.out.println(num2 + "�� �ּ���.");

		int num3 = num1 * num2;
		System.out.println("�� �ݾ��� " + num3 + "�� �Դϴ�.");

		System.out.println("��ο� ����ּ���.");
		System.out.println("�� �ۼ�Ʈ DC �ұ��?");
		
		int dc = scan.nextInt();
		String ans = "�� �Ⱦƿ�.";
		int num4 = num3 * (100 - dc) /100;
		if(dc<10){
			ans = num4 + "�� �Դϴ�.";
		}
		System.out.println(ans);
	}
}
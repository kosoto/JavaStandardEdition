import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("�⵵�� ���ڸ����� �Է��ϼ���.");
		int year = scan.nextInt();
		int div4 = year%4 , div100 = year%100, div400 = year%400;
		String result = "����Դϴ�.";
		if(
			div4==0 && div100!=0
				||
			div4==0 && div100==0 && div400==0
				||
			div4!=0 && div400==0){
			result = "�����Դϴ�.";
		}

		System.out.print(year + "���� " + result);


	}
}
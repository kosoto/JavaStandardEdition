import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		while(true){
			System.out.print("0.����, 1.����");
			int flag = scan.nextInt();
			switch(flag){
				case 0 : System.out.print("�����մϴ�."); return;
				case 1 : 
				System.out.print("�⵵�� ���ڸ����� �Է��ϼ���.");
				int year = scan.nextInt(), div4 = year%4 , div100 = year%100, div400 = year%400;
				String result = "����Դϴ�.";
				if(
					div4==0 && div100!=0
						||
					div4==0 && div100==0 && div400==0
						||
					div4!=0 && div400==0){
					result = "�����Դϴ�.";
				}

				System.out.println(year + "���� " + result);
				break;
				default : break;
			}
		}
		


	}
}
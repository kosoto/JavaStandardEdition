import java.util.Scanner;
public class MonthEndday{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���ڷ� �Է��ϼ���.");
		String month = scan.next();

		String end ="31";
		switch(month){
			case "4" : case "6" :case "9" :case "11": end ="30";break;
			case "2": end = "28"; break;
		}

		System.out.print("������ " + month + "��" + end + "���Դϴ�."); 
	}
}
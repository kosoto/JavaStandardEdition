import java.util.Scanner;
public class MonthEndday{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		while(true){
			System.out.print("0.����, 1.����");
			int flag = scan.nextInt();
			switch(flag){
				case 0 : System.out.print("�����մϴ�."); return;
				case 1 : 

				System.out.print("���� ���ڷ� �Է��ϼ���.");
				String month = scan.next();

				String end = "�߸� �Է��Ͽ����ϴ�.";
				switch(month){
					case "4" : case "6" : case "9" : case "11" : end = "30"; break;
					case "2" : end = "28"; break;
					case "1" : case "3" : case "5" : case "7" : case "8" : case "10" : case "12" : end = "31"; break;
				}
				String result = "";
				if (!end.equals("�߸� �Է��Ͽ����ϴ�.")){
					result = "������ " + month + "��" + end + "���Դϴ�.";
				}else{
					result = end;
				}
				System.out.println(result); 
				break;
				default : break;
			}
		}

	}
}
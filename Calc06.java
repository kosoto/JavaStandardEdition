import java.util.Scanner;
public class Calc06{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("player1�� ���� ���� �� �� �ϳ��� �����ϼ���.");
		String player1 = scan.next();
		int p1 = 0;
		if(player1.equals("����")){
			p1 = 2;
		}else if(player1.equals("����")){
			p1 = 0;
		}else if(player1.equals("��")){
			p1 = 5;
		}

		System.out.println("player2�� ���� ���� �� �� �ϳ��� �����ϼ���.");
		String player2 = scan.next();
		int p2 = 0;
		if(player2.equals("����")){
			p2 = 2;
		}else if(player2.equals("����")){
			p2 = 0;
		}else if(player2.equals("��")){
			p2 = 5;
		}

		int ref = p1 - p2;
		String result = "";

		if (ref == 0){
			result = "�����ϴ�.";
		}else if(ref == -3 || ref == -2 || ref == 5){
			result = "player1�� �̰���ϴ�.";
		}else if(ref == 3 || ref == 2 || ref == -5){
			result = "player2�� �̰���ϴ�.";
		}
		System.out.print(result);

	}
}
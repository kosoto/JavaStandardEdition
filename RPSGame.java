import java.util.Scanner;
public class RPSGame{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("player1 �� ���� ���� �� �߿� �ϳ��� ������. ");
		String player1 = scan.next();
		int num1 = 0;

		switch(player1){
			case "����" : num1 = 2; break;
			case "����" : num1 = 0; break;
			case "��" : num1 = 5;
		}
		
		System.out.println("Plater2 �� ���� ���� �� �߿� �ϳ��� ������. ");
		String player2 = scan.next();
		int num2 = 0;

		switch(player2){
			case "����" : num2 = 2; break;
			case "����" : num2 = 0; break;
			case "��" : num2 = 5;
		
		String result = "";
		int ref = num1 - num2;

		switch(ref){
			case 2 || -5 || 3 : result = "player2�� �̰���ϴ�."; break;
			case -3 || -2 || 5 : result = "player1�� �̰���ϴ�."; break;
			case 0 : result = "�����ϴ�.";
		}
		
		System.out.print(result);
		
	}
}
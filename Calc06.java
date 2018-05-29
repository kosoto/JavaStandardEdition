import java.util.Scanner;
public class Calc06{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("player1은 가위 바위 보 중 하나를 선택하세요.");
		String player1 = scan.next();
		int p1 = 0;
		if(player1.equals("가위")){
			p1 = 2;
		}else if(player1.equals("바위")){
			p1 = 0;
		}else if(player1.equals("보")){
			p1 = 5;
		}

		System.out.println("player2는 가위 바위 보 중 하나를 선택하세요.");
		String player2 = scan.next();
		int p2 = 0;
		if(player2.equals("가위")){
			p2 = 2;
		}else if(player2.equals("바위")){
			p2 = 0;
		}else if(player2.equals("보")){
			p2 = 5;
		}

		int ref = p1 - p2;
		String result = "";

		if (ref == 0){
			result = "비겼습니다.";
		}else if(ref == -3 || ref == -2 || ref == 5){
			result = "player1이 이겼습니다.";
		}else if(ref == 3 || ref == 2 || ref == -5){
			result = "player2가 이겼습니다.";
		}
		System.out.print(result);

	}
}
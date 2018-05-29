import java.util.Scanner;
public class MonthEndday{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("월을 숫자로 입력하세요.");
		String month = scan.next();

		String end ="31";
		switch(month){
			case "4" : case "6" :case "9" :case "11": end ="30";break;
			case "2": end = "28"; break;
		}

		System.out.print("말일이 " + month + "월" + end + "일입니다."); 
	}
}
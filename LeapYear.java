import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		while(true){
			System.out.print("0.정지, 1.실행");
			int flag = scan.nextInt();
			switch(flag){
				case 0 : System.out.print("종료합니다."); return;
				case 1 : 
				System.out.print("년도를 네자리수로 입력하세요.");
				int year = scan.nextInt(), div4 = year%4 , div100 = year%100, div400 = year%400;
				String result = "평년입니다.";
				if(
					div4==0 && div100!=0
						||
					div4==0 && div100==0 && div400==0
						||
					div4!=0 && div400==0){
					result = "윤년입니다.";
				}

				System.out.println(year + "년은 " + result);
				break;
				default : break;
			}
		}
		


	}
}
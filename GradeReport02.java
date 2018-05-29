import java.util.Scanner;
public class GradeReport02{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		String name = scan.next();

		System.out.println("국어 점수를 입력하세요.");
		int num1 = scan.nextInt();
				
		System.out.println("영어 점수를 입력하세요.");
		int num2 = scan.nextInt();
		
		System.out.println("수학 점수를 입력하세요.");
		int num3 = scan.nextInt();
		
		String result = "";
		if(num1>100 || num2>100 || num3>100){
			result = "잘못된 점수를 입력하였습니다.";
		}

		int num4 = (num1 + num2 + num3) / 3;
		int num5 = num4/10;
		String grade = "F";
		
		switch(num5){
			case 9 : grade = "A"; break;
			case 8 : grade = "B"; break;
			case 7 : grade = "C"; break;
			case 6 : grade = "D"; break;
			case 5 : grade = "E"; break;
		}
			
		if(!result.equals("잘못된 점수를 입력하였습니다.")){
			result = name + "님의 평균은 " + num4 +"점,"+ " 학점은 " + grade + "입니다." ;
		}
		System.out.println(result);
	}
}
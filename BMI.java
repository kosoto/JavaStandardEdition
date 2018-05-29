import java.util.Scanner;
public class BMI{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.print("당신의 몸무게는 몇 kg입니까?.");
		double weight = scan.nextDouble();

		System.out.print("당신의 키는 몇 m입니까?");
		double height = scan.nextDouble();

		double bmi = weight/(height*height);

		String result ="3단계 비만";

		if(bmi<18.5){
			result = "저체중";
		}else if(bmi<23){
			result = "정상";
		}else if(bmi<25){
			result = "비만 전단계";
		}else if(bmi<30){
			result = "1단계 비만";
		}else if(bmi<35){
			result = "2단계 비만";
		}

		System.out.println("당신은 " + result + "입니다.");
	}
}

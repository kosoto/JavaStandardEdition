import java.util.Scanner;
public class BMI{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.print("����� �����Դ� �� kg�Դϱ�?.");
		double weight = scan.nextDouble();

		System.out.print("����� Ű�� �� m�Դϱ�?");
		double height = scan.nextDouble();

		double bmi = weight/(height*height);

		String result ="3�ܰ� ��";

		if(bmi<18.5){
			result = "��ü��";
		}else if(bmi<23){
			result = "����";
		}else if(bmi<25){
			result = "�� ���ܰ�";
		}else if(bmi<30){
			result = "1�ܰ� ��";
		}else if(bmi<35){
			result = "2�ܰ� ��";
		}

		System.out.println("����� " + result + "�Դϴ�.");
	}
}

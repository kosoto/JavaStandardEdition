import java.util.Scanner;
public class GradeReport{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���.");
		String name = scan.next();

		System.out.println("���� ������ �Է��ϼ���.");
		int num1 = scan.nextInt();
				
		System.out.println("���� ������ �Է��ϼ���.");
		int num2 = scan.nextInt();
		
		System.out.println("���� ������ �Է��ϼ���.");
		int num3 = scan.nextInt();
		
		String result = "";
		if(num1>100 || num2>100 || num3>100){
			result = "�߸��� ������ �Է��Ͽ����ϴ�.";
		}

		int num4 = (num1 + num2 + num3) / 3;
		String grade = "F";
		if(num4>=90){
			grade = "A";
		}else if(num4>=80){
			grade = "B";
		}else if(num4>=70){
			grade = "C";
		}else if(num4>=60){
			grade = "D";
		}else if(num4>50){
			grade = "E";
		}
		
		if(!result.equals("�߸��� ������ �Է��Ͽ����ϴ�.")){
			result = name + "���� ����� " + num4 +"��,"+ " ������ " + grade + "�Դϴ�." ;
		}
		System.out.println(result);
	}
}
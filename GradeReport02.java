import java.util.Scanner;
public class GradeReport02{
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
		int num5 = num4/10;
		String grade = "F";
		
		switch(num5){
			case 9 : grade = "A"; break;
			case 8 : grade = "B"; break;
			case 7 : grade = "C"; break;
			case 6 : grade = "D"; break;
			case 5 : grade = "E"; break;
		}
			
		if(!result.equals("�߸��� ������ �Է��Ͽ����ϴ�.")){
			result = name + "���� ����� " + num4 +"��,"+ " ������ " + grade + "�Դϴ�." ;
		}
		System.out.println(result);
	}
}
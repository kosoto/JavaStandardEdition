import java.util.Scanner;
public class CheckGender{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���.");
		String name = scan.next();

		System.out.println("�ֹι�ȣ�� �Է��ϼ���.");
		String num = scan.next();
		char ch = num.charAt(7);
		String result = "�ٽ� �Է��ϼ���.";

		switch(ch){
			case '1' : case '3' : result = "��"; break;
			case '2' : case '4' : result = "��"; break;
			case '5' : case '6' : result = "�ܱ���"; break;
		}
		
		String result1 = "";
		if(!result.equals("�ٽ� �Է��ϼ���.")){
			result1 = name +" : "+num +" : "+result ;
		}else{
			result1 = result;
		}
		System.out.println(result1);

	}
}
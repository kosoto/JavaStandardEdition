import java.util.Scanner;
public class WhileDemo{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		while(true){
			System.out.print("0.정지, 1.실행");
			int flag = scan.nextInt();
			switch(flag){
				case 0 : System.out.print("종료합니다."); return;
				case 1 : 
				System.out.print("두 정수를 입력하세요.");
				int num1 = scan.nextInt(), num2 = scan.nextInt(), sum = 0, start = num1, end = num2;
				String result = "";
				if(num1>num2){
					end = num1;
					start = num2; 
				}
				while(start<(end+1)){
					if(start<end){
					result += start + " + ";
					}else{
					result += start + " = ";
					}
				sum += start;
				start++;
				}
				System.out.println(result + sum);	
				break;
				default : break;
			}
		}
	}
}
import java.util.Scanner;
public class InfiniteLoop{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	while(true){
		System.out.print("0.정지, 1.실행");
		int flag = scan.nextInt();
		switch(flag){
			case 0 : System.out.print("종료합니다."); return;
			case 1 : System.out.println("주문하세요."); break;
			default : break;
		}
	}
	}
}

import java.io.*;

public class Fibonacci02{
	//피보나치 수열의 첫번째와 두번째 둘레의 길이까지를 정한 뒤 for문을 이용하여 한변의 길이와 둘레를 구하는 main
	public static void main(String[] args) throws IOException{
		System.out.println("원하는 숫자를 입력하세요");
		int num = System.in.read()-48;
		System.out.println(num+"까지의 피보나치 수열을 구합니다.");

		int a=1, b=1;
	
		for(int i=1; i<=num; i++){
			int c=a+b;
			System.out.println(i+"번째 도형 한 변의 길이는 "+a+"이고 둘레의 길이는 "+2*(a+b)+"입니다.");
			a=b;
			b=c;
		}
	}
}
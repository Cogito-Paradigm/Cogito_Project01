import java.io.IOException;

public class Fibonacci01 {
	//피보나치 수열을 구하는 수학적 공식을 수식으로 만들어 계산한 main
	public static void main(String[] args) throws IOException{
		System.out.println(Math.pow(10, 10));
		
		int num;
		System.out.println("숫자를 입력하세요");
		num = System.in.read()-48;
		System.out.println(num+"번째 도형을 입력하셨습니다.");
		
		//root를 구하는 메소드를 활용하여 루트5를 계산
		double rootF = Math.sqrt(5);
		
		//n번째 수열의 일반항을 구하는 메소드
		//피보나치 수열의 일반항을 구하는 공식에 따라 계산한 메소드
		int fiboNum = (int) (rootF/5*(Math.pow((1+rootF)/2, num)-Math.pow((1-rootF)/2, num)));
		System.out.println("n번째 도형 한 변의 길이 = "+fiboNum);
		
		//n+1번째 수열의 일반항을 구하는 메소드
		int fiboNumPlus = (int) (rootF/5*(Math.pow((1+rootF)/2, num+1)-Math.pow((1-rootF)/2, num+1)));
		
		//n까지 도형의 둘레의 합을 구하는 메소드
		int fiboSum = fiboNum+fiboNum+fiboNumPlus+fiboNumPlus;
		System.out.println("n번째 도형까지 둘레의 합 = "+fiboSum);
	}
}
		

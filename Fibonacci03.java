
import java.io.*;

public class Fibonacci03 {
	//피보나치 수열의 특성을 이용해 재귀함수를 통해 한변의 길이와 둘레의 합을 구하는 main
	public static void main(String[] args) throws IOException{
		System.out.println("숫자를 입력하세요");
		int num = System.in.read()-48;
		System.out.println(num+"까지의 수열을 구합니다.");
		
		for(int i=1; i<=num; ++i)
		{
				System.out.print(Pivo(i) + ", ");
		}
			System.out.println();
			System.out.println("만들어진 정사각형의 한변의 길이는 "+Pivo(num));
			System.out.println("둘레의 길이는 "+2*(Pivo(num)+Pivo(num+1)));
	}
	
	public static int Pivo(int n)
	{
		if(n<=2){ return 1;}
		else{return Pivo(n-2) + Pivo(n-1);}
	}
}
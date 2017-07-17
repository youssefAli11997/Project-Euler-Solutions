import java.math.BigInteger;
import java.util.Scanner;


public class FactDigitSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger one = in.nextBigInteger();
		BigInteger fact = one; 
		int j=1;
		for(BigInteger i=one; j<=100; j++){
			fact = fact.multiply(i);
			i = i.add(one);
		}
		String sfact = fact.toString();
		int sum = 0;
		for(int x=0; x<sfact.length(); x++){
			sum += sfact.charAt(x)-'0';
		}
		System.out.println(sum);

	}

}

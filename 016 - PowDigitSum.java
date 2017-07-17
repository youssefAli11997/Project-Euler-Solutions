import java.math.BigInteger;
import java.util.Scanner;


public class PowDigitSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger two = in.nextBigInteger();
		BigInteger pow = two.pow(1000); 
		String spow = pow.toString();
		int sum = 0;
		for(int x=0; x<spow.length(); x++){
			sum += spow.charAt(x)-'0';
		}
		System.out.println(sum);

	}

}

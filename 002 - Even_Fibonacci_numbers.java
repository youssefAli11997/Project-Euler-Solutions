import java.util.Scanner;

public class Even_Fibonacci_numbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// this version will start with 1 & 2 not 1 & 1
		
		System.out.println("Fibonacci Series!");
		
		int fib1 = 1 , fib2 = 2 , fib3 = 0 ;
		
		int even_sum = 0 ;
		
		// adding two because it's even
		even_sum += 2 ;
		
		// printing the rest of the even numbers
		for(int i = 0; fib3 < 4000000; i++){
			fib3 = fib1 + fib2 ;
			fib1 = fib2  ;
			fib2 = fib3 ;
			if(fib3 % 2 == 0){
				even_sum += fib3 ;
			}
		}
		System.out.println("Even sum is:" + even_sum);
	}
}

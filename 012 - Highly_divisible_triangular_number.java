
public class Highly_divisible_triangular_number {
	
	public static int trianglar(int n) {
		return n * (n + 1) / 2;
	}
	
	private static boolean haveMoreThan_N_Divisors(int num, int x) {
		int tri = trianglar(num);
		int i = 2, cnt, div = 1;
		while(tri > 1) {
			cnt = 1;
			while(tri % i == 0) {
				cnt++;
				tri /= i;
			}
			div *= cnt;
			i++;
		}
		return div > x;
	}

	public static void main(String[] args) {
		int num = 1;
		while(!haveMoreThan_N_Divisors(num , 500))
			num++;
		System.out.println(trianglar(num));
	}

}

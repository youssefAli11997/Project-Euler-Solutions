import java.util.Arrays;
import java.util.Scanner;

public class LatticePaths {
    public static long[][] mem;
    public static int n;

    public static long solve(int i, int j){
        if(i == n || j == n) return 0;
        if(i == n-1 && j == n-1) return 1;
        if(mem[i][j] != -1) return mem[i][j];

        return mem[i][j] = solve(i+1, j) + solve(i, j+1);
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        n = in.nextInt()+1;

        mem = new long[n+1][n+1];
        for(int i=0; i<mem.length; i++) Arrays.fill(mem[i], -1);

        System.out.println(solve(0,0));
    }
}

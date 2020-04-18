import java.util.*;

public class CountingSummations {
    //public static List<Integer> solution = new ArrayList<>();
    public static int n;
    public static int solutionsCount;

    public static void solve(int numberToUse){
        if(n < 0) return;
        if(n == 0){
            //System.out.println(solution);
            solutionsCount++;
            return;
        }

        int ans = 0;

        for(int num = numberToUse; num > 0; num--) {
            n -= num;
            //solution.add(num);
            solve(num);
            //solution.remove(solution.size()-1);
            n += num;
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        CountingSummations.n = in.nextInt();
        solve(n-1);
        System.out.println("f(" + n + ") = " + solutionsCount);
    }
}

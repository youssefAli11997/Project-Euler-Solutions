public class _92_SquareDigitChains {

    private static int countUpto(long limit){
        int count = 0;

        for(long i=2; i<limit; i++){
            if(reached89(i))
                count++;
        }

        return count;
    }

    private static boolean reached89(long x){
        //System.out.print(x + " ");
        if(x == 1)
            return false;
        if(x == 89)
            return true;
        long newX = 0;
        while(x > 0){
            newX += (x%10) * (x%10);
            x /= 10;
        }
        return reached89(newX);
    }

    public static void main(String[] args){
        /*System.out.println(reached89(44));
        System.out.println();
        System.out.println(reached89(85));
        System.out.println();*/
        System.out.println(countUpto(10000000));

    }
}

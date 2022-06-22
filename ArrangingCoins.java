package com.varun;
//441. Arranging Coins
public class ArrangingCoins {
    public static void main(String[] args) {
        int k =2147483647;
      //  int basicAns = basicSolution(k);
        //System.out.println(basicAns);

        System.out.println(arrangeCoins(k));
    }
//    public static int basicSolution(int k ){
//        int count =0;
//        long sum =0 ;
//        int i;
//        for( i=1;sum<k;i++){
//            if((sum += i)<=k){
//                count++;
//            }
//        }
//        return count;
//    }
    //Approach 2

    // O (1)

    public static int arrangeCoins(int n) {
        /*basically the things is no of lines l
        * k(k+1)<2n
        * Squaring both side
        * (k+ 1/2)^2  - 1/4 <= 2n
        * simplifying we get k  = sqrt(2n + 1/4)
        * */
        return (int) (Math.sqrt(2 * (long)(n) + 0.25) - 0.5);

    }
}

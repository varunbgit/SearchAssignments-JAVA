package com.varun;
//441. Arranging Coins
public class ArrangingCoins {
    public static void main(String[] args) {
        int k =2147483647;
        int basicAns = basicSolution(k);
        System.out.println(basicAns);
    }
    public static int basicSolution(int k ){
        int count =0;
        long sum =0 ;
        int i;
        for( i=1;sum<k;i++){
            if((sum += i)<=k){
                count++;
            }
        }
        return count;
    }
}

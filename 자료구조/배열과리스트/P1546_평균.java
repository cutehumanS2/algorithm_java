package 배열과리스트;

import java.util.Scanner;

public class P1546_평균{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long sum = 0;
        long max = 0;
        for(int i=0; i<N; i++){
           int temp = sc.nextInt();
           if (temp > max) max = temp;
           sum += temp;
        }

        System.out.println(sum * 100.0 / max / N);
    }
}

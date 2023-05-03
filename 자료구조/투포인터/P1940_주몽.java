package 투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1940_주몽 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);

        int cnt = 0;
        int i = 0;
        int j = n-1;

        while(i<j){
            int sum = a[i] + a[j];
            if(sum < m) i++;
            else if(sum > m) j--;
            else {
                cnt++;
                i++;
                j--;
            }
        }

        System.out.println(cnt);
    }
}

package 구간합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659_구간합구하기 {
    public static void main(String[] args) throws IOException{
        // 받는 데이터 많을 때는 Scanner보다 BufferedReader 사용
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        // 숫자가 크면 int형으로 받기 힘들기 때문에 StringTokenizer 사용
        StringTokenizer stringTokenizer =
                new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        // 합 배열
        long[] s = new long[n+1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i=1; i<=n; i++){
            s[i] = s[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for(int q=0; q<m; q++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(s[j] - s[i-1]);
        }

    }
}

package 배열과리스트;// 백준 11720번
import java.util.Scanner;

public class P11720_숫자의합구하기{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 입력값을 String형 변수 sNum에 저장한 후 char[] 형 변수로 변환
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();

        int sum = 0;
        for(int i = 0; i < N; i++){
            // cNum[i]를 정수형으로 변환하면서 sum에 더하여 누적
            sum += cNum[i] - '0';
        }
        System.out.println(sum);
    }
}
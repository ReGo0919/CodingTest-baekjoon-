import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon15552_20230509 {

        public static void main(String[] args) throws IOException, IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int testCase = Integer.parseInt(br.readLine());
            int[] Answer = new int[testCase];
//          사용자가 입력한 testCase의 범위 만큼 Answer 배열의 길이 생성.
            for(int i = 0 ; i < testCase ; i++){
//              for문을 사용자 입력값 만큼 돌 동안
                StringTokenizer Line = new StringTokenizer(br.readLine(), " ");
//              토큰 생성 후 각각의 숫자를 A와 B에 저장
                int A = Integer.parseInt(Line.nextToken());
                int B = Integer.parseInt(Line.nextToken());
                Answer[i] = A+B;
//              이후 Answer의 i번째에 A와 B를 더한 값을 저장
            }
            for (int n : Answer){
                System.out.println(n);
            }
//          다시 foreach문을 돌려서 Answer의 배열 안의 n의 요소들을 첫번째부터 차례대로 프린트.
    }
}
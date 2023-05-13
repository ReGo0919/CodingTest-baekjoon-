import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon11021_20230509 {

        public static void main(String[] args) throws IOException, IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int testCase = Integer.parseInt(br.readLine());
            for (int i = 0 ; i<testCase ; i++) {
//              사용자의 입력 testcase의 범위만큼 for문을 돌 동안 토크나이저를 입력 받음
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
//              각각의 토큰들을 a와 b 변수에 담고
                System.out.println("Case #" + i + ": " + (a+b));
//              적절히 문자열과 조합하여 출력.
            }
        }
}
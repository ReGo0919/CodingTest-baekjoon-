import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon2438_20230509 {

        public static void main(String[] args) throws IOException, IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                   System.out.print("*");
//          i를 활용해 i의 첫번째 줄에는 별 하나, 두번째 줄에는 별 두개 이런 식으로 별 삼각형의 별 생성
                }System.out.println("");
//          이때 줄바꿈을 해주어야 함.
            }

        }
}
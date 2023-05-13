import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon11022_20230509 {

        public static void main(String[] args) throws IOException, IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int testCase = Integer.parseInt(br.readLine());
//          11021 문제 설명과 거의 같음.
            for (int i = 0 ; i<testCase ; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                System.out.println("Case #" + i + ": "+ a + " + " + b + " = "  + (a+b));
            }
        }
}
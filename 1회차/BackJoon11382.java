import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BackJoon11382 {

        public static void main(String[] args) throws IOException {
//              StringTokenizer 이용 참고로 컴파일은 정상적으로 작동하는데 백준 사이트에서는 런타임 에러가 뜸.

                Scanner sc = new Scanner(System.in);
                String Input = sc.nextLine();
                StringTokenizer st = new StringTokenizer(Input);

                int n1 = Integer.parseInt(st.nextToken());
                int n2 = Integer.parseInt(st.nextToken());
                int n3 = Integer.parseInt(st.nextToken());

                System.out.println(n1 + n2 + n3);





//
        }

    }

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class BackJoon11720_20230514 {

    public static void main(String[] args) throws IOException, IOException {
    /* 도현이가 입력하는 첫번째 줄의 첫번째 인자는 1번부터 N개 까지의 바구니이고, 두번째 인자는 방법, 즉 경우의 테스트 케이스 수를 의미하며
    두번째 부터는 테스트 케이스의 수대로 차례대로 입력하는대 각각 i번부터 j번 까지의 바구니에 k번(N의 길이 중에서의 공의 번호) 공을 넣는다.
    만약 1 2 4라고 입력을 하면 1번부터 2번까지 바구니에 4번 공을 넣는 것이고 이럴 경우 도현이가 입력한 바구니 수를 5라고 가정을 했을때
    4 4 0 0 0이 입력 되게 된다. 이 점을 착안하여 코드를 구현 해보자.
     */

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String N = br.readLine();
    int length = N.length();
    int add = 0;
    char[] number = new char[length];
        for (int i = 0 ; i < length ; i++){
            number[i] = N.charAt(i);
            add += Integer.parseInt(String.valueOf(number[i]));
        }
        System.out.println(add);

    }
}




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class BackJoon1546_20230513 {

    public static void main(String[] args) throws IOException, IOException {
    /* 도현이가 입력하는 첫번째 줄의 첫번째 인자는 1번부터 N개 까지의 바구니이고, 두번째 인자는 방법, 즉 경우의 테스트 케이스 수를 의미하며
    두번째 부터는 테스트 케이스의 수대로 차례대로 입력하는대 각각 i번부터 j번 까지의 바구니에 k번(N의 길이 중에서의 공의 번호) 공을 넣는다.
    만약 1 2 4라고 입력을 하면 1번부터 2번까지 바구니에 4번 공을 넣는 것이고 이럴 경우 도현이가 입력한 바구니 수를 5라고 가정을 했을때
    4 4 0 0 0이 입력 되게 된다. 이 점을 착안하여 코드를 구현 해보자.
     */

       BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(br1.readLine());
       double M = 0;
       double max = 0;
       double average;
       double[] first_array = new double[N];
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br2.readLine());
       for (int i = 0 ; i < N ; i++){
            first_array[i] = Double.valueOf(st.nextToken());
            if (M < first_array[i]) M = first_array[i];
       }
       for (int i = 0 ; i < N ; i++){
            max += (first_array[i]/M)*100;
       }
        average = max/N;
        System.out.println(average);
    }
}




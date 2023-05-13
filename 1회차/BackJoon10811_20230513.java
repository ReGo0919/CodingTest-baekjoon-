import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon10811_20230513 {

    public static void main(String[] args) throws IOException, IOException {
    /* 도현이가 입력하는 첫번째 줄의 첫번째 인자는 1번부터 N개 까지의 바구니이고, 두번째 인자는 방법, 즉 경우의 테스트 케이스 수를 의미하며
    두번째 부터는 테스트 케이스의 수대로 차례대로 입력하는대 각각 i번부터 j번 까지의 바구니에 k번(N의 길이 중에서의 공의 번호) 공을 넣는다.
    만약 1 2 4라고 입력을 하면 1번부터 2번까지 바구니에 4번 공을 넣는 것이고 이럴 경우 도현이가 입력한 바구니 수를 5라고 가정을 했을때
    4 4 0 0 0이 입력 되게 된다. 이 점을 착안하여 코드를 구현 해보자.
     */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer mainst = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(mainst.nextToken());
//      첫번째 토큰 값은 도현이가 설정할 바구니의 개수와 공 번호의 범위 N을 입력.
        int M = Integer.parseInt(mainst.nextToken());
//      두번째 다시 도현이가 설정할 입력의 총 수(방법)를 설정
        int[] basketAmount = new int[N];
        for (int i1 = 0; i1 < N; i1++) {
            basketAmount[i1] = i1+1;
        }

//      바구니의 길이(배열)을 도현이가 입력한 N으로 설정
        for (int i1 = 0 ; i1 < M ; i1++) {
            StringTokenizer subst = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(subst.nextToken());
            int j = Integer.parseInt(subst.nextToken());
            int range = j - i ;
            while (range > 0){
                int tmp = basketAmount[i-1];
                basketAmount[i-1] = basketAmount[j-1];
                basketAmount[j-1] = tmp;
                i++;
                j--;
                range--;
            }
        }
        for(int n : basketAmount){
            System.out.print(n + " ");
        }
//      2번의 for문이 끝나게 되면 다시 foreach문을 사용해서 basketAmount의 인덱스를 모조리 꺼내주면 된다.
    }
}




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon10810_20230512 {

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
//      바구니의 길이(배열)을 도현이가 입력한 N으로 설정
        for (int i1 = 0 ; i1 < M ; i1++){
//      for문 입력, 참고로 이번 문제에선 i도 변수로 설정 되므로 i1으로 지정 해주었다.
//      어쨌든 0부터 도현이가 입력한 M(방법의 수) 까지 사용자의 값을 입력 받아 처리할 코드를 작성한다.
            StringTokenizer subst = new StringTokenizer(br.readLine());
//      그래서 도현이가 다음 두번쨰 줄에 i, j, k인자를 차례대로 입력하면
            int i  = Integer.parseInt(subst.nextToken());
            int j  = Integer.parseInt(subst.nextToken());
            int k  = Integer.parseInt(subst.nextToken());
//      각각의 값들을 i, j , k 토큰 값에 저장 후 아래의 for문을 다시 실행
            for(int i2 = i ; i2 < j ; i2++ ){
/*      다시 for 문을 돌리는데 여기서는 i2를 i(첫번째 바구니)로 넣어주고 i2가 j(두번째 바구니)+1
        (인덱스는 0으로 시작이 되니까 i-1부터 j-1 까지의 범위가 입력 되므로
        +1을 해주어야 우리가 생각하는 i부터 j까지의 범위를 설정 할 수 있다.)
        를 설정 해준다.*/
                basketAmount[i2-1] = k;
/*      다시 해당 바구니의 배열에 이번에는 i2-1열 인덱스에 k값을 저장시켜주는데
        그 이유는 우리가 바스켓 번호를 1부터 N번까지로 길이를 지정했지만
        실상 인덱스에 저장 된 배열은 0부터 N-1까지의 값이다. 즉 1번부터 5번까지 바스켓을 생성하여도
        코딩 상의 배열의 길이는 0부터 4까지가 되는 것이므로 -1을 해주어야 우리가 원하는 인덱스 열에 값을 넣을 수 있는 것이다.*/
            }
        }
        for(int n : basketAmount){
            System.out.print(n + " ");
        }
//      2번의 for문이 끝나게 되면 다시 foreach문을 사용해서 basketAmount의 인덱스를 모조리 꺼내주면 된다.
    }
}




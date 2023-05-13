import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.StringTokenizer;

public class BackJoon10813_20230512 {

    public static void main(String[] args) throws IOException, IOException {
    /* 10810의 문제를 살짝 변형하면 된다. 즉 첫번째 for문은 N의 길이 만큼 각 인덱스마다 1,2,3,4,5가 되도록 i1을 활용해 누적 대입 시켜주고
    두번째 for문에는 각각의 바구니 번호를 입력 받아 변수 교환 방식에 따라 임시 변수 temNum을 만들고 서료 교환하는데
    이때에도 인덱스에 -1을 걸어주어서 번호가 일치하도록 해주자(10810 부연설명 참조)
    교환이 이루어졌으면 foreach를 사용해 전부 출력 하면된다. 여기서는 살짝 printf의 형식 지정자를 응용 해보았다.
     */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer mainst = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(mainst.nextToken());
        int M = Integer.parseInt(mainst.nextToken());
        int[] basketAmount = new int[N];

        for (int i1 = 0; i1 < N; i1++) {
            basketAmount[i1] = i1+1;
        }
        for (int i2 = 0 ; i2 < M ; i2++){
            StringTokenizer subst = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(subst.nextToken());
            int j = Integer.parseInt(subst.nextToken());
            int temNum;

//      인트로 설명 필히 참조! (일일이 쓰는게 귀찮아서... ㅎ...;;)
            temNum = basketAmount[i-1];
            basketAmount[i-1] = basketAmount[j-1] ;
            basketAmount[j-1] = temNum ;
        }
        for(int n : basketAmount){
            System.out.printf("%-2d", n);
        }
    }
}




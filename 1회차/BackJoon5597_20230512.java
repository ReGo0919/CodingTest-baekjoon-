import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon5597_20230512 {

    public static void main(String[] args) throws IOException, IOException {
    /* 10810의 문제를 살짝 변형하면 된다. 즉 첫번째 for문은 N의 길이 만큼 각 인덱스마다 1,2,3,4,5가 되도록 i1을 활용해 누적 대입 시켜주고
    두번째 for문에는 각각의 바구니 번호를 입력 받아 변수 교환 방식에 따라 임시 변수 temNum을 만들고 서료 교환하는데
    이때에도 인덱스에 -1을 걸어주어서 번호가 일치하도록 해주자(10810 부연설명 참조)
    교환이 이루어졌으면 foreach를 사용해 전부 출력 하면된다. 여기서는 살짝 printf의 형식 지정자를 응용 해보았다.
     */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*불리언(1,0)형 배열을 생성을 하는데 그 이유는
        두번째 for문에서 1부터 30까지, 총 30번이 반복 되는 동안 그 if문의 값 안의 배열에 i를 넣어줘야 하기 떄문이다.
        만약 31이 아니라 30(1부터 30까지 들어가는 범위)를 넣는다면 두번째 for문의 i를 i-1로 지정을 해주어야
        올바른 인덱스 선택이 가능해진다.
        */
        boolean[] List = new boolean[31];
        //0부터 28이 되기 전까지, 총 28번을 실행하는 동안//
        for (int i = 0; i < 28; i++) {
            //BufferedReader를 통해 입력받은 String 입력값을 int형 정수로 n에 받고//
            int n = Integer.parseInt(br.readLine());
            //해당하는 그 값 자리인 배열 공간에 true(1)를 넣는다.//
            List[n] = true;

        }
        //그리고 다시 for문을 30번 돌린다.(출석 부르는 파트)//
        for (int i = 1; i <= 30; i++) {
        /*1. 만약 위에+ 사용자가 입력하지 않은 숫자가 5와 10이라고 하자.
        2. 이 for문에서는 순차적으로 1부터 30까지 i를 반복하게 되는데
        3. 5와 10은 첫번째 for문에서 true값을 받지 못한 상태에기 때문에
        4 .모든 자리에 1이 있는 것과는 달리 다섯번째와 열번째, 즉 arr[5] 자리와 arr[10]의 자리는 false(0)가 들어있는 상태
        5. arr[i]는 1(참), !arr[i]는 0(거짓)이라는 소리이기에
        6. arr[i]번째가 참이 아닌 경우, 즉 거짓값(0)이 들어있는 경우 그 자리값을 출력을 하라는 뜻.
        7. 참고로 조건문을 arr[i] == false이렇게 적어도 됨.
        */
            if (List[i] == false) System.out.println(i);  //불리지 않은 사람 출력
        }
    }
}




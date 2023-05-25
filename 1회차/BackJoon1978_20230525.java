import com.sun.source.doctree.SummaryTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BackJoon1978_20230525 {

    public static void main(String[] args) throws IOException, IOException {
        /* 이번 문제는 소수를 구하는 문제인데 나는 소수를 모른다... (처음 알았다.) 그래서 소수를 알아보니
        1과 자기 자신 외에는 나눠지지 않는 수라고 한다. 그래서 나머지를 활용 해보기로 했다.!
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] pList = new int[n];
//      유저에게 테스트케이스를 받아서 배열에 길이로 저장
        StringTokenizer st = new StringTokenizer(br.readLine());
//      토큰을 다음 입력값으로 받은 후
        for (int i = 0 ; i < n ; i++){
            pList[i] = Integer.parseInt(st.nextToken());
//      for 문을 돌려 배열의 0번 인덱스부터 토큰 값들을 차례대로 저장 해준다.
        }
        int sum = 0;
//      소수의 개수를 더해주는 sum 변수 지정
        for (int i = 0 ; i < pList.length ; i++){
//      배열 안에 모든 숫자들을 하나씩 꺼내 볼것이다.
            int count = 0;
//      이 count가 상당히 중요하다. 일단 0으로 초기화를 해준 후
            for (int j = 1 ; j < pList[i]+1 ; j++){
/*      다시 for문으로 j를 1, j가 리스트 해당 i번째 숫자의 +1값이 될때까지 j를 증가 시켜줄것이다.
        이게 무슨 소리냐면, 만약 특정 pList 특정 i번째의 값이 3이라고 가정읋 한다면
        j를 1부터 3+1, 즉 4가 될때까지 j를 누적 증가 시키라는 것이고
        이렇게 되면 j는 1,2,3 총 3번의 경우가 생성이 되는데*/
                if (pList[i] != 1 && pList[i]%j == 0){
/*          이어서 만약 3이 1이 아니고, 3을 j로 나눠서 0이라고 한다면 count값을 증가 시켜줄것이다.
            그렇게 되면 각각 3%1, 3%2, 3%3 세 경우가 생기는데
            아까 얘기 했던대로 소수는 1과 자기 자신 이외에 나눠지는 경우가 없다는걸 의미 한다면
            j가 1과 3일때 완전히 나누어지는 경우, 즉 3이 소수라는 조건을 충족하게 된다.
            그래서 count를 1일 때와 3일 때, 총 2번을 증가 시켜주는 것이다.
            물론 사용자 입력값의 특정 값(i번째의 값)이 1일 경우 1도 해당 조건에 성립이 되나
            count는 한 번만 충족을 시키므로 굳이 != 조건을 해줄 필요는 없다.
*/
                    count++;
                }
            }if(count == 2) sum++;
/*          그리하여 두번째 for문이 끝나고 count의 결과값이 2과 같을때, 즉 1과 자기 자신만 나눠지는 경우(2)를
            sum을 누적 시켜준다. 이 sum이 바로 소수의 개수가 되는 것이다. 이후 다시 첫번째 for문을 실행 한다.*/
        }System.out.println(sum);
    }
}



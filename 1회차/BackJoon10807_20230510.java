import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.StringTokenizer;

public class BackJoon10807_20230510 {

    public static void main(String[] args) throws IOException, IOException {
    /* 이 문제는 사용자가 입력한 숫자의 개수(N)와 입력한 실제 수의 집합(입력값),사용자가 찾는 숫자(V)가 주어졌다.
    또한 사용자의 입력값은 한 줄에 표시되며 이 중에 V의 값을 세어 찾아야 하기 떄문에
    추가로 이 V 값의 개수를 누적 카운팅 시킬 변수 ac(accumulate의 약자) 변수를 추가로 생성 해준다.
     */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
//      사용자가 입력할 테스트 케이스 수량
        StringTokenizer st = new StringTokenizer(br.readLine());
//      사용자가 입력할 숫자들을 Stringtokenizer st 변수를 이용해 구분되는 토큰 값으로 받고
        int[] user_input = new int[N];
//      해당 토큰을 다시 N의 길이 만큼의 공간을 가진 배열 user_input을 생성
        int V = Integer.parseInt(br.readLine());
//      다시 사용자가 셀 값을 지정
        int ac = 0;
//      if문에서 사용자가 찾을 값과 맞는 배열의 i값 발견시 카운팅을 할 ac 변수 생성

        for(int i = 0 ; i<N ; i++){
            user_input[i] = Integer.parseInt(st.nextToken());
/*          여기서는 일단 토큰 값을 배열에 담는 작업부터 하는데
            여기에 같이 if문과 누적값을 적었더니 V는 적용이 되는데 ac는 적용이 되지 않았다.
            둘 다 같은 바깥에 있는데... 그래서 일단 배열 작업 하는 for문과 조건문을 가진 for문을 하나 작성 했더니
            그제야 ac가 적용 되었더라. 음.... 지역변수의 개념을 좀 생각 해보아야겠다.
*/
        }
        for(int i = 0 ; i<N ; i++) {
            if (V == user_input[i]) ac += 1;
//      만약 사용자가 찾을 값과 인덱스의 i번째의 값이 같을 경우 ac를 누적 시켜주는 코드.
        }System.out.println(ac);
//      ac값(대상으로 셀 값) 출력
    }
}


//          다시 foreach문을 돌려서 Answer의 배열 안의 n의 요소들을 첫번째부터 차례대로 프린트.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon2884_20230506 {

        public static void main(String[] args) throws IOException, java.io.IOException {
        /*
         우선 분(M)이 45 이전, 그러니까 0부터 44까지의 경우와 45부터 59 까지의 경우(60이라는 분은 없기 때문) 이렇게 두 수를 보자.
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        if ((H >= 0 && H <= 23) && (M >= 0 && M <= 59)) {
//      우선 H가 0보다 크거나 같고 23보다 작거나 같으며, 다시 M이 0보다 크거나 같고 59보다 작거나 같은 조건의 if문을 넣어준다.
            if (H > 0 && M < 45) {
/*              첫번째 범위 조건을 만족 했다면 두번째 if문의 시작은 시간이 0을 제외하고 (1~23 까지) M이 45보다 작을때를 넣어준다. */
                H = H - 1;
/*              H-=1로 표현이 가능하나 쉽게 알아보기 위해 위와 같이 작성을 했고
                그래서 만약 사용자 입력값이 45분 부터라면 45전이라 H(시간)을 안바꿔도 되나
                0부터 44까지라면 45분 전으로 돌아갈때 시간이 1시간 뒤로 밀리기 때문에 시간을 빼준 것이다. */
                M = M+15;
/*              여기서는 설명이 힘든데 만약 사용자가 40분을 입력했다면 분은 45분 전인 55분으로 되어야 한다.
                그럴려면 그냥 15를 더해주면 되는데 그 이유는
                사용자가 0부터 44분 까지는 15를 더했을 때 45분 전으로 돌아간 그 시간과 같은 효과를 낼 수 있기 때문이다.
                만약 사용자 입력값(M)이 0이라면 0에서 45분 전은 바로 15분이 되므로 0+15를 한 결과값 15가 되는 것이고
                마찬가지로 15분을 입력했다면 15분의 45분 전인 30분이 되어야 하므로 15+15를 입력하면 30분으로 나타날 수 있게 된다.*/
            }else if (H == 0 && M < 45){
                H = 23;
                /* 첫번째 시간에 대한 조건이 아닐 경우, 즉 H가 1부터 23까지가 아닌 0(자정)이고
                마찬가지로 분도 1부터 44까지라면 바로 45분 이전의 시간으로 돌아갈 때 시간도 한 시간 되돌려야 하므로
                H를 0시, 자정 바로 전인 23으로 넣어준다.
                */
                M = M+15;
            }else{
                M = M - 45;
                /*그 반대의 경우, M이 45분 부터라고 한다면 그냥 M에서 45분 전을 뺀 값을 넣어준다.
                여기서 시간에 대한 조건을 넣지 않은 이유는 이미 맨 앞 첫번째 if문 조건(H는 0 이상, 23이하)
                이 성립 된다는 전제 하에 else문이 진행 되는 것이고
                마찬가지로 두번째 조건의 if와 else if에서 제외된, M이 45를 넘는 경우의 조건이 들어가기 때문에
                따로 지정 해주지 않은 것이다.
                */
            }
            System.out.println(H+" "+M);
        }else{
            System.out.println("범위 내의 값을 입력해주세요.");
        }


    }

    private static class IOException extends Exception {
    }
}
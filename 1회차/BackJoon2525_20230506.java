import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon2525_20230506 {

        public static void main(String[] args) throws IOException {
        /*
         이거 하다가 머리가 깨질 것 같았지만 어찌어찌 풀었다.
         일단 변수는 사용자 입력값(H와 M), 그리고 사용자가 추가할 분(add_M), 기존의 M과 add_M을 더할 total_M이 필요하다.
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int add_m = Integer.parseInt(st2.nextToken());
        int total_m = M+add_m;

        if ((H >= 0 && H <= 23) && (M >= 0 && M <= 59)) {
//      우선 H와 M의 시간 범위 조건을 걸어주고
            if (total_m <= 59) {
                System.out.println(H + " " + total_m);
/*          만약 기존 시간(m)과 사용자가 추가한 시간(add_m)의 합계인 total_m이 1시간이 추가되는 60분 이전인 59분 까지라면
            굳이 시간을 빼고 할 것 없이 기존 시간에 합친 시간을 표시 해주면 된다.
*/
            } else if (total_m >= 60) {
//              근데 그 반대의 경우, 즉 합친 시간이 60분 이상 부터라고 한다면 얘기가 달라지는데
                H = H + (total_m / 60);
/*              우선 시간은 기존 시간 + 토탈 시간을 시간 단위의 분(60)으로 나눈 값을 더해주면 된다.
                얘를 들어 사용자가 12 50에  50분을 추가 했다면 이후의 시간은 13 40일텐데
                이럴 경우 위의 시간식을 적용하면 12 + (100/60)이 되는 것이고 100을 60으로 나눌시
                몫은 1이 되는 것이기에 결과적으로 12 + 1 = 13이 되는 것이다.
                만약 total값이 120(2시간)이 된다면 12 + (120/60) -> 12 + 2 식이 되는 것이고
                결과는 14시가 출력 된다.
*/
                M = total_m % 60;
/*              그리고 분은 total_m에 60을 나눠서 남은 몫을 또 얻으면 되는데
                마찬가지로 위에서 사용자가 입력한 값이 12 50이고 50분을 추가 했을떄
                total_m은 100이 되고 이를 60으로 나눠서 나오는 나머지는 40이 나오기에 결과적으로 다음과 같은 식을 넣어주면 된다.
*/
                if (H > 23) {
/*              근데 신경 쓸게 한가지 더 있다. 바로 사용자가 입력한 결과값이 자정(24)을 넘어버리는 경우다.
                이럴 경우에는 24가 아닌 0부터 시간이 시작되므로 그냥 쿨하게 total_m을 60으로 나눈 몫을 넣어주면 된다.
                어차피 24 부터는 다시 0시부터 시작을 하기 때문에 이렇게 넣어주면 된다.
*/
                H = total_m/60;
                /* 근데 하다 보니 하루 이상의 분을 입력시(1440 이상) 다시 24로 시작되는 경우가 생기는데
                이건 어차피 사용자 입력 분이 0~1000으로 제한이 되어 있어서 이거는 상관 없을 듯 하다.
                */
                    System.out.println(H + " " + M);
                // 그래서 이렇게 적용 된 H와 앞전의 M을 갖고와서 출력 해주고
                }else{
                    System.out.println(H + " " + M);
                // H가 23까지라면 앞전의 H와 M을 끌고 와서 출력을 해준다.
                }
            } else {
        //      마찬가지로 만약 사용자 입력값이 가장 첫번째의 if 조건문을 충족치 않을시 해당 문구 출력
                System.out.println("범위 내의 값을 입력해주세요.");
            }

        }
    }
}
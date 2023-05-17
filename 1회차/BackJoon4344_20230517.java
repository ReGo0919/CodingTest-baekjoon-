import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BackJoon4344_20230517 {

        public static void main(String[] args) throws IOException {
        /* 이번 문제는 첫째줄에 테스트 케이스, 두번째 줄에 학생의 수와 각 학생의 성적을 받아
        해당 그룹의 평균 성적을 초과하는(이상 아님.) 학생들의 비중을 출력하는 문제이다.
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(br.readLine());
//      일단 테스트 케이스 받고
        int sum = 0;
//      해당 그룹의 총 점수를 담을 sum과
        int average = 0;
//      평균 값을 담을 average 변수를 생성.
        int count = 0;
//      평균이 넘는 학생들을 담을 count도 생성.
            for (int i = 0 ; i < N ; i++){
//              for문을 testcase(N값) 만큼 반복 하면서
                StringTokenizer st = new StringTokenizer(br.readLine());
//              토큰 생성 후
                int student = Integer.parseInt(st.nextToken());
//              사용자 입력값의 첫번째 값(학생 수) 를 담아주고
                int[] studentArr = new int[student];
//              그 값을 studentArr의 배열 길이로 지정한다.
                for (int j = 0 ; j < student ; j++){
//              다시 for문을 student(정확히 얘기하면 studentArr의 길이) 만큼 돌면서
                    studentArr[j] = Integer.parseInt(st.nextToken());
//                  studentArr의 j인덱스(0부터 시작)로부터 차례대로 다음 토큰값을 입력 받는다.
                    sum += studentArr[j];
//                  그리고 studentArr[j]에 저장 된 값을 sum에 누적 시켜준다.
                }
                average = sum/student;
//              for문이 끝나면 average 변수에 sum을 student로 나눈 값(곧 평균)을 저장시켜주고
                for (int l = 0 ; l < student ; l++){
//              다시 l을 student의 길이 만큼 반복 시켜주면서
                    if (studentArr[l] > average) ++count;
//              만약 studentArr의 처번째 값(첫번째 학생의 점수)가 평균을 넘는다면 count를 선증가 시켜준다.
                }
                System.out.printf("%.3f%%\n", ((double) count / student) * 100);
                /*그리고 printf 함수를 사용해 전체 학생(studnet) 중에 평균을 넘은 학생(count)를 추산(나누기)한 값을
                double 형태로 형변환 후 *100을 해주어 백분율을 맞추어주고(결과값이 0.N 값의 수로 출력 되기 때문.)
                .3f%% (.은 소수점을 의미하고 3f는 소수점 3째 자리까지, %%는 %의 표시를 위한 이스케이프 시퀸스를 의미한다.)
                를 작성 후 출력.
                 */
            }
        }

}
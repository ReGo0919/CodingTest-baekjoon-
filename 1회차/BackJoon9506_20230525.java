import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BackJoon9506_20230525 {

    public static void main(String[] args) throws IOException, IOException {
        /* 이번엔 while문을 연습 할 겸 같이 사용을 해주었다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> nList = new ArrayList<>();
//      사용자가 무슨 값을 입력 할 지 모르기 때문에 가변 길이 저장이 가능한 ArrayList를 Integer형으로 생성 해주었다.
        int sum = 0;
//      약수의 덧셈값을 저장할 sum 변수 선언
        int n = 0;
//      사용자의 입력값을 받을 n 변수 초기화
        while (n != -1){
//      사용자 입력값이 -1, 즉 -1을 제외한 모든 수가 입력될 때 while문이 돌게 했다.
            n = Integer.parseInt(br.readLine());
//      사용자로부터 입력값을 받고
            if (n > 2 && n < 100000) {
//          입력값이 2 초과, 100000이하일 때
                sum = 0;
//              sum을 초기화. 이유는 while문이 반복 되는 동안 사용자의 다음 입력값으로 sum값이 누적 되기 때문이다.
                nList = new ArrayList<>();
//              sum과 같은 이유로 nList도 초기화.
                for (int i = 1; i <= n; i++) {
//              i를 1부터 시작하는 이유는 n값을 1부터 n까지 나누어야 하기 때문이다.
                    if (n % i == 0) nList.add(i);
//              만약 n을 i로 나눠서 0일 경우, 즉 i가 n의 약수 일경우 nList에 i값을 add 시켜준다.
                }
//              첫번째 약수를 구하는 for문이 끝난 후 두번째 for문으로 이동.

                for (int i = 0; i < nList.size(); i++) {
//              for문이 배열의 사이즈 까지 돌면서
                    sum += nList.get(i);
//              sum에 저장 해두었던 nList(배열)의 i값들을 차례대로 누적 증가시켜준다.
                }
                sum = sum - n;
/*              여기서 다시 sum을 sum에서 n의 값을 빼준 결과값을 저장 해주냐면
                만약 사용자의 입력값(n)이 6이라고 가정을 하면 이에 대한 약수는 1,2,3,6이 되고
                sum 값은 1,2,3,6을 더한 12일텐데 문제는 주어진 n의 값에 대한 약수들 중
                결과값인 자기 자신을 제외한 약수들을 더할 경우(6을 제외한 1,2,3의 값) 자기 자신(6)이 되는걸
                증명하기 위한 코드를 짜는 것이므로 모든 값이 저장 된 sum에서 n(6), 자기 자신을 빼주는 것이다.
                뭐 굳이 복잡하게 할 필요 없이 애초에 i < nList.size()-1 이렇게 조건을 걸 경우
                항상 배열의 마지막 인덱스인 n의 값, 바로 자기 자신을 빼주고(-1) 그 범위의 값, 즉 1,2,3을 sum에
                누적 증가 시켜주도록 코드를 짤 수 있다. */
                    if (sum == n) {
//                  이제 sum(n을 제외한 약수들의 값)이 n과 같을 경우, 즉 구하고자 하는 결과값의 조건에 만족하는 경우
                        System.out.printf("%d = ", n);
//                      첫번째 라인에 n을 우선 출력하고
                        for (int i = 0; i < nList.size() - 1; i++) {
//                      인덱스 값들을 꺼내기 위해 for문을 이용 해준다. foreach로도 사용 가능하다.
                            System.out.printf("%d", nList.get(i));
//                      마찬가지로 n과 같은 줄에 i의 첫번째 값부터 꺼내오는데
                            if (i < nList.size() - 2) {
/*                          만약 i가 배열의 사이즈(4)의 -2의 값, 즉 2보다 작을 경우 +를 추가로 출력 한다.
                            그 이유는 위의 if문 에서의 출력 순서는 n -> nList.get(i) -> + 인데
                            우리가 원하는 값은 6 = 1 + 2 + 3이라서 6(n)은 한 번, 약수는 총 세 번, +는 총 두 번이
                            출력 되어야 한다. 즉 n과 약수가 출력 된 후 +를 두 번 출력 시키기 위해
                            i가 배열의 사이즈(4)의 -2의 계산값인 2까지, 즉 0,1 총 두번의 경우만 +를
                            출력 하도록 하는 것이다. 만약 배열의 값이 다섯개라면
                            x1 + x2 + x3 + x4 + x5 이렇게 +값은 총 4번을 출력 해야 하는 경우
                            5 - 2 = 3, 즉 0부터 3까지 +를 출력 할 수 있게 된다. 그래서 -2를 빼주는 것이다.*/
                                System.out.print(" + ");
                            }
                        }
                    }else{
                        System.out.printf("%d is NOT perfect", n);
//                  다시 돌아와 만약 sum이 n과 같지 않다면 다음 문구를 출력하고
                    }
            }else{
//          -1을 제외하고 첫번째 조건문의 범위에서 벗어났을 때 다음 문구 출력.
                System.out.println("범위에 맞는 값을 입력 해주세요.");
            }
        }

    }
}



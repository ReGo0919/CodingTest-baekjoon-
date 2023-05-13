import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BackJoon10950_20230505 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      버퍼 선언
        Scanner sc = new Scanner(System.in);
//      Scanner 선언
        int testcase = sc.nextInt();
//      사용자의 테스트케이스를 받은 int형 testcase 선언
        int[] Answer = new int[testcase];
//      사용자의 테스트케이스 만큼 결과값을 담을 int형 배열 Answer 선언
        for (int i = 0 ; i<testcase ; i++){
//      만약 사용자가 테스트케이스를 5로 입력했다면 i는 5보다 작을 때까지, 즉 0번째부터 4번째까지 총 5회 for문을 돈다.
            StringTokenizer st = new StringTokenizer(br.readLine());
//          StringTokenizer를 이용해 사용자에게 공백이 포함 된 두 수를 입력을 받으면 각각을 int형 A와 B변수에 담는다
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
//          마찬가지로 미리 선언한 Answer의 i번쨰(i가 0번째 시작이라면 Answer[i]의 자리에는 0번째로 된다.)에 A와 B를 더한 값을 저장.
            Answer[i] = A+B;
        }
//      다시 foreach를 활용해 배열 Answer의 길이만큼 i문을 반복해 차례대로 꺼내어 출력 해준다.
        for (int i : Answer){
            System.out.println(i);
        }

    }


}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon5086_20230524 {

    public static void main(String[] args) throws IOException, IOException {
        /* 이번엔 while문을 연습 할 겸 같이 사용을 해주었다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
//      만 번 까지 셀 카운트 설정
        while (count < 10000){
//      while문으로 count가 만 번보다 작을 때 까지 반복 수행
            StringTokenizer st = new StringTokenizer(br.readLine());
//          사용자 입력값을 st변수에 받아서
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
//          각각 A와 B변수에 담아준 후
            if (A == 0 && B == 0){
//          만약 A와 B가 둘 다 0이라면 break로 while문까지 끝내줌.
                break;
            } else if (B%A == 0){
                System.out.println("factor");
//              그게 아니라면 A를 B로 나눈 나머지 값이 0일시 B는 A의 약수가 되므로 factor를 출력하게 해주고
                count++;
//              카운트 증가 후 while문 다시 실행
            }else if(A%B == 0){
/*              만약 A를 B로 나누어서 0의 값이 안나온다면 B를 A 나누어서 나오는 값이 0일때를 찾는 것이다.
                이게 무슨 말이냐면, 만약 A에 32가, B에 4가 들어 왔을 때 B는 A를 B로 나눈다면
                당연히 A는 배수이고 B는 약수라서 "multifle"을 출력해야 하는데
                이럴 경우 A,B 위치만 바꾸어서 A(32)를 B(4)로 나누어서 0이 될 경우
                multifle 문구가 출력하도록 하는 것이다. 어쨌든 우리는 A가 무슨 값인지를 알려주면 되는 거니까.*/
                System.out.println("multifle");
                count++;
            }else{
                System.out.println("neither");
//          만약 else if문들의 조건들에도 부합하지 않는다면 neither문구 출력.
                count++;
            }
        }

    }
}



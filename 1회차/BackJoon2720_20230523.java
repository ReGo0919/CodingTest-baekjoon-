import javax.xml.transform.Result;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon2720_20230523 {

    public static void main(String[] args) throws IOException, IOException {
    /* 일단 중첩 if문을 활용해서 문제를 해결 해보려고 했는데 씨알도 안먹혔다.
    시간 초과로 내가 짠 코드에 어떤 문제점이 있는지는 다음 회차에서 분석을 해보아야 할 것 같다.
     */
    /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        double change = 0;
        int Quarter = 0;
        int Dime = 0;
        int Nickel = 0;
        int Penny = 0;


        for (int i = 0; i < T; i++) {
            int Money = Integer.parseInt(br.readLine());
            if (Money / 0.25 == 0) {
                Quarter = (int) ((Money / 0.25) * 0.01);
                System.out.printf("%d %d %d %d", Quarter, Dime, Nickel, Penny);
            } else {
                Quarter = (int) ((Money / 0.25) * 0.01);
                change = Money - (0.25 * 100 * Quarter);
                if (change / 0.10 == 0) {
                    Dime = (int) ((change / 0.10) * 0.01);
                    System.out.printf("%d %d %d %d", Quarter, Dime, Nickel, Penny);
                } else {
                    Dime = (int) ((change / 0.10) * 0.01);
                    change = change - (0.10 * 100 * Dime);
                    if (change / 0.05 == 0) {
                        Nickel = (int) ((change / 0.05) * 0.01);
                        System.out.printf("%d %d %d %d", Quarter, Dime, Nickel, Penny);
                    } else {
                        Nickel = (int) ((change / 0.05) * 0.01);
                        change = change - (0.05 * 100 * Nickel);
                        if (change / 0.01 == 0) {
                            Penny = (int) ((change / 0.01) * 0.01);
                            System.out.printf("%d %d %d %d", Quarter, Dime, Nickel, Penny);
                        }
                    }
                }
            }

        }
        */
//      답안 출처 - https://propercoding.tistory.com/285
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
//      여기까지는 똑같다.
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;
//      근데 여기서부터는 동전들을 정수 타입으로 각각 저장을 했다.
        StringBuilder sb = new StringBuilder();
//      그리고 StringBuilder 객체 생성.
        for (int i = 0; i < T; i++) {
//      for문이 testcase의 수 만큼 도는 동안
            int c = Integer.parseInt(br.readLine());
//          사용자에게 값을 입력 받는다. 예를 들어 124를 입력 받았다고 하자.
            sb.append(c / quarter + " ");
          /*StringBuilder의 append를 활용하여 사용자 입력값(c) / 25(쿼터 값)에 공백 하나를 더하여 sb에 append를 시켜준다.
          참고로 append를 사용 할 경우 대상값은 String 형태로 변환 뒤 append.*/
            c %= quarter;
//          C를 Quarter로 나눈 나머지 값(124%25 = 24)이 c에 연산 대입된다.
            sb.append(c / dime + " ");
//          이하 위와 같은 과정으로 작업 수행.
            c %= dime;
            sb.append(c / nickel + " ");
          /*여기서 의문이 들었던게 c랑 nickel을 연산하면 그래도 뒤에 자리가 남는데 왜 append가 되지 않는거가에 대해서 였다.
          그래서 찾아보니 int와 int간의 연산에는 소수점이 버려진 값이 return 된다고 한다.(c와 nickel 둘 다 int형)
          그래서 append를 해도 소수점을 제외한 나머지 정수(0) 부분만 append 되는 것이다.*/
            c %= nickel;
            sb.append(c / penny + "\n");
          /*참고로 마지막에 \n을 안 달아줄 경우 penny(첫번째 입력값의 penny) 이후의 두번째 append 값들도 연속 되어 저장 되기 때문에
          첫번째 줄의 quarter, dime, nickel, penny가 어펜드 될때 penny에 \n(줄바꿈)을 같이 어펜드 해주어
          자연스럽게 두번째 줄로 내려가 두번째 입력값에 대한 quarter, dime, nickel,penny를 획득 하게 할 수 있는 것이다.
          (마지막 출력값에 줄바꿈(공백) 이 나와 있는 걸 보면 쉽게 알 수 있다.*/
        }
        System.out.print(sb);
//      sb값 출력
    }
}




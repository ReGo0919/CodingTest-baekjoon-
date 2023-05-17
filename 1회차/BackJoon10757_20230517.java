import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BackJoon10757_20230517 {

    public static void main(String[] args) throws IOException, IOException {
    /* 여기서는 자바 수학 함수 중에 BigInteger 클래스를 사용했다. 이 함수는 long보다 더 큰 값을 받을 수 있는 클래스이다.
     */

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
//  사용자로부터 입력 받은 숫자열을 공백 기준으로 토큰으로 변환 후
    BigInteger A = new BigInteger(st.nextToken());
    BigInteger B = new BigInteger(st.nextToken());
    /*A와 B에 각각 나누어 담는다.
    여기서 나는 BigInteger A = BigInteger.valueOf(Long.parseLong(st.nextToken()));
    이렇게 입력을 해서 토큰을 long형으로 변환 후 BigInteger.valueOf를 사용해 BigInteger형 정수로 받으려 했는데
    이게 이유를 알아보니 BigInteger 객체로 변환 시에는 Biginteger의 생성자를 먼저 생성을 하고 활용을 해야한다고 하며
    참고로 BigInteger는 String 값을 처리 하기 위해 사용되므로 다른 타입의 변수를 받을 때는
    String.valueOf를 사용 해주어야 한다.
    */
    System.out.println(A.add(B));

    }
}




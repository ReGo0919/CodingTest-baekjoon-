import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BackJoon2753_20230506 {

        public static void main(String[] args) throws IOException {
        /* 윤년의 조건
           첫번째 가정
           1. 윤년은 4의 배수이면서 400의 배수이다. (and조건)
           2. 윤년은 4의 배수이면서 100의 배수가 아니다. (and조건)
           3. 조건식에 || 연산자를 이용해서 한번에 넣기 ->윤년은 4의 배수이면서 400의 배수 or 4의 배수이면서 100의 배수가 아닌 경우(or)
           두번째 가정
           1. 이중충접문을 사용해 윤년은 4의 배수일때 다음 if문에서 !100의 배수 || 400의 배수로 걸어주고 else로 그 나머지 값을 처리해줌.
        */
        Scanner sc = new Scanner(System.in);
        int Input = sc.nextInt();
        if ((Input%4 == 0) && (Input%400 == 0 || Input%100 != 0)){
/*      처음 생각한 코드는 이것. ((Input%4 == 0 && Input%400 == 0) && (Input%4 == 0 && Input%100 != 0))
        즉 4의 배수이면서 400의 배수이거나 혹은 4의 배수이면서 100의 배수가 아닌 것인데
        굳이 저렇게 쓰지 않고도 Input이 4의 배수일 때의 조건이 만족하면 다음 두번쨰(400의 배수 이거나 100의 배수가 아닐 때)
        식도 적용된다. 어쨌든 or 조건이라 4의 배수를 만족 하더라도 100의 배수가 아니거나 400의 배수인 경우로 해석이 가능하니까.*/
            System.out.println(1);
        }else{
/*         그 외에 else는 input이 4의 배수가 아닌 것으로 설사 4의 배수값을 만족 하더라도 다시 400의 배수가 아니거나 100의 배수인 경우
           이 조건식 외에는 따로 (boolean 조건식은 두가지 경우(true 혹은 false) 밖에 없기에) else만 넣어줘도 된다.
*/
           System.out.println(0);
        }
    }

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BackJoon10988_20230516 {

        public static void main(String[] args) throws IOException {
        /* 이번에는 StringBuilder를 사용했다. 이 클래스는 문자 조작에 다양한 메서드를 제공하며
        기본적으로 append, insert, delete, reverse, tostring이 있다.
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
//      br을 입력 받아 str에 저장

        StringBuilder newStr = new StringBuilder();
//      StringBuilder 클래스의 newStr 생성자 생성.
        newStr.append(str);
//      newStr에 str(사용자 입력값)을 append
        newStr = newStr.reverse();
//      appened 후 reverse로 문자열을 뒤집은 내용을 newStr에 저장.

                if (str.equals(newStr.toString())){
                /*   여기서는 str.equals를 사용해 String을 다른 String과 비교하도록 했으며
                     newStr을 직접적으로 비교하게 되면 식별자 형식으로 비교를 하게 되기 때문에 타입이 다르므로 에러가 발생한다.
                     그래서 toString(StringBuilder의 메서드중 하나)을 사용해 형변환 후 str과 비교를 한다.
                */
                        System.out.println(1);
//              그리하여 조건에 맞으면 1을 출력
                }else{
                        System.out.println(0);
//              다르면 0을 출력.
                }
        }

}
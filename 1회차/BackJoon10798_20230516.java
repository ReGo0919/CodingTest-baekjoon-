import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BackJoon10798_20230516 {

        public static void main(String[] args) throws IOException {
            /*일단 사용자로부터 다섯개의 문자열을 입력 받는다. */
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str1 = br.readLine();
            String str2 = br.readLine();
            String str3 = br.readLine();
            String str4 = br.readLine();
            String str5 = br.readLine();
            String[] strArray = {str1, str2, str3, str4, str5};
//          그 후 모든 문자를 strArray 배열에 담은 후
            int repeat = 5;
//          for문을 반복 할 int 변수에 5를 저장한다(StrArray 문자열들 중 가장 긴 길이를 뽑아내기 위한 범위이다. 문자열이 다섯개 들어있으니까)
            int maxLength = strArray[0].length();
//          maxLength를 어레이의 초기값의 길이로 설정.
            for (int i = 0 ; i < repeat; i++){
                if (maxLength < strArray[i].length()) maxLength = strArray[i].length();
//                for문을 돌려 만약 maxlength보다 긴 길이의 strArray의 i번째 문자열이 있다면 그 값을 maxLength에 저장
            }

            for (int i = 0; i < maxLength; i++) {
//          for문을 각 문자열을 모두 출력 할 수 있도록 가장 긴 길이가 담긴 maxlength를 범위로 놓고 돌린다.
                if (i < str1.length()) {
                  /*만약 str 문자열이 3개라고 가정을 하자. 그러면 str1의 문자들의 인덱스는 0,1,2 일것이다.
                    조건은 i(0)가 str1의 길이(3) 보다 작다면 다음 아래의 str1의 i번째(0)를 출력하라는 조건인 것이고
                    결과적으로 이 if문이 수행 되고나면 그 바로 아래의 나머지 str2, 3, 4,5도 똑같이 적용 시켜서
                    모든 문자열을 세로 방향으로 꺼내게 되는 효과를 낼 수 있다.
                   */

                    System.out.print(str1.charAt(i));
                }
                if (i < str2.length()) {
                    System.out.print(str2.charAt(i));
                }
                if (i < str3.length()) {
                    System.out.print(str3.charAt(i));
                }
                if (i < str4.length()){
                    System.out.print(str4.charAt(i));
                }
                if (i < str5.length()){
                    System.out.print(str5.charAt(i));
                }

            }
            System.out.println(); // 줄바꿈

        }

}
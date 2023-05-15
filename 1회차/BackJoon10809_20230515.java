import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon10809_20230515 {

    public static void main(String[] args) throws IOException, IOException {
    /* 일단 이 문제를 푸는대에 시간을 많이 잡아먹었다. 문제에 제시 된대로 배열당 아스키코드값을 저장하면
    코드는 줄어들지만 난 그럴 정도로 아직 코테에 익숙한건 아니라 배열을 적극 활용했는데
    우선 각 알파벳을 담을 배열 하나, 그 알파벳들의 순서를 담을 배열 또 하나,
    사용자가 입력한 String형의 문자를 다시 문자 배열로 담아줄 배열 하나로 잡았다.
     */

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
//  br로 사용자 입력값을 str에 담고
    char[] AlphabetArr = new char[26];
//  실제 알파벳 값들을 담을 베열 생성
    int[] OrderArr = new int[26];
//  알파벳의 순서를 담을 배열 하나.
    int strlength = str.length();
//  이건 str.length를 집어 넣어줘도 되는데 가독성 편하라고 그냥 만듬.
    char[] UserAlphabet = new char[strlength];
//  다시 사용자가 입력한 str을 문자 형태로 하나하나 담아줄 배열 하나 생성.
        for (int i = 0; i < 26 ; i++){
//          for문을 돌리고
            OrderArr[i] = -1;
//          OrderArr의 26개의 공간에 전부 -1을 담아 준다. 그 이유는 예시 참조.
            AlphabetArr[i] = (char)(i + 97);
          /*그와 동시에 a부터 z까지의 문자를 AlphabetArr에 차례대로 담아준다.
            이때 97부터 시작하는 이유는 a의 마스키 값이 97이기 때문이고
            그래서 아스키 값에 i를 더한 후 char 형태로 변환하여 차곡차곡 담아준다.*/

        }
        for (int i = 0 ; i < strlength ; i++){
//          두번째 for문은 Alphabet의 길이만큼 사용자 입력값 str을 charAt을 사용하여 i 위치에 해당하는 문자를 가져와 저장.
            UserAlphabet[i] = str.charAt(i);
        }
        /* 여기서는 개념이 조금 복잡해지는데, 별찾기 문제처럼 2중 for문을 사용 하였다.
        만약 사용자가 입력한 값이 ABC라고 한다면 첫번째 for문의 시작점은 i(A)를 찾도록 하는 것이며
        두번째 for문은 j가 26까지 도는 동안 알파벳이 들어있는 배열의 J순서와 유저가 입력한 배열값의 i순서의 알파벳이 같을 경우
        OrderArr[j] 번째에는 i를 담게 된다.
        만약 i=2(C)를 찾게 된다면 두번째 for문 에서는 J가 2일때 UserAlphabet에 있는 문자와 같아지므로
        이때 OrderArr[j=2]에 i값(2)을 넣어주면 된다. 이렇게 넣어주면 OrderArr의 세번째 자리에는 2가 들어가며
        결과적으로 C는 ABC에서 3번째(순서는 0부터 시작 되므로 3번째가 맞음)로 등장을 한다는 것을
        OrderArr의 세번째(여기에는 A부터 Z까지 -1가 담겨 있다)에 j(2)값을 보여줌으로서 알게 된다.
        이해가 안되나? 당연하다. 나도 이해가 안되서 개고생했다.
        */
        for (int i = 0 ; i < strlength ; i++){
            for (int j = 0 ; j < 26 ; j++){
                if (AlphabetArr[j] == UserAlphabet[i]){
                    OrderArr[j] = i;

                }
            }
        }
        for (int n : OrderArr){
            System.out.print(n + " ");
        }


    }
}




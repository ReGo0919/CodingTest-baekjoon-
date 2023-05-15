import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon11781_20230515 {

    public static void main(String[] args) throws IOException, IOException {
    /* 간단한 문제로 보이지만 조건이 까다로운데 조건은
    1. 입력은 최대 100줄(for문 사용)
    2. 입력은 알파벳 소문자, 대문자, 공백, 숫자로만 입력
    3. 각 줄마다 100자를 넘기지 않고
    4. 각 줄은 빈 줄을 허용하지 않으며
    5. 각 줄은 양쪽에 공백으로 시작하거나 공백으로 끝나지 않는다.
    솔직히 그냥 혀 깨물고 포기할까 했는데 그래도 조건을 한번 입력 해보기로 했다.
     */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
//      일단 사용자로부터 값을 입력 받고

        for (int i = 0 ; i < 100 ; i++){
//      첫번째 조건은 최대 입력줄은 100까지만 이라고 했으니 100번 입력 받도록 했고
            if ((str = br.readLine()) != null &&
/*              두번째 조건, 사용자에게 입력 받은 str값이 비어있지 않은 경우인데 str = br.readLine을 감싸지 않으니 타입
                타입 에러가 떠서 감싸주니까 잘 비교가 된다.*/
                 str.matches("[a-zA-Z0-9 ]+") &&
/*              세번째 조건, matches함수를 사용해 안의 조건의 값들과 매치될 경우를 넣어준다
                순서대로 a부터 z까지, A부터 Z까지, 0부터 9까지, 그 뒤에 공백까지 범위를 정한 후
                +를 붙여주어 각각의 문자가 최소한 하나 이상의 범위 안에 매칭 되는지를 검색한다 */
                 str.length() <101 && !str.trim().isEmpty() &&
/*              네번째 조건, 문자열의 길이는 100이하이며 trim을 이용하여 str의 양쪽 공백을 지웠을때
                빈 줄이 아닐 경우를 조건으로 걸어준 경우이다. */
                !str.startsWith(" ") && !str.endsWith(" ")){
/*              다섯번째 조건, str의 앞쪽에 공백이 있지 않거나, 뒷쪽에 공백이 있지 않을때를 조건으로 건 경우
                즉 둘 중 하나라도 공백이 있으면 else로 빠져나가게 된다는 것이다. */
                System.out.println(str);
//              이 모든 조건들이 부합되면 str을 출력!
            }else{
                System.out.println("조건에 맞는 문자를 입력해주세요.");
//              하나라도 조건에 맞지 않으면 뭐.... 종료.
                return;
            }
        }

    }
}




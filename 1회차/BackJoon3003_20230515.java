import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon3003_20230515 {

    public static void main(String[] args) throws IOException, IOException {
    /* 배열로 풀면 은근 쉬운 문제이다.
    일단 기본 세트에 필요한 각 장기말의 수배열 하나, 동혁이가 가지고 있는 각 장기말의 수 배열 하나,
    기본 세트에서 동혁이가 가지고 있는 장기수를 뺀 값을 저장할 배열 하나 이렇게 세 개의 배열이 필요하다.
    물론 char를 활용해 charAt과 (int)를 활용해서도 식을 작성 할 수 있으나 일단 내가 거기까지 생각하기에는...
    일단 문제 푸는 것에만 집중 하기로... ㅎ...
     */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
//      사용자에게 입력 받은 br을 st 토큰에 쓸어 담은 후
        int length = st.countTokens();
//      length에 st의 토큰 수(countTokens)를 저장한다.
        int[] userchess = new int[length];
        int[] normalchess = {1, 1, 2, 2, 2, 8};
        int[] requiredchess =new int[length];
//      위 세 배열은 각각 처음에 설명 했던대로 배열을 생성.
            for (int i = 0 ; i < length ; i++){
//          토큰 수대로 for문을 도는 동안
                userchess[i] = Integer.parseInt(st.nextToken());
//          토큰을 하나씩 userchess의 i번재 인덱스에 저장을 시킨 후
                requiredchess[i] = normalchess[i] - userchess[i];
//          기본 세트에서 유저 장기말의 수를 뺀 값을 requiredchess의 i번째 인덱스에 저장한다.
            }
            for (int n : requiredchess) System.out.print(n + " ");
//          첫번째 for문이 끝나면 foreach를 사용해 requiredchess 값들을 하나씩 차례대로 출력.



    }
}




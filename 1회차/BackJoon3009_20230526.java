import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon3009_20230526 {

    public static void main(String[] args) throws IOException, IOException {
        /* 이번 문제는 머리만 잘 굴리면 맞출 수 있는 문제이다.
        간단히만 말하면 직사각형을 구성하는 양 네 개의 꼭지점 중 x1와 x2, x3과 x4를 이은 점들은 서로 수평으로 나란히 놓일 것이고
        이렇게 될때 x1와 x3, x2와 x4는 서로 같은 x의 좌표를 가지게 되는 것이다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] xcord = new int[4];
        int[] ycord = new int[4];
//      사각형은 4개의 좌표로 되어 있으므로 각각 x좌표와 y좌표를 순서대로 담아줄 두 배열을 생성한다.

        for(int i = 0 ; i < 3 ; i++){
//      for 문을 3번, 즉 사용자로부터 x와 y의 좌표들을 총 세 번 받을 거니까 3번 반복을 하고
            StringTokenizer st = new StringTokenizer(br.readLine());
//      그 입력값을 토큰 값으로 치환 후
            xcord[i] = Integer.parseInt(st.nextToken());
            ycord[i] = Integer.parseInt(st.nextToken());
//      각각 xcord의 i번째 인덱스와 ycord의 i번째 인덱스에 차레대로 담아준다.
        }
/*      여기서부터는 경우의 수를 생각해보면 편하다. 즉 배열의 첫번째 값과 두번째 값이 같고,
        첫번째 값과 세번째 값이 다르다면 자연스럽게 비어있는 네번째 값은 세번째 값과 동일해야
        정확하게 x1과 x3이 같은 값을 가지고, x2와 x4의 값이 같은 값을 가지게 되는 것이다.
        두번째 경우는 이와 반대되는 경우로서 첫번째 값이 두번째 값과 다르고, 다시 첫번째 값이 세번째 값과 같을 경우
        네번째 값은 자연스럽게 두번째 값과 같은 값을 가지면 되는 것이다.
        마지막 경우는 첫번째 값이 두번째와 세번째 값과 같지 않을 경우인데 이 경우는 else로 편하게 첫번째 값을
        네번째 값에 대입을 시켜주면 된다.*/
        if (xcord[0] == xcord[1] && xcord[0] != xcord[2]) xcord[3] = xcord[2];
        else if (xcord[0] != xcord[1] && xcord[0] == xcord[2]) xcord[3] = xcord[1];
        else xcord[3] = xcord[0];

        for(int x : xcord) System.out.print(x + " ");

        if (ycord[0] == ycord[1] && ycord[0] != ycord[2]) ycord[3] = ycord[2];
        else if (ycord[0] != ycord[1] && ycord[0] == ycord[2]) ycord[3] = ycord[1];
        else ycord[3] = ycord[0];

        for(int y : ycord) System.out.print(y + " ");

        System.out.printf("%d %d", xcord[3], ycord[3]);
//      코드가 완성 되면 실험 삼아 출력 해보고 마지막으로 우리가 찾는 x와 y의 값을 출력하면 된다.



    }
}



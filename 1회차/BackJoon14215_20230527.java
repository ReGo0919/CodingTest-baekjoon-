import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BackJoon14215_20230527 {

    public static void main(String[] args) throws IOException, IOException {
        /* 이번 문제는 이태까지 한 삼각형 문제들의 응용 편인데 조건을 해석하느라 약간 좀 애를 먹었다.
        특히 1 100 1 입력 부분에서 "막대 길이를 자유롭게 조절 할 수 있으면 굳이 100 말고 나머지 두 막대를 건드리면 되지 않을까?"
        라는 생각을 했지만 일단 원리를 보자면 두 수가 같을때는 나머지 한 변을 그 두 수와 같게 만들어주는 원리라고 보면 편하겠다.
        즉 내가 알아는 원리는
        1. 각 변의 길이가 같으면 그 합을 출력
        2. 두 변의 길이가 같고 한 변의 길이가 다를때 그 두변의 길이를 합쳐서 나머지 한 변 보다 길면 그대로 그 전부의 합을 출력
        3. 2번과 반대로 두 변의 길이의 합이 한 변의 길이보다 작다면 그 한 변의 길이를 다른 두 변의 길이와 같게 해줌.
        4. 세 변의 길이가 다 다를때 작은 두 변의 길이의 합이 나머지 제일 긴 변의 길이와 같은 경우 긴 변의 길이를 -1 시켜준다.
        5. 4번과는 반대로 두 변의 합의 길이가 제일 긴 변의 길이보다 작은 경우 제일 긴 변의 길이를
        작은 두 변의 길이의 합의 -1 처리한 결과값으로 저장 해준다.
        여기서 -1를 시켜주는 이유는 제일 긴 변의 길이가 나머지 두 변의 길이의 합보다 적어도 1 적어야
        해당 삼각형의 둘레를 최대한으로 맞출 수 있기 때문이다. (두 변의 길이는 나머지 제일 긴 변의 길이보다 길어야한다는 조건 하에 보자면)

        음... 아래에서 또 설명 하면 중복 설명이라 아래에서는 안하겠지만

        일단 조건상에 길이를 마음대로 조절 할 수 있다고 쓰여있지만 내가 작성한 조건들대로 코드를 정리하면
        기본적인 삼각형의 완성 조건은 갖춰진다.
        (물론 1 100 1 처럼 100을 안건드리고 나머지를 49 50할 수 있지 않나? 라고도 생각 할 수는 있겠지만
         일단 주어진 입력에 대한 결과에 맞춰서 조건을 구성 해야 하므로 그냥 위와 같이 조건을 맞추어 주었다.)
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] apex = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < apex.length; i++) {
                apex[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(apex);
            if (apex[0] == apex[1] && apex[0] == apex[2]){
//          세 변의 길이 전부 같은 경우
                System.out.println(apex[0] + apex[1] + apex[2]);
            }else if(apex[0] == apex[1] && (apex[0] + apex[1]) < apex[2]) {
//           작은 두 변의 길이가 같고 그의 합이 제일 긴 변의 길이보다 작을 때
                apex[2] = apex[0];
                System.out.println(apex[0] + apex[1] + apex[2]);
            } else if (apex[0] != apex[1] && apex[0] != apex[2] && apex[1] != apex[2]) {
//           세 변의 길이가 모두 다르고
                if ((apex[0] + apex[1]) == apex[2]){
//              작은 두 변의 길이의 합이 나머지 긴 변의 길이와 같은 경우와
                    apex[2] -= 1;
                    System.out.println(apex[0] + apex[1] + apex[2]);
                }else if ((apex[0] + apex[1] < apex[2])){
//              작은 두 변의 길이의 합이 나머지 긴 변의 길이보다 작은 경우.
                    apex[2] = (apex[0] + apex[1]) - 1 ;
                    System.out.println(apex[0] + apex[1] + apex[2]);
                }else{
//              그것도 아니고 세 숫자가 다르고 작은 두 변의 길이의 합이 나머지 한 변의 길이보다 큰 경우 있는 그대로 합산 출력.
                    System.out.println(apex[0] + apex[1] + apex[2]);
                }
            }
    }
}



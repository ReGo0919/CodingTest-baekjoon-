import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BackJoon5073_20230527 {

    public static void main(String[] args) throws IOException, IOException {
        /* 이 문제는 10101 문제와 거의 같다고 보면 된다. 즉
        세 변의 길이가 같은 경우와 두 변의 길이만 같은 경우, 다 다른 경우 이렇게 세 가지의 경우만 작성 해주면 된다.*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] apex = new int[3];
//      일단 여기까지는 sum을 제외한 10101문제와 다를 것이 없다.
        int count = 0;
//      천 줄 까지 입력을 해야하니까 while문에서 count가 1000이 될때까지 누적을 시켜줄 count를 초기화 선언.
        while(count < 1000) {
//      count가 1000번이 될 때 까지 실행하는 동안
            StringTokenizer st = new StringTokenizer(br.readLine());
//          사용자로부터 입력값을 받고 토큰으로 변환 후
            for (int i = 0; i < apex.length; i++) {
//          for문을 돌려 배열에 차곡차곡 그 토큰 값들을 저장.
                apex[i] = Integer.parseInt(st.nextToken());
            }
//
            Arrays.sort(apex);
/*          배열을 오름차순 시켜준다. 그 이유는 출력 조건 중에 가장 긴 변의 길이보다 나머지 두 변의 길이가 긴 경우
            삼각형의 조건에 부합하지 못하므로 Invalid를 출력 시키기 위해서다.*/
            if (apex[0] !=0 && apex[1] !=0 &&apex[2] !=0) {
/*          그리고 첫번째 if문의 조건으로 세 꼭지점(배열의 값들) 이 전부 0이 아닌 경우로 잡아야 한다.
            이 작업을 먼저 하지 않고 나머지 작업을 해버리면 자칫 세 숫자중 두 숫자가 0 이거나, 세 숫자 모두 0일 경우
            해당되는 if문의 조건에 따라 동일한 문구가 출력 될 수 있기 때문이다.*/
                if ( apex[0] == apex[1] && apex[1] == apex[2])
//              그리하여 첫번째 if문을 충족 한 후 다시 if문을 작성해 세 변의 길이가 모두 같은 경우
                    System.out.println("Equilateral");
//                  해당 출력 문구
                else if (apex[0] == apex[1] || apex[0] == apex[2] || apex[1] == apex[2])
//              다시 두 변만 길이가 같은 경우
                    System.out.println("Isosceles");
//                  해당 문구 출력
                else if (apex[0] != apex[1] && apex[0] != apex[2] && apex[1] != apex[2]){
/*              세번째 조건은 셋 다 다른 경우이다. 근데 여기서도 위에서 말했던 것과 같이
                가장 긴 변의 길이가 나머지 두 변의 길이의 합보다 짧을 경우의 조건도 처리를 해주어야 하기 때문에
                그 바로 아래에 if문을 작성 해주고 해당 조건을 기입 해준다.*/
                    if (apex[0] + apex[1] <= apex[2]) System.out.println("Invalid");
//                  만약 가장 긴 변의 길이보다 나머지 두 변의 합의 길이가 더 길 경우 "Invalid 출력
                    else System.out.println("Scalene");
//                  그렇지 않고, 즉 가장 긴 변의 길이가 나머지 두 변의 길이의 합보다도 큰 경우 Scalene으로 정상 문구 출력
                }
                count++;
//              하고 바로 count를 누적 증가시키고 다시 while문으로 돌아가게 한다.
            }else if((apex[0] ==0 && apex[1] == 0 &&apex[2] ==0)) {
//          그리고 사용자가 입력한 값이 모두 0 0 0 일경우 break를 걸어 while문을 종료.
                break;
            }
        }
    }
}



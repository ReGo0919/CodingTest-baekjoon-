import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon2480_20230506 {

        public static void main(String[] args) throws IOException {
        /*
         일단 나는 조건문을 좀 연습해야겠지만 그래도 아는 선에서 조건문을 활용 해보았다.
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int dice1 = Integer.parseInt(st.nextToken());
        int dice2 = Integer.parseInt(st.nextToken());
        int dice3 = Integer.parseInt(st.nextToken());
//      주사위를 세 번 던져 나오는 경우의 수, dice1, 2 3 생성
        int prize = 0;
//      상금을 저장할 변수 생성
        if ((dice1 == dice2) && (dice2 == dice3)){
//      우선 주사위가 모두 같은 경우의 상금 값을 계산한다.
            prize = 10000+dice1*1000;

        } else if (dice1 == dice2 && dice1 != dice3) prize = 1000+dice1*100;
          else if (dice2 == dice3 && dice2 != dice1) prize = 1000+dice2*100;
          else if (dice3 == dice1 && dice3 != dice2) prize = 1000+dice3*100;
/*        두번째는 3개의 주사위 중 2개가 같은 경우인데 dice1과 dice2가 같을때,
          dice1과 dice3이 같을 때 dice2와 dice3이 같을때로 정리 할 수 있어서 다음과 같이 식을 짜주었다.
*/
        else{
/*      위의 조건들에도 맞지 않는다면 주사위는 전부 같거나, 일부가 같은 경우를 제외한 모두 다른 경우이기에
        깔끔하게 else를 써주고, 거기서 또 주사위 중 높은 주사위를 기준으로 prize를 매겨주는 if문을 작성 해준다.
*/
            if (dice1>dice2 && dice1>dice3){
                prize = dice1*100;
            // dice1이 가장 높다면 그 수에 * 100
            } else if (dice2>dice1 && dice2>dice3) prize = dice2*100;
              else if (dice3>dice1 && dice3>dice2) prize = dice3*100;
            // 마찬가지로 dice2, 혹은 dice3이 가장 높다면 각각 그 수에 * 100 후 prize에 저장 후 print로 출력
        }
        System.out.println(prize);
    }

}

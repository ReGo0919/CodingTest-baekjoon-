import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon5622_20230515 {

    public static void main(String[] args) throws IOException, IOException {
    /* 이 문제를 전에 풀었던 (10809) 방법으로 응용을 해보려고 했는데 별짓을 해도 안되어서 다른 블로그 글을 참고 해보았는데
    switch 문으로 손쉽게 처리가 가능해서 나도 switch 문을 활용 하기로 했다.
     */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
//      일단 사용자에게 값을 입력 받는다.
        int add = 0;
//      누저값을 저장할 add 변수 초기화

        for(int i = 0 ; i < str.length() ; i++){
//      for문이 사용자에게 입력받은 문자열의 길이만큼 반복 되는 동안
            switch (str.charAt(i)){
/*              switch문을 사용해 문자열의 첫번째 문자(i=0번째)를 꺼내어 해당 case문으로 찾아간다.
                만약 사용자가 APPLE이라고 입력을 하였다면 첫번째 인덱스의 문자인 A에 해당하는 case문으로 이동하여
                add에 3이라는 값이 누적 된 후 break로 switch문을 종료시킨 후 for문 루프를 돌아 다음 i(A다음 P)의 값으로
                P에 맞는 case문으로 가서 누적 시켜주는 작업을 str.length만큼 반복을 해준다. */
                case 'A' : case 'B' : case 'C':
                    add+=3;
                    break;
                case 'D' : case 'E' : case 'F':
                    add+=4;
                    break;
                case 'G' : case 'H' : case 'I':
                    add+=5;
                    break;
                case 'J' : case 'K' : case 'L':
                    add+=6;
                    break;
                case 'M' : case 'N' : case 'O':
                    add+=7;
                    break;
                case 'P' : case 'Q' : case 'R': case 'S':
                    add+=8;
                    break;
                case 'T' : case 'U' : case 'V':
                    add+=9;
                    break;
                case 'W' : case 'X' : case 'Y': case 'Z':
                    add+=10;
                    break;
            }
        }
//      반복이 끝났으면 누적 작업을 맞춘 add를 출력.
        System.out.println(add);
//  아래는 원래 뻘짓. 코드가 너무 복잡해졌다.
    /*
    int add = 0;
    char[] UserInput = new char[str.length()];
    char[] Alphabet = new char[27];

        for (int i = 0 ; i < str.length() ; i++){
            UserInput[i] = str.charAt(i);
        }
        for (int i = 0 ; i < 26 ; i++){
            Alphabet[i] = (char)(i+65);
        }
    int[] dialNum = new int[27];
        for (int i = 0 ; i < 27 ; i++){
            if (i==0){
                dialNum[i] = 1;
            }else if(i>=1 && i<4){
                dialNum[i] = 2;
            }
            else if(i>=4 && i<7){
                dialNum[i] = 3;
            }
            else if(i>=7 && i<10){
                dialNum[i] = 4;
            }
            else if(i>=10 && i<13){
                dialNum[i] = 5;
            }
            else if(i>=13 && i<16){
                dialNum[i] = 6;
            }else if(i>=16 && i<20){
                dialNum[i] = 7;
            }else if(i>=20 && i<23){
                dialNum[i] = 8;
            }else if(i>=23 && i<=27){
                dialNum[i] = 9;
            }System.out.print(dialNum[i]);
        }
        for (int i = 0 ; i <str.length() ; i++){
            for(int j = 0 ; j < 26 ; j++){
                if (UserInput[i] == Alphabet[i]){
                    add += dialNum[j];
                }
            }
        }
        System.out.println(add);
        */
    }
}




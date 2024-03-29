package chap_13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// 문제 : 속담 퀴즈 프로그램을 작성하시오.
// 조건1. 퀴즈 내용은 saying.txt 라는 이름의 파일로 제공
// 조건2. 퀴즈는 문제와 정답이 각각 한 줄로 구성
// 조건3. 사용자로부터 값을 입력받아 정답여부 확인
// 조건4. 오답인 경우 정답 안내
// 조건5. 퀴즈 내용이 더 이상 없을 때까지 반복
public class _Quiz_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (BufferedReader br = new BufferedReader(new FileReader("src/chap_13/saying.txt"))) {
            System.out.println("속담 퀴즈입니다. 빈 칸에 알맞은 말을 입력하시오. (주관식)");
            System.out.println("-----------------------------------------------");

            String quiz; // 문제
            String answer; // 정답
            String input; // 사용자 입력
            while(true) {
                quiz = br.readLine();
                answer = br.readLine();
                if (quiz == null || answer == null) {
                    break;
                }

                System.out.println("(문제) " + quiz);
                System.out.print(" 정답 입력 => ");
                input = sc.next();
                if(input.equals(answer)) {
                    System.out.println("정답입니다!!!\n");
                } else {
                    System.out.println("틀렸습니다. 정답은 " + answer + "입니다.\n");
                }
            }

            System.out.println("-----------------------------------------------");
            System.out.println("모든 퀴즈가 완료되었습니다.");
            System.out.println("수고하셨습니다. ^^");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

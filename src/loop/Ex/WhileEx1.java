package loop.Ex;
//처음 10갸의 자연수를 출력하는 프로그램을 작성해 보세요. 이때, count라는 변수를 사용해야 합니다. While문, for문 2가지 버전의 정답을 만들어야 합니다.
public class WhileEx1 {
    public static void main(String[] args) {
        int count  = 0;

        while(count < 10) {
            count++;
            System.out.println(count);
        }
    }
}

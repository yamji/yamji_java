package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 10;
        while (i < 3) {
            System.out.println("현재 숫자는:" + i);
            i++;
        }
    }
}
//i는 10이기 때문에 while (i < 3) 조건식은 거짓이 된다. 따라서 아무것도 출력되지 않는다.
package cond.Ex;

public class Ex7 {
    public static void main(String[] args) {
        int x = 2;
        String result = ( x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + result);
    }
}

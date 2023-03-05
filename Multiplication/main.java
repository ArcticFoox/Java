package Multiplication;

import java.util.Scanner;

public class main {

    public static long recursion(long a, long b, long c){
        if(b == 1) return a % c;
        long value = recursion(a, b/2, c);
        value = value * value % c;
        if(b % 2 == 0) return value;
        return value * a % c;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.print(recursion(a, b, c));
    }
}

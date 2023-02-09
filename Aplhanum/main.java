package Aplhanum;

import java.util.Scanner;

public class main {
    public static void main(String args[]){
        int[] array = new int[26];
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        for(int i = 0; i < input.length(); i++){
            array[input.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}

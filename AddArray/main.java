package AddArray;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int[] arr = new int[n + m];

        String[] arrA = br.readLine().split(" "); // 첫번째 배열 읽기

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrA[i]); // 첫번째 배열 집어 넣기
        }

        String[] arrB = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            arr[i + n] = Integer.parseInt(arrB[i]); // 두번째 배열 집어넣기
        }

        Arrays.sort(arr);// 정렬

        // bufferedWriter 사용하기
        for (int r : arr) {
            bw.write(String.valueOf(r) + " ");
        }

        bw.flush();
        bw.close();

//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int[] array1 = new int[a];
//        int[] array2 = new int[b];
//        int[] answer = new int[a + b];
//
//        for(int i = 0; i < a; i++){
//            array1[i] = sc.nextInt();
//        }
//
//        for(int i = 0; i < b; i++){
//            array2[i] = sc.nextInt();
//        }
//
//        int idx1 = 0;
//        int idx2 = 0;
//        for(int i = 0; i < a + b; i++){
//            if(idx1 == a){
//                answer[i] = array2[idx2++];
//            }
//            else if(idx2 == b){
//                answer[i] = array1[idx1++];
//            }
//            else if(array1[idx1] <= array2[idx2]){
//                answer[i] = array1[idx1++];
//            }
//            else{
//                answer[i] = array2[idx2++];
//            }
//        }
//        for(int i = 0; i < a+b; i++) {
//            System.out.print(answer + " ");
//        }
//        sc.close();

    }
}

package AC;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = Integer.parseInt(sc.next());

        for(int i=0; i<T; i++) {
            String p = sc.next();
            int n = Integer.parseInt(sc.next());
            String X = sc.next();
            X = X.replace("[", ",").replace("]", ",");
            String[] arrX = X.split(",");

            Deque dq = new ArrayDeque();
            // arr[0]은 제외
            for(int j=1; j<arrX.length; j++) {
                dq.addLast(Integer.parseInt(arrX[j]));
            }

            // 초기 상태에서 뒤집어진 상태여부
            boolean isReverse = false;
            boolean isError = false;
            for(int j = 0; j < p.length(); j++){
                if(p.charAt(j) == 'R'){
                    isReverse = !isReverse;
                    continue;
                }
                else{
                    if(dq.isEmpty()){
                        System.out.print("error");
                        isError = true;
                    }

                    if(isReverse){
                        dq.removeLast();
                    }
                    else{
                        dq.removeFirst();
                    }
                }
            }

            if(isError) {
                System.out.print("[");
                if(isReverse) {
                    while(!dq.isEmpty()) {
                        System.out.print(dq.removeLast());
                        // 다음원소가 존재한다면 콤마(,) 출력
                        if(!dq.isEmpty()) {
                            System.out.print(",");
                        }
                    }
                }else { // 앞에서(front) 부터 출력하겠다.
                    while(!dq.isEmpty()) {
                        System.out.print(dq.removeFirst());
                        // 다음원소가 존재한다면 콤마(,) 출력
                        if(!dq.isEmpty()) {
                            System.out.print(",");
                        }
                    }
                }
                // 다음 Test case를 위해 개행문자 포함!
                System.out.println("]");
            }
        }
        return;
    }
}

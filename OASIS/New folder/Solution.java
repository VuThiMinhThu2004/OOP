import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;

public class Solution {
    public static void main ( String[] args){
        Scanner sc = new Scanner (System.in);
        int q = sc.nextInt();
        Queue <Integer> queue = new ArrayDeque<>();
        for ( int i = 0 ; i < q ; i ++){
            int x = sc.nextInt();
            if ( x == 1){
                int a = sc.nextInt();
                queue.add(a);
            }
            else if ( x == 2){
                queue.poll();
            }
            else if ( x == 3){
                int b = queue.peek();
                System.out.println (b);
            }
        }
    }
}
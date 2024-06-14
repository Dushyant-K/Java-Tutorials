import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void removeNthNodeFromEnd(Node head, int n, int idx){
        if(idx==n){
            list.get(idx)
        }
        removeNthNodeFromEnd(list, n, idx+1);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();
        for(int i=1;i<=5;i++){
            list.add(i);
        }
        System.out.println(list);

        //Find the nth node from end and delete that node
        int n= sc.nextInt();
        removeNthNodeFromEnd(list.get(0),list.size()-n+1,0);
    }
}
import java.util.*;

public class displayQueue {

    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Queue<Integer> a=new LinkedList<>();
        //rear  1 2 3 4 5//front
        while(q.size()>0){
            System.out.print(q.peek()+" ");
            a.add(q.poll());
        }

        while (a.size()>0) {
            q.add(a.poll());

            
        }

            
            
        }
        

    }
    


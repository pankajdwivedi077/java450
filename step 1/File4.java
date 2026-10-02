import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class File4 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        System.out.println(list.lastIndexOf(20));

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.addFirst(22);
        ll.addLast(33);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        Stack<Integer> st = new Stack<>();
        st.add(10);
        st.add(20);
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.push(22);
        System.out.println(st.isEmpty());
      
    }
}

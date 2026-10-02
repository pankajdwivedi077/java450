import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class File3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        Collection<Integer> arr3 = new ArrayList<>();

        arr.add(10);
        arr.add(20);

        arr2.add(30);
        arr2.add(50);

        arr.addAll(arr2);
        
        System.out.println(arr);

        arr.removeAll(arr2);

        System.out.println(arr);

        System.out.println(arr.size());

        arr2.clear();

        Iterator<Integer> it = arr.iterator();

        while(it.hasNext()){
            System.out.println("ele " + it.next());
        }

        System.out.println(arr.get(1));
        
        arr.set(1, 80);

        arr2.add(40);
        arr2.add(100);

        Object[] ar = arr2.toArray();
        for(Object obj: ar){
            System.out.println(obj);
        }

        Collections.sort(arr);

        ArrayList<Integer> newList = (ArrayList<Integer>) arr.clone();

        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(10);
        System.out.println(marks.isEmpty());

    }
}

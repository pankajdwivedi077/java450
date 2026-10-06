import java.util.Arrays;
import java.util.Comparator;

class ReverseComp implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
       return Integer.compare(o1, o2);
    }

}

public class File10 {
    public static void main(String[] args) {

        int[] arr = {5,1,7};
        Arrays.sort(arr);
        for(int a: arr){
            System.out.println(a);
        }
        Integer [] ar = {5,1,7};
        Arrays.sort(ar, new ReverseComp());
          for(int a: ar){
            System.out.println(a);
        }
    }
}

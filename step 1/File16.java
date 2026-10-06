public class File16 {
    public static void main(String[] args) {
        int [] arr = {10,24,17,24,10,13,17};
         int result = 0;
        for (int num : arr) {
            result ^= num;
        }

        System.out.println(result);

    }
}
// find unique elements (all other appear twice)
public class File15 {
    public static void main(String[] args) {
        int a = 5, b = 6;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("values: "+ a );
        System.out.println("values: "+ b );
    }
}
// swap two number using xor
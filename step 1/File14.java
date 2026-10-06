public class File14 {
    public static void main(String[] args) {
        int n = 8;
        // int count = 0;
        // while(n!=0){
        //     if((n&1)!=0){
        //         count++;
        //     }
        //     n = n >> 1;
        // }
        // System.out.println(count);
        if((n&(n-1))==0){
            System.out.println("power of 2");
        }else{
            System.out.println("not");
        }
    }
}
// power of 2
public class File2 {

    static void printDigitOfNumber(int n){
        while(n!=0){
          int lg = n%10;
          System.out.println(lg);  
          n = n/10;
        }
    }

    static int countNumberOfDigit(int n){
        int count =0;
        while(n!=0){
          count++;  
          n = n/10;
        }
        return  count;
    }

    static int sumOfDigit(int n){
        int sum =0;
        while(n!=0){
          int lg = n%10;
          sum += lg;
          n = n/10;
        }
        return  sum;
    }

    static int reverseNumber(int n){
        int rev =0;
        while(n!=0){
          int lg = n%10;
          rev = rev*10 +lg;
          n = n/10;
        }
        return  rev;
    }

    static boolean palindromeNumber(int n){
       int ori = n;
       int rev = 0;
       while(n != 0){
        int lg = n%10;
        rev = rev*10 + lg;
        n = n/10;
       }
       if(ori == rev) return true;
       return false;
    }

    static boolean isPrime(int n){
      for(int i=2; i*i<=n; i++){
        if(n%i == 0) return false;
      }
      return true;
    }

    static int gcd(int a, int b){
      while(b !=0){
        int temp = b;
        b = a%b;
        a = temp;
      }
      int ans = a;
      return ans;
    }

    static int lcm(int a, int b){
      int gcd = gcd(a, b);
      int prod = a*b;
      int lcm = prod/gcd;
      return lcm;
    }

    static boolean isArmStrong(int n){
      int sum = 0;
      int ori = n;
      while(n != 0){
        int lg = n %10;
        int cube = lg*lg*lg;
        sum = sum + cube;
        n = n/10;
      }
      if(ori == sum) return true;
      return false;
    }

    static boolean isPerfect(int n){
      int ori = n;
      int sum =1;
      for(int i=2; i*i<=n; i++){
        if(n%i==0){
          int firstF = i;
          int secondF = n/i;
          sum = sum + firstF + secondF;
        }
      }
      if(sum == ori)return  true;
      return false;
    }

    static void printAllPrime(int n){
       for(int i=2; i<=n; i++){
        boolean isPrime = isPrime(i);
        if(isPrime == true){
          System.out.println(true);
        }
       }
    }

    public static void main(String[] args) {

        // printDigitOfNumber(123);
       
        // int ans = countNumberOfDigit(123);
        // System.out.println(ans);

        // int ans = sumOfDigit(123);
        // System.out.println(ans);

        // int ans = reverseNumber(123);
        // System.out.println(ans);

        // boolean ans = palindromeNumber(121);
        // System.out.println(ans);

        // boolean ans = isPrime(5);
        // System.out.println(ans);

        // int ans = gcd(48,18);
        // System.out.println(ans);

        // int ans = lcm(4,10);
        // System.out.println(ans);

        // boolean ans = isArmStrong(153);
        // System.out.println(ans);

        // boolean ans = isPerfect(6);
        // System.out.println(ans);

        printAllPrime(7);

    }
}
// Maths
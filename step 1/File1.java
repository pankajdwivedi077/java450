public class File1 {

    static void print1(int n){
        for(int i=1; i<=n; i++){
          for(int j=1; j<=n; j++){
            System.out.print("* ");
          }
          System.out.println();
        }
    }

    static void print2(int n){
        for(int i=1; i<=n; i++){
          for(int j=1; j<=5; j++){
            System.out.print("* ");
          }
          System.out.println();
        }
    }

    static void print3(int n){
        for(int i=1; i<=n; i++){
          for(int j=1; j<=i; j++){
            System.out.print("* ");
          }
          System.out.println();
        }
    }

    static void print4(int n){
        for(int i=1; i<=n; i++){
          for(int j=1; j<=n-i; j++){
            System.out.print(" ");
          }
          for(int j=1; j<=n; j++){
            System.out.print("* ");
          }
          System.out.println();
        }
    }

    static void print5(int n){
        for(int i=1; i<=n; i++){
          for(int j=1; j<=n-i+1; j++){
            System.out.print("* ");
          }
          System.out.println();
        }
    }
    static void print6(int n){
        for(int i=1; i<=n; i++){
          for(int j=1; j<=n-i; j++){
            System.out.print(" ");
          }
          for(int j=1; j<=2*i-1; j++){
            System.out.print("* ");
          }
          System.out.println();
        }
    }
    static void print7(int n){
        for(int i=1; i<=n; i++){
          for(int j=1; j<=i-1; j++){
            System.out.print(" ");
          }
          for(int j=1; j<=2*n-2*i+1; j++){
            System.out.print("* ");
          }
          System.out.println();
        }
    }
    static void print8(int n){
        for(int i=1; i<=n; i++){
         for(int j=1; j<=n; j++){
            if(i==1 || i==n){
                System.out.print("* ");
            }else if(j == 1){
              System.out.print("*");
            }
         } 
         System.out.println();
        }
    }
    static void print9(int n){
        for(int i=1; i<=n; i++){
          
        }
    }
    static void print10(int n){
        for(int i=1; i<=n; i++){
          for(int j=1; j<=n-i; j++){
            System.out.print(" ");
          }
          if(i==1 || i==n){
            for(int j=1; j<=i*2-1; j++){
                System.out.print("* ");
            }
          }else{
            System.out.print("* ");
            for(int j=1; j<=2*i-3; j++){
                System.out.print(" ");
            }
            System.out.print("* ");
          }
          System.out.println();
        }
    }
    static void print11(int n){
        for(int i=1; i<=n; i++){
          for(int j=1; j<=n-i; j++){
            System.out.print(" ");
          }
          for(int j=1; j<=i*2-1; j++){
            System.out.print("* ");
          }
          System.out.println();
        }
        for(int i=1; i<=n; i++){
            if(i==1){
                continue;
            }
            for(int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*n*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void print12(int n){
        for(int i=1; i<=n; i++){
          for(int j=1; j<=n-i; j++){
            System.out.print(" ");
          }
          for(int j=1; j<=n; j++){
            System.out.print("* ");
          }
          System.out.println();
        }
    }
    static void print13(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
             for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
        }
    }
    static void print14(int n){
         
        for(int row=1; row<=n; row++){
          for(int col=1; col<=row; col++){
            System.out.print(col);
          }
          System.out.println();
        }
    }
    static void print15(int n){
        int count = 1;
        for(int i=1; i<=n; i++){
            
            for(int j=1; j<=i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
    static void print16(int n){
      for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            int a = j;
            int b = ('A'-1);
            int ans = a+b;
            char findAns = (char) ans;
            System.out.print(findAns+ " ");
        }
        System.out.println();
      }
    }
    static void print17(int n){
      for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            int a = n-j;
            int b = 'A';
            int ans = a+b;
            char findAns = (char) ans;
            System.out.print(findAns+ " ");
        }
        System.out.println();
      }
    }
    static void print18(int n){
      for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print(j + " ");
        }
        for(int j=1; j<=i-1; j++){
            System.out.print(j+ " ");
        }
        System.out.println();
      }
    }
    static void print19(int n){
      for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=2*i-1; j++){
            System.out.print(i + " ");
        }
        System.out.println();
      }
    }
    static void print20(int n){
       for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
           int a = j;
           int  b = 'A' -1;
           int ans = a+b;
           char findAns = (char) ans;
           System.out.println(findAns + " ");
        }
        char toPrint = (char)(i+'A'-2);
        for(int j=1;j<=i-1; j++){
            System.out.print(toPrint + " ");
        }
        System.out.println();
      }
    }

    public static void main(String[] args){
      
    //    print1(4);

    //    print2(3);

    // print3(5);

    // print4(5);

    //  print5(5);

    //  print6(5);

    //  print7(4);

    //  print8(4);

    //  print9(5);

    //  print10(5);

    //  print11(4);

    //  print12(4);

    //  print13(4);

    //  print14(5);

    //  print15(5);

    //  print16(5);

    //  print17(5);

     print18(4);

     print19(4);

     print20(4);


    }
} // pattern printing
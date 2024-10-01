import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int k =0;
    while(true) {
        System.out.println("type a number");
        int a=input.nextInt();
        k+=a;
        if (a==0) {
            System.out.println("The sum is "+k);
            break;
        }
    }
    
    
  }
}

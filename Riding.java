import java.util.Scanner;

public class Riding {
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int t=sc.nextInt();
     for (int i = 0; i < t; i++) {
        int x=sc.nextInt();
        int h=sc.nextInt();
        if (x<h){
            System.out.println("No");
        }
        else if (x>=h) {
          System.out.println("Yes");  
        }
        else if (x>h) {
            System.out.println("Yes");
        }else{
            System.out.println("No"
        );
        }
        

     }
}
    
}

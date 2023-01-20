import java.util.*;

public class input {
    
    public static void main(String args[]) {
        
        // following is an scanner object to take input

       Scanner sc = new Scanner(System.in);
       
    //    nextInt is used to take input of integer type

       int a = sc.nextInt();
       int b = sc.nextInt();
       int sum = a + b;

       System.out.println(sum);

    //    nextLine is used to take input of string type wich can include many space separated words
    
       String omg = sc.nextLine();

       System.out.println(omg);

    // next is used to take input of a single word it excludes the content after space

       String name = sc.next();

       System.out.println(name);
    }
}

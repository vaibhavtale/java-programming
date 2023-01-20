import java.util.*;

public class conditional_statement {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age > 18){

            System.out.println("You are an adult");
        }
        else{

            System.out.println("Teenager you are now");
        }
    }
}

import java.util.*;

public class p9_taking_input_program{
    Scanner  obj = new Scanner(System.in);
    int add(){
        System.out.print("Enter first number : ");
        int a = obj.nextInt();
        System.out.print("Enter second number : ");
        int b = obj.nextInt();
        return (a+b);
    }
    public static void main(String  args[]){
        p9_taking_input_program obj = new p9_taking_input_program();
        System.out.println("addition is "+ obj.add());
    }

}

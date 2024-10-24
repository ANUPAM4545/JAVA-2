import java.util.Scanner;;
public class ErrorSolve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String num = sc.nextLine(); // \n
        
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println(num+name+" , ");
        System.out.println(num);
    }
}
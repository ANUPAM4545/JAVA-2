import java.util.*;

public class Studentinventory {
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner(System.in);
    System.out.println("enter number of students :");
    int n=sc.nextInt();
    String names[]=new String[n];{
        sc.nextLine();
    for(int i=0;i<n;i++){
        System.out.println("enter name of student" + (i+1));
        names[i]=sc.nextLine();
    }
    System.out.println(Arrays.toString(names));
}
}
}


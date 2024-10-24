
    import college.Book;
import college.Student;
import college.Mentor;
public class PST {
    public static void main(String[] args) {
        Book book=new Book("testing",100);
        Student std1=new Student("manish", 20, 1);
        Mentor m1=new Mentor("Priyanshu", 30, 1);
        System.out.println(book.name+":"+book.price);
        System.out.println(std1.name+":"+std1.age+":"+std1.rollno);
        System.out.println(m1.name+":"+m1.age+":"+m1.empid);
    }
}


/**
 * InnerInheritencePractice
 */
class parent {
String property="5cr";
    
}
class child extends parent{
    String childproperty=property;
}


    



public class InheritencePractice {
    public static void main(String[] args) {
        child cd=new child();
        System.out.println(cd.childproperty);
        System.out.println(cd.property);
    }
}

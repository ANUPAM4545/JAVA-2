

class capsule{
     int medprice=10;
    private int profit=20;
    private int sellprice=medprice+profit;

    public void getprice(){
        System.out.println(sellprice);
    }
}


public class EncapsulatioPractice {
    int checkStatic=5;
    public static void main(String[] args) {
        capsule obj=new capsule();
        obj.getprice();
System.out.println(obj.medprice);

    }
}

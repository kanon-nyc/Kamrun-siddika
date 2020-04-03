package javapractice;

public class A {
    String msg = "Try to access default variable outside the package";


    public static void main(String[]args){
        A a =new A ();
        System.out.println(a.msg);
    }
}

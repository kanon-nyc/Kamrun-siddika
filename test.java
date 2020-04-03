public class test {
    public static void main (String [] args){
        int a =10;
        int b =20;
        System.out.println (a+b);
        String x = "Hello";
        String y="world";
        System.out.println(x+y);
        double c=11.22;
        double d=12.33;
        System.out.println(c+d);
        System.out.println(x+y+a+b);
        System.out.println(x+y+c+d);
        System.out.println(a+b+x+y+a+x+b+y);
        System.out.println(a+b+x+y+a+b);
        System.out.println("the addition of a and b is"+(a+b));
        //different comperison
        int e=100;
        int f=200;
        if (f>e) {
            System.out.println("f is greater than e");
        }
        else {
            System.out.println("e is greater than f");
        }

    }
}

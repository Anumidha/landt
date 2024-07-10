package functions;

public class Main {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;
      //  Main m = new Main();
        sum(a,b);
        Main j = new Main();

        System.out.println(j.sub(20,10));
        System.out.println(div(a,b));
        System.out.println(square(a));
        System.out.println(anu(20f,30f,40f));
        double  e = 10.3;
        double f = 5.6;
        double g = 9.4;
        double h = 7.4;

        System.out.println(abi(e,f,g,h));
        //System.out.println(abi(10.3,5.6,9.4,7.4));
    }

     static void sum(int anu,int abi)
    {

        System.out.println(anu+abi);
    }
     public int sub(int anu,int abi)
    {

       return anu-abi;
    }

     static double div(int a,int b)
    {
        return a/b;
    }
    static int square(int a)
    {
        return a*a;
    }
    static float anu(float a,float b,float c)
    {
        return a+b+c;
    }
    static double abi(double a, double b, double c, double d)
    {
        return a*b*c*d;
    }
}

package home_work;

public class Main
{
    public static void main(String[] args) {
       Animal a = new Animal();
       Birds b = new Birds();
       Reptile c = new Reptile();
       a.animal();
       b.bird();
       c.reptile();

    }

}
class Animal{
int a = 2;
    public void animal()
    {
        System.out.println("Animal");
    }


}
class Birds{
    public void bird()
    {

        System.out.println("birds");
    }
}
class Reptile{
    public void reptile()
    {

        System.out.println("reptile");
    }
}
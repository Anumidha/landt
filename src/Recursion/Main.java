package Recursion;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Exception;

//
//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {1,2,36,4};
//
//        System.out.println(sortarray(arr,0));
//    }
//
//    static boolean sortarray(int[] arr,int index)
//    {
//        if(index == arr.length - 1)
//        {
//            return true;
//        }
//
//        return arr[index] < arr[index+1] && sortarray(arr,index+1);
//
//    }
//}
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int currentyear = sc.nextInt();
//        sc.nextLine();
//        ArrayList<Movie> movie = new ArrayList<>();
//        for(int i=1;i<=3;i++)
//        {
//            String title = sc.nextLine();
//            String dir = sc.nextLine();
//            int reyear = sc.nextInt();
//            sc.nextLine();
//
//            movie.add(new Movie(title,dir,reyear));
//        }
////        Movie a = new Movie(currentyear);
//        System.out.println("Movie Infomation:");
//        for(Movie abi : movie)
//        {
//           abi.dis(currentyear);
//            System.out.println();
//
//        }
//
//    }
//
//
//}
//class Movie{
//    String title ;
//    String dir;
//    int reyear;
//
//    int currentyear;
//
//    Movie(String title,String dir,int reyear){
//        this.title=title;
//        this.dir=dir;
//        this.reyear=reyear;
//    }
//
//
//
//    public void dis(int currentyear)
//    {
//        System.out.println("Title" + title);
//        System.out.println(dir);
//        System.out.println(reyear);
//        System.out.println(currentyear-reyear);
//    }
//
//}



//class Main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        try{
//            int a = sc.nextInt();
//
//            if(a>0)
//            {
//                System.out.println("valid");
//            }
//            else{
//                throw new NumberFormatException("not valid");
//            }
//        }
//        catch (NumberFormatException  e)
//        {
//            System.out.println(e);
//        }
//
//    }
//}
//

class Main{
    public static void main(String[] args) {

    }
}

abstract class Emp{
    abstract public void detaildis();
}

//public class Fulltimeemp extends Emp{
//
//
//
//}
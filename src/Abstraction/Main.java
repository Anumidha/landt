package Abstraction;
//
import java.util.*;

////
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        String name=sc.nextLine();
////        int id= sc.nextInt();
////        double salary = sc.nextDouble();
////        sc.nextLine();
////        String jobtitle = sc.nextLine();
////        sc.nextLine();
////
////        Emp a = new Full(name,id,salary,jobtitle);
////        a.detailsdis();
////    }
////}
////
////abstract class Emp
////{
////
////    abstract void detailsdis();
////}
////
////class Full extends Emp
////{
////    String name;
////    int id;
////    double salary;
////    String jobtitle;
////  Full(String name,int id,double salary,String jobtitle)
////  {
////      this.name=name;
////      this.id=id;
////      this.salary=salary;
////      this.jobtitle=jobtitle;
////  }
////
////    @Override
////    void detailsdis() {
////        System.out.println("Full-Time Employee Details:");
////        System.out.println("Name:"+name);
////        System.out.println("Employee ID : "+id);
////        System.out.println("Salary:"+salary);
////        System.out.println("Job Title: "+jobtitle);
////
////    }
////}
//////Full-Time Employee Details:
//////Name: John
//////Employee ID: 100
//////Salary: $60000.0
//////Job Title: Software Engineer
//
//class Main{
//        static int ts = 20; // global variable
//        public static void main(String[] args)
//        {
//            Scanner sc = new Scanner(System.in);
//
//        boolean[] bus = new boolean[ts];
//
//        while (true)
//        {
//           int choice1 = sc.nextInt();
//           int seatbook = 0;
//           if(choice1 != 4)
//           {
//               switch (choice1)
//               {
//                   case 1:
//                       seatbook  = sc.nextInt();
//                       if(seatbook<1 && seatbook>20)
//                       {
//                           System.out.println("invalid");
//                       }
//                       else if (!bus[seatbook-1])
//                       {
//                           bus[seatbook-1] = true;
//                       }
//                       else
//                       {
//                           System.out.println("booked");
//                       }
//                       break;
//                   case 2:
//                       seatbook = sc.nextInt();
//                       if(seatbook<1 && seatbook>20)
//                       {
//                           System.out.println("invalid");
//                       }
//                       else if (bus[seatbook-1])
//                       {
//                           bus[seatbook-1] = false;
//                       }
//                       else {
//                           System.out.println("no booking to cancle");
//                       }
//                       break;
//                   case 3:
//                       for(int i=0;i<ts;i++)
//                       {
//                           if(bus[i] == false)
//                           {
//                               System.out.print((i+1)+" ");
//                           }
//                       }
//                       break;
//                   default:
//                       System.out.println("invalid");
//                       break;
//               }
//           }
//           else {
//               break;
//           }
//        }
//    }
//}
class Pro implements Comparable<Pro>
{
    int id;
    String name;

    Pro(int id,String name)
    {
        this.id = id;
        this.name = name;
    }
    @Override
    public int compareTo(Pro o) {
        return 0;
    }
}
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 2;

        ArrayList<Pro> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();

            list.add(new Pro(id,name));
        }

        Collections.sort(list);

        for(Pro li : list)
        {
            System.out.println(li);
        }
    }
}
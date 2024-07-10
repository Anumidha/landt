package LandT;
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       if(n<100 || n>999)
//       {
//           System.out.println("false");
//       }
//       else {
//           int mid = (n/10)%10;
//
//           if(mid%3==0)
//           {
//               System.out.println("trendy");
//           }
//           else{
//               System.out.println("Not trendy");
//           }
//       }
////        int j = 4;
////        for(int i=1;i<=n;i++)
////        {
////            System.out.print(j+" ");
////            j=j+1;
//
////        int start=4;
////   int end = 10;
////
////while(start<=end){
////    System.out.println(start);
////    start++;
////
////}
//    }
//}


import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

//import java.util.*;
//public class Student {
//    static String name;
//    static String grade;
//    static ArrayList<Student> students = new ArrayList<>();
//
//    public Student(String name,String grade) {
//        this.name = name;
//        this.grade = grade;
//    }
//
//    static void addstudent(String name, String grade)
//    {
//       students.add(new Student(name,grade));
//    }
//
//    static void displaystudent()
//    {
//        for(Student student : students)
//        {
//            System.out.println(student.name + " " + student.grade);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int choice = sc.nextInt();
//
//        switch (choice)
//        {
//            case 1 :
//                String name = sc.next();
//                String grade = sc.next();
//
//                if(students.size() > 100)
//                {
//                    System.out.println("NO space available");
//                }
//                else {
//                    addstudent(name,grade);
//                }
//
//            case 2:
//                if(students.size() <= 0)
//                {
//                    System.out.println("No student details available");
//                }
//                else {
//                    displaystudent();
//                }
//                break;
//            case 3:
//                System.out.println("Existing");
//                return;
//            default:
//                System.out.println("Ivalid choice,Please try again later");
//        }
//    }
//}
//class People {
//
//    int age;
//    String name;
//
//    People(int vayasu,String peru) {
//        this.age = vayasu;
//        this.name = peru;
//    }
//
//
//
//}
//
//
//public class Student {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<People> list = new ArrayList<>();
//        for (int i = 1; i <= 4; i++)
//        {
//            int age = sc.nextInt();
//            sc.nextLine();
//
//
//            String name = sc.nextLine();
//
//            list.add(new People(age,name));
//
//
//        }
//
//        for(People pupil : list)
//        {
//            System.out.println(pupil.age+" "+pupil.name);
//        }
//    }
//}
class Hotels{
    int year;
    String name;

    Hotels(int year,String name){
        this.year=year;
        this.name=name;
    }

}
public class Student{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Hotels> list = new ArrayList<>();

        int year = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();

        list.add(new Hotels(year,name));
        System.out.println("Hotel information :");
        for(Hotels hotel:list)
        {

            System.out.println("Name : "+hotel.name );
            System.out.println("yearOfopening : "+hotel.year );
        }


    }
}

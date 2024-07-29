package constructor;


public class Student {
    String name;
    int rollno;
    Student(String name,int rollno){
        this.name=name;
       this.rollno=rollno;
    }
    void display(){
        System.out.println("name:" + name);
        System.out.println("rollno:" + rollno);
    }
}
class constructor{
    public static void main(String[] args) {
        Student a = new Student("anu",9);
        a.display();
    }
}

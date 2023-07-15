
class Pen{
    String color;
    String type;

    //write method won't work with just write()
     public void write(){
        System.out.println("write something");
    }
    public void printColor() {
        System.out.println(this.color);
    }
}
class Student{
    String name;
    String gender;

    public void printInfo() {
        System.out.println(this.name);
    }
    //Function overloading happens when we create multiple functions with same name
    //Overloading is a type of polymorphism and it is compile time polymorphism
    public void printInfo(String name,String gender){
        System.out.println(this.name);
        System.out.println(this.gender);
    }
    Student(String name,String gender){
        this.name = name;
        this.gender = gender;
        System.out.println("constructor called");
    }
    Student(Student s){ // Copy constructor
        this.name = s.name;
        this.gender = s.gender;
    }
}

public class Example{
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.write();
        // pen1.color = "black";
        // pen1.printColor();
        Student s1 = new Student("pratham","male");
        // s1.name = "pratham";
        // s1.printInfo();
        Student s2 = new Student(s1);
        s2.printInfo();
        s1.printInfo(s1.name,s1.gender);

    }
}
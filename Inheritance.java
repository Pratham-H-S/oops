
// import bank;
class Shape{
    public void area(){
        System.out.println("display area");
    }
}
class Triangle extends Shape{ //single level inheritance
    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }
}
class  EquiTriangle extends Shape{ //multi level inheritance
    public void area(int l ,int h){
        System.out.println(0.5*l*h);
    }
}
class Circle extends Shape{ //Hierarchial inheritance
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}




public class Inheritance {
    public static void main(String[] args){
        Triangle t = new Triangle();
        t.area(5,5);
        t.area();
        // bank.Account a1 = new  bank.Account();
        // a1.name = "pratham";
    }
    
}

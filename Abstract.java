abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("animal sonstruct created");
    }
    public void eats(){
        System.out.println("eats");
    }
}

class Horse extends Animal{
    public void walk(){
        System.out.println("walks on four legs");
    }
}




public class Abstract {
   public static void main(String[] args) {
       Horse h = new Horse();
       h.walk();
       h.eats();
   }
    
}

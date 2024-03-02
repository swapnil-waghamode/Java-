
class Parent{
    int a ;

    void sayParent(){
        a =10;
        System.out.println("Hello from parent");
    }
}

class Child extends Parent{

    int b ;

    void sayChild(){
        b = 20;
        System.out.println("Hello from child");
    }
}


public class Inheritance {
    public static void main(String[] args) {

        Child c = new Child();
        c.sayParent();
        c.sayChild();
        System.out.println(c.a +" "+ c.b);
    }
}

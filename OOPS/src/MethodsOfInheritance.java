

class Animal{

    void breath(){
        System.out.println("Animal is breathing");
    }

    void eat(){
        System.out.println("Animal is eating");
    }

    void foodHabit(){
        System.out.println("Animal is having diff food habit");
    }
}

class Deer extends Animal{

    void run(){
        System.out.println("Deer is running");
    }

    @Override
    void eat() {
        System.out.println("Deer is eating grass");
    }

    @Override
    void foodHabit() {
        System.out.println("Deer is herbivorous");
    }
}

class Tiger extends Animal{
    @Override
    void eat() {
        System.out.println("Tiger eating other animal");
    }

    @Override
    void foodHabit() {
        System.out.println("Tiger is Carnivorous");
    }
}

class Monkey extends Animal{
    @Override
    void eat() {
        System.out.println("Monkey Eating Mango");
    }

    @Override
    void foodHabit() {
        System.out.println("Monkeys are omnivorous");
    }
}

public class MethodsOfInheritance {
    public static void main(String[] args) {

        Deer d = new Deer();
        d.run();      // specialised method
        d.breath(); // Inherited method
        d.eat();       // override method
        d.foodHabit(); // override method

        System.out.println();

        Tiger t = new Tiger();
        t.breath();
        t.eat();
        t.foodHabit();

        System.out.println();

        Monkey m = new Monkey();
        m.breath();
        m.eat();
        m.foodHabit();

    }
}

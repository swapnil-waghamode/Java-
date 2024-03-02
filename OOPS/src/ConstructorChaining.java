
public class ConstructorChaining {

    int id;
    String name;
    int sal;

    public ConstructorChaining(){
        id = 101;
        name ="Rock";
        sal = 25000;
    }

    public ConstructorChaining(int id, String name, int sal){
        this();
        this.id = id;
        this.name=name;
        this.sal = sal;
    }

    public static void main(String[] args) {

        ConstructorChaining c = new ConstructorChaining(102,"Tony",42000);

        System.out.println(c.id+" "+ c.name+" "+ c.sal);

    }
}


public class Constructor {

    int id;
    String name;
    int salary;

    public Constructor(int id, String name, int salary){
//        id = id; it will create shadowing problem ambiguity
//        name = name;
//        salary = salary;

        // this refers to current class object

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {

        Constructor c = new Constructor(1,"John",230000);

        System.out.println(c.id +" "+ c.name +" "+ c.salary);
    }
}

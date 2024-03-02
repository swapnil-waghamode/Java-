
 class Test{

//    static variables
    static int x;
    static int y;

//    static block

     static {

         System.out.println("Initially x = "+x +" y = "+ y);
         x = 10;
         y = 20;
         System.out.println("static block x => " + x +" y =>  "+ y);
     }

     static void show(){
         x = 1;
         y = 11;
         System.out.println("From static method -> x => " + x +" y =>  "+ y);
         System.out.println();
     }



//     instance variables
     int j, k;

     {
         System.out.println("Initially j = "+j +" k = "+ k);
         j = 6;
         k = 8;
         System.out.println("Non static block j => "+ j+ " k => "+ k);
     }

//     non-static method
     void hello(){
         j = 4;
         k = 5;
         System.out.println("From non-static method -> j => "+ j+ " k => "+ k );
     }

     Test(){
         j = 40;
         k = 50;
         System.out.println("Constructor j => " + j+" k => "+ k);
     }

 }



public class InstanceStatic {

    public static void main(String[] args) {

//        calling static method using class name
        Test.show();

//        instantiation and calling non-static method
        Test t = new Test();
        t.hello();
    }

}

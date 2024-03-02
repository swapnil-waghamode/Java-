
public class String2 {
    public static void main(String[] args) {

        String s1 = new String("Java"); // non-constant pool -> duplicate allowed

        String s2 = new String("Java");

        if(s1 == s2){
            System.out.println("Both string has same references");
        }else{
            System.out.println("Both string has different references");
        }

        if(s1.equals(s2)){
            System.out.println("Both string has same values");
        }else{
            System.out.println("Both string has different values");
        }


//       String and new String

        String str = "Hello";

        String str2 = "hello";

        if(str.equals(str2)){
            System.out.println("Both string are same");
        }else{
            System.out.println("Both string are  not same");
        }


//        compareTo()

        String s = "JAVAC";
        String st = "JAVA";       // s > st (+ve value) , s == st (0) , s < st (-ve value)

        System.out.println(s.compareTo(st));
    }
}

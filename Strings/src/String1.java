public class String1 {
    public static void main(String[] args) {

//        Create String

        String s1 = "JAVA";   // immutable String -> constant pool -> no duplicates allowed

        String s2 = "JAVA";

//        now compare string references and String values


        if( s1 == s2){
            System.out.println("Both string has same references");
        }else{
            System.out.println("Both String has different references");
        }

        if( s1.equals(s2)){
            System.out.println("Both string has same value");
        }else{
            System.out.println("Both String has different value");
        }
    }
}
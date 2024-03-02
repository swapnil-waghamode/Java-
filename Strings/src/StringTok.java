import java.util.StringTokenizer;

public class StringTok {
    public static void main(String[] args) {

        String s = "Java Python Sql";

        StringTokenizer st = new StringTokenizer(s); // it will get tokens where it space is occurred

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        String str = "JAVA PYTHON AI";
        StringTokenizer st2 = new StringTokenizer(str,"A");

        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }
    }
}

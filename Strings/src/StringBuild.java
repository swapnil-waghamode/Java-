
public class StringBuild {
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder();
        System.out.println(s.capacity());

        s.append("Hello World");
        System.out.println(s);

        // same as string buffer just it is not-thread safe
    }
}

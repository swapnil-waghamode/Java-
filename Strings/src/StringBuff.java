
public class StringBuff {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        System.out.println(sb.capacity()); // default capacity of string buffer is 16

        sb.append("Java ");
        sb.append("Python");

        System.out.println(sb);
        System.out.println(sb.length());

        // here size of actual string is (11) but it uses 16 to avoid it we use trimToSize() function

        sb.trimToSize();
        System.out.println(sb.length());
    }
}

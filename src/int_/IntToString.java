package int_;

public class IntToString {

    public static void main(String[] args) {

        // int to String
        int n = 222;

        System.out.println(Integer.toString(n).length());
        System.out.println(String.valueOf(n).length());

        // String to int
        String s = "333";

        int n2 = Integer.parseInt(s);

        System.out.println(n + n2);

    }
}

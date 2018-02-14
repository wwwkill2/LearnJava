package chapter1;

/**
 * Author: WangJiaming
 * Time: 18/2/14
 * Description:
 */
public class First {
    public static void main(String[] args) {
        test3();
    }

    private static void test1() {
        String a = "a" + "b" + 1;
        String b = "ab1";
        System.out.println(a == b);
    }

    private static String getA() {
        return "a";
    }

    private static void println(Object o) {
        System.out.println(o);
    }

    private static void test2() {
        String a = "a";
        final String c = "a";

        String b = a + "b";
        String d = c + "b";
        String e = getA() + "b";

        String compare = "ab";
        System.out.println(b == compare);// I think is false
        System.out.println(d == compare);// I think is true
        System.out.println(e == compare);// I think is false
    }

    private static void test3() {
        String a = "a";
        String b = a + "b";
        String c = "ab";
        String d = new String(b);
        println(b == c);// false
        println(c == d);// false
        println(c == d.intern());// true
        println(b.intern() == d.intern()); // true

    }
}

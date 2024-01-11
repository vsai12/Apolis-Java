public class StringSwap
{
    static void stringSwap(String s1, String s2) {
        s1 = s1 + s2;
        s2 = s1.substring(0,s1.length() - s2.length());
        s1 = s1.substring(s2.length());
    }
}

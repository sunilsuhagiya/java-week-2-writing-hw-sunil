package HandWrittenWeek6Hw;

/** Write a java program to display the following pattern.
 * Sample pattern
 * J  a  V  v  a
 * J  a  a  V  v  a  a
 * J  J  aaaaa    V  V  aaaaa
 * J  J  a  a V   a  a
 */
public class Programme_11_JavaPattern {
    public static void main(String[] args) {
        Programme_11_JavaPattern t = new Programme_11_JavaPattern();
        System.out.println("--------------------------------------");
        t.javaPattern();

    }
    // Print the Java Pattern
    public void javaPattern(){
        System.out.println("J  a  v   v a");
        System.out.println("J a a  v v a a");
        System.out.println("J J aaaaa  V V aaaaa");
        System.out.println("J J a   a  V a  a");
    }
}

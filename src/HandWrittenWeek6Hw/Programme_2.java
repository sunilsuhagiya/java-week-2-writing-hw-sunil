package HandWrittenWeek6Hw;

/**
 * Write a java programme using the following steps.
 * 2.1 Declare two static variables.
 * 2.2 Declare one static method.
 * 2.3 Call both static variables in the static method inside the print statement.
 * 2.4 Declare main method.
 * 2.5 Call the static method in to the Main method and Run the programme.
 */
public class Programme_2 {
    //2.1 Declare two static variables.
    static int a = 100;
    static int b = 200;
    //2.2 Declare one static method.
    //2.3 Call both static variables in the static method inside the print statement.
    public static void staticMethod(){
        System.out.println(a);
        System.out.println(b);
    }
    //2.4 Declare main method.
    //2.5 Call the static method in to the Main method and Run the programme.
    public static void main(String[] args) {
        staticMethod();
    }
}

package HandWrittenWeek6Hw;

/**
 * Write a java programme using the following steps.
 * 4.1 Declare two instance and static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside print statement.
 * 4.5 Declare main method.
 * 4.6 Call both instance and static method into the Main method.
 */
public class Programme_4 {
    // 4.1 Declare two instance and static variables
    // Instance variables
    String name= "Prime";
    String surname = "Testing";
    // Static variables
    static boolean a = true;
    static boolean b = false;
    // 4.2  Declare one instance method
    // 4.4 Call all four instance and static variables into the instance method inside print statement.
    public void instanceMethod(){
        System.out.println(name);
        System.out.println(surname);
        System.out.println(Programme_4.a);
        System.out.println(Programme_4.b);
    }
    //4.3 Declare one static method.
    //4.4 Call all four instance and static variables into the static method inside print statement.
    public static void staticMethod(){
        Programme_4 programme_4 = new Programme_4();
        System.out.println(programme_4.name);
        System.out.println(programme_4.surname);
        System.out.println(a);
        System.out.println(b);
    }
   // 4.5 Declare Main method.
   // 4.6 Call both instance and static method into Main method and run the programme.
   public static void main(String[] args) {
       Programme_4 programme_4 = new Programme_4();
       programme_4.instanceMethod();
       staticMethod();
   }
}

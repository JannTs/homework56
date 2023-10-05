package our_interfaces;
public class Utils {
    public static Printable toConsole() {
        return str -> System.out.println(str);
    }
    public static String delimiterLine() {
        Productable delimiterLine = () -> "===================";
        return delimiterLine.produce();
    }
    public static String task() {
        return "Task #";
    }
    public static Incrementable incrementable() {
        return new Incrementable();
    }
}







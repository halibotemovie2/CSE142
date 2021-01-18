// Sample program that produces output with various shapes.  This version has
// good structure, but lots of redundancy.

public class Figure2 {
    public static void main(String[] args) {
        egg();
        System.out.println();
        teacup();
        System.out.println();
        stopSign();
        System.out.println();
        hat();
    }
        
    public static void egg() {
        System.out.println("  ______");
        System.out.println(" /......\\");
        System.out.println("/........\\");
        System.out.println("\\......../");
        System.out.println(" \\______/");
    }

    public static void teacup() {
        System.out.println("\\......../");
        System.out.println(" \\______/");
        System.out.println("+--------+");
    }

    public static void stopSign() {
        System.out.println("  ______");
        System.out.println(" /......\\");
        System.out.println("/........\\");
        System.out.println("|  STOP  |");
        System.out.println("\\......../");
        System.out.println(" \\______/");
    }

    public static void hat() {
        System.out.println("  ______");
        System.out.println(" /......\\");
        System.out.println("/........\\");
        System.out.println("+--------+");
    }
}

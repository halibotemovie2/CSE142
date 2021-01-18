// Sample program that produces output with various shapes.  This version has
// good structure and eliminates redundancy.

public class Figure3 {
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
        eggTop();
        eggBottom();
    }

    public static void teacup() {       
        eggBottom();
        line();
    }
        
    public static void stopSign() {
        eggTop();
        System.out.println("|  STOP  |");
        eggBottom();
    }
        
    public static void hat() {
        eggTop();
        line();
    }
        
    public static void eggTop() {
        System.out.println("  ______");
        System.out.println(" /......\\");
        System.out.println("/........\\");      
    }
        
    public static void eggBottom() {
        System.out.println("\\......../");
        System.out.println(" \\______/");
    }

    public static void line() {
        System.out.println("+--------+");
    }
}

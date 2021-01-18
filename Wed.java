import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int days = console.nextInt();  
        
        int sum=0;
        for (int i = 0; i < days; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: " );
            int next = console.nextInt();
            sum+=next;
        }
        double average = (double) sum / (double) days; 
        System.out.println("Average temp = " + average);  
    }
    
    
         
    
}
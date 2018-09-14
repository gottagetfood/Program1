
package program1;

import java.util.Calendar;
import java.util.GregorianCalendar;



public class Options {
     public static void setInt() {
            java.util.Scanner ind = new java.util.Scanner(System.in);
            int option;
            System.out.println("Hvad vil du se? (Tast nummer)");
            System.out.println("1. Se dato");
            System.out.println("2. Se tid");
            System.out.println("3. Info om forfatteren");
            
            option = ind.nextInt();
            Program1.option = option;
            
     }
     
}



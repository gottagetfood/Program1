
package program1;

import java.util.Calendar;
import java.util.GregorianCalendar;



public class Options {
     public void setInt(Int option) { {
    Calendar c = GregorianCalendar.getInstance();
            java.util.Scanner ind = new java.util.Scanner(System.in);
            int option;
            System.out.println("Hvad vil du se? (Tast nummer)");
            System.out.println("1. Se dato");
            System.out.println("2. Se tid");
            System.out.println("3. Info om forfatteren");
            option = ind.nextInt();
           
          this.option = option;
            
     }
     
}



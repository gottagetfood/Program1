
package program1;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Program1 {

    public int option;

    public static void main(String[] args) {
        while (true) {
            Calendar c = GregorianCalendar.getInstance();
            /*java.util.Scanner ind = new java.util.Scanner(System.in);
            System.out.println("Hvad vil du se? (Tast nummer)");
            System.out.println("1. Se dato");
            System.out.println("2. Se tid");
            System.out.println("3. Info om forfatteren");
            option = ind.nextInt();*/
            option = Options.setInt();
            switch (option) {
                case 1:
                    System.out.println("Datoen er " + c.get(Calendar.DAY_OF_MONTH) + "/" + c.get(Calendar.MONTH) + "/" + c.get(Calendar.YEAR));
                    break;
                case 2:
                    System.out.println("Klokken er " + c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE));
                    break;
                case 3:
                    System.out.println("Forfatteren hedder Alexander og dette er en af hans første programmer.");
                    break;
                case 99:
                    return;
                default:
                    break;
            } 
            
            try{
                Thread.sleep(5000);
            }
            catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
    }
    
}

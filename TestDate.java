import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Scanner; 
import java.text.ParseException;

class TestDate {

    public static void main(String[] args) {

        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill a day (1-31) :");
        int day = sc.nextInt();
        System.out.println("Please fill a month (1-12) :");
        int month = sc.nextInt();
        System.out.println("Please fill a year :");
        int year = sc.nextInt();
        sc.close();
        // TODO : your code after this line
    Calendar c = new GregorianCalendar(year, (month - 1), day);
    int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
    Date d = c.getTime();
    System.out.println("The date is : " + format.format(d)); 
    System.out.println("The day of week is : " + dayOfWeek);
    }
}
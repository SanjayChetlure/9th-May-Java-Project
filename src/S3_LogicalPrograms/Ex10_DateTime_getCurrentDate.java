package S3_LogicalPrograms;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
public class Ex10_DateTime_getCurrentDate
{
    public static void main(String[] args)
    {
//        System.out.println(LocalDate.now());    // Return only current date

        Date date = new Date();          //Fri Oct 23 20:52:24 IST 2026 -> returns date & time
//        System.out.println(date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");  // formatting
        System.out.println(dateFormat.format(date));
    }
}

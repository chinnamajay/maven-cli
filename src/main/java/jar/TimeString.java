import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class TimeString {
    public static void main(String[] args) {
        String string = "July 23, 2019";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(string, formatter);
        System.out.println(date);
    }
}

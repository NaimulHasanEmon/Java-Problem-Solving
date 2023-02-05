import java.text.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CurrentDateTime {
    public static void main(String[] args) {
        Date date = new Date();
        LocalTime time = LocalTime.now();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(dateFormat.format(date));
        System.out.println(time.format(formatter));
    }
}
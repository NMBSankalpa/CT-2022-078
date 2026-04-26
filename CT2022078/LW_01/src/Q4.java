import java.text.SimpleDateFormat;
import java.util.Date;

public class Q4 {
    static void main() {
        Date today = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy");
        System.out.println(simpleDateFormat.format(today));

    }
}

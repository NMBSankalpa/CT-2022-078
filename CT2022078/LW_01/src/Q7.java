import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q7 {
    static void main() {
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm:ss a");
        String currenttime = simpleDateFormat.format(now);

        JFrame newframe  = new JFrame();
        newframe.setSize(500,300);
        newframe.setTitle(currenttime);
        newframe.setVisible(true);


    }
}


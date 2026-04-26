import javax.swing.*;

public class Q13 {
    static void main() {
        JFrame myWindow = new JFrame() ;

        myWindow.setSize (500, 250);
        myWindow. setTitle ("UOK") ;
        myWindow. setVisible (true) ;

        try {
            Thread. sleep (500);
        }
        catch (Exception e) { }
        myWindow. setVisible (false);

        try {
            Thread. sleep (500);
        }
        catch (Exception e) { }
        myWindow. setVisible (true) ;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Toolkit;
import javax.swing.JTextField;

/**
 *
 * @author Panhavuth
 */
public class CheckData {
    public static int checktext(JTextField... txt){
        for(JTextField t:txt){
            String st=t.getText();
            st=st.trim();
            if(st.length()==0){
                t.grabFocus();
                Toolkit.getDefaultToolkit().beep();
                return 0;
            }
        }
        return 1;
    }
    public static void input(){
        
        
    }

    public static int check(JTextField txt_username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}




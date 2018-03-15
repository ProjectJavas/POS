/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classs;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Panhavuth
 */
public class MyInput {
    
public void inputNumber(JTextField txt, KeyEvent evt){
    if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!=8){
        Toolkit.getDefaultToolkit().beep();
        evt.consume();
    }
}
public void inputNumber(JTextField txt, KeyEvent evt,int len){
    if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!=8){
        Toolkit.getDefaultToolkit().beep();
        evt.consume();
    }else{
        if(txt.getText().length()>=len){
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }
}
public void inputFloat(JTextField txt, KeyEvent evt){
    if(evt.getKeyChar()==46){
        if(txt.getText().indexOf(46)!=-1){
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }else{
            if(txt.getText().equals("")){
                txt.setText("0.");
                evt.consume();
            }
        }
        
    }else if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!=8){
        Toolkit.getDefaultToolkit().beep();
        evt.consume();
    }
    
}
public void inputFloat(JTextField txt, KeyEvent evt,int len){
    if(evt.getKeyChar()==46){
        if(txt.getText().indexOf(46)!=-1){
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }else{
            if(txt.getText().equals("")){
                txt.setText("0.");
                evt.consume();
            }
        }
        
    }else if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!=8){
        Toolkit.getDefaultToolkit().beep();
        evt.consume();
    }else{
        if(txt.getText().length()>=len){
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }
    
}
    
}

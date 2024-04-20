

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SimpleDialog3a {

    public static void main(String[] args){
        ImageIcon icon = new ImageIcon("src/images/turtle64.png");
        JOptionPane.showMessageDialog(null, "I am pro in html, css, python.", 
                "Customized Dialog", JOptionPane.INFORMATION_MESSAGE, icon);
    }

}

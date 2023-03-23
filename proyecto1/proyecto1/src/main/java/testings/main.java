package testings;
import javax.swing.JOptionPane;
public class main {
    public static void main (String[] args){
        String pass = JOptionPane.showInputDialog("contraseña");
        switch (passwordutil.assesPassword(pass)){
            case INVALID:
                JOptionPane.showMessageDialog(null,"invalid password","contraseña",JOptionPane.PLAIN_MESSAGE);
                break;
            case WEAK:

                JOptionPane.showMessageDialog(null,"weak password","contraseña",JOptionPane.PLAIN_MESSAGE);
                break;
            case MEDIUM:

                JOptionPane.showMessageDialog(null,"medium password","contraseña",JOptionPane.PLAIN_MESSAGE);
                break;
            case STRONG:

                JOptionPane.showMessageDialog(null,"STRONG password","contraseña",JOptionPane.PLAIN_MESSAGE);
                break;
        }
    }
}

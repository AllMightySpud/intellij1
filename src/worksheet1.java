import javax.swing.*;

public class worksheet1 {
    public static void main(String[] args) {

        String name, className, SnackNo;
        int price, snackNum;

        name=JOptionPane.showInputDialog( "Enter your name:");
        className=JOptionPane.showInputDialog( "Enter your class name:");
        SnackNo=JOptionPane.showInputDialog( "How many snacks do you want?");

        snackNum=Integer.parseInt(SnackNo);

        price= snackNum*2;

        JOptionPane.showMessageDialog(null,"Ok "+name+" from "+
                className+", it will cost you "+ price+" euro for "+SnackNo+" snacks");


    }
}

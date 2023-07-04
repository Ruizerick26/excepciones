import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Math.pow;
import static java.lang.Math.round;

public class holamundo {
    private JPanel rootPanel;
    private JButton ok;
    private JLabel INg;
    private JTextField peso;
    private JLabel ING2;
    private JTextField talla;
    private JLabel resultado;

    public holamundo(){

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double peso_1= Double.parseDouble(peso.getText());
                double talla_1=Double.parseDouble(talla.getText());
                double rc=peso_1/(pow(talla_1,2));
                resultado.setText(String.valueOf(rc));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CALCULADORA");
        frame.setContentPane(new holamundo().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

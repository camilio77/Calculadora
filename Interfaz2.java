import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz2 extends JFrame {
    private JLabel Jl;
    private JButton Boton1;
    private JButton Boton2;
    private JButton Boton4;
    private JButton Boton5;
    private JButton Boton7;
    private JButton Boton8;
    private JButton Boton3;
    private JButton Boton6;
    private JButton Boton9;
    private JButton Boton0;
    private JButton BotonClear;
    private JButton BotonIgual;
    private JButton BotonSuma;
    private JButton BotonResta;
    private JButton BotonMultiplicacion;
    private JButton BotonDividir;
    private JButton BotonBorrar;
    private JButton BotonElevar;
    private JButton BotonRaiz;
    private JButton BotonModulo;
    private JPanel Interfaz;

    public Interfaz2() {
        setContentPane(Interfaz);
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 300);
        setLocationRelativeTo(null);
        setVisible(true);

        Boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(Jl,"HelloWorld");
            }
        });
    }

    public static void main(String[] args) {
        new Interfaz2();
    }
}

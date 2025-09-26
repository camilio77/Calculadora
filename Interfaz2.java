import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Interfaz2 extends JFrame {
    private JTextField Texto;

    public Interfaz2() {
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 700);
        setLocationRelativeTo(null);

        Texto = new JTextField();
        Texto.setFont(new Font("Arial", Font.BOLD, 30));
        add(Texto, BorderLayout.NORTH);

        JPanel botones = new JPanel();
        botones.setLayout(new GridLayout(5, 4, 6, 6));
        add(botones, BorderLayout.CENTER);

        String[] teclas = {
                "1","2","3","+",
                "4","5","6","-",
                "7","8","9","*",
                "C","0","=","/",
                "X","'","√","%"
        };

        for(String tecla: teclas){
            JButton boton = new JButton(tecla);
            boton.setFont(new Font("Arial",Font.BOLD,30));
            botones.add(boton);
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new Interfaz2();
    }
}
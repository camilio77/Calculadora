import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Interfaz2 extends JFrame {
    private JTextField Texto;
    LogicaInterfaz logica= new LogicaInterfaz();

    public Interfaz2() {
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 700);
        setLocationRelativeTo(null);

        Texto = new JTextField(logica.getTexto());
        Texto.setHorizontalAlignment(SwingConstants.RIGHT);
        Texto.setEditable(false);
        Texto.setFocusable(true);
        Texto.setFont(new Font("Arial", Font.BOLD, 30));
        add(Texto, BorderLayout.NORTH);

        JPanel botones = new JPanel();
        botones.setLayout(new GridLayout(6, 4, 6, 6));
        add(botones, BorderLayout.CENTER);

        String[] teclas = {
                "1","2","3","+",
                "4","5","6","-",
                "7","8","9","*",
                "C","0","=","/",
                "X","'","√","%",
                "."
        };

        for(String tecla: teclas){
            JButton boton = new JButton(tecla);
            boton.setFont(new Font("Arial",Font.BOLD,30));
            boton.addActionListener(this::alClickear);
            botones.add(boton);
        }

        setVisible(true);
    }
    private void alClickear(ActionEvent ev){
        String tecla=((JButton)ev.getSource()).getText();
        switch(tecla){
            default:
                if(tecla.matches("\\d")){
                    logica.addNumero(tecla);
                    break;
                }
            case "√":
                logica.operacion(tecla);
                break;
            case "%":
                logica.operacion(tecla);
                break;
            case "*":
                logica.operacion(tecla);
                break;
            case "'":
                logica.operacion(tecla);
                break;
            case "/":
                logica.operacion(tecla);
                break;
            case "-":
                logica.operacion(tecla);
                break;
            case "+":
                logica.operacion(tecla);
                break;
            case ".":
                logica.addDecimal();
                break;
            case "=":
                logica.igual();
                break;
            case "C":
                logica.reinicio();
                break;
            case "X":
                logica.borrar();
                break;
        }
        actualizarTexto();
    }

    private void actualizarTexto(){
        Texto.setText(logica.getTexto());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Interfaz2::new);
    }
}
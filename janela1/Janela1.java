package janela1;

import java.awt.*;
import javax.swing.*;

public class Janela1 extends JFrame {
    JButton b1, b2;
    JPanel painel1;

    public Janela1() {
        setTitle("Janela Teste");
        setSize(560, 300);
        setLocation(200, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        b1 = new JButton("Boatao 1");
        b2 = new JButton("Botao 2");
        painel1 = new JPanel();
        painel1.setLayout(new FlowLayout());
        painel1.add(b1);
        painel1.add(b2);
        add(painel1);
        setVisible(true);
    }
}
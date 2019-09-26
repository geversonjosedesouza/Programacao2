package br.estacio.prii.trabalhoAV1deitel;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author geverson
 */
public class EventoBotao extends JFrame implements ActionListener {

    private JButton jbSimples, jbIcone;

    public EventoBotao() {
        super("Eventos de botões");
        setLayout(new FlowLayout());
        setSize(500, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jbSimples = new JButton("Botão Simples");
        add(jbSimples);

        Icon icone1 = new ImageIcon(getClass().getResource("confim1.png"));
        Icon icone2 = new ImageIcon(getClass().getResource("confim2.png"));
        jbIcone = new JButton("Botão Personalizado", icone1);
        jbIcone.setRolloverIcon(icone2);
        add(jbIcone);

        jbSimples.addActionListener(this);
        jbIcone.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Foi presionado o botão: " + e.getActionCommand());
    }

    public static void main(String[] args) {
        new EventoBotao().setVisible(true);
    }
}

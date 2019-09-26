package br.estacio.prii.trabalhoAV1deitel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author geverson
 */
public class EventoCheckBox extends JFrame implements ItemListener {

    private JTextField jtfResultado;
    private JCheckBox jcbNegrito, jcbItalico;

    public EventoCheckBox() {
        super("Eventos de Checagem");
        setLayout(new FlowLayout());
        setSize(500, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jtfResultado = new JTextField("Observe a mudança no estilo da fonte", 20);
        jtfResultado.setFont(new Font("Serif", Font.PLAIN, 14));
        add(jtfResultado);

        jcbNegrito = new JCheckBox("Negrito");
        jcbItalico = new JCheckBox("Italico");
        add(jcbNegrito);
        add(jcbItalico);

        jcbNegrito.addItemListener(this);
        jcbItalico.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Font fonte = null;
        if (jcbNegrito.isSelected() && jcbItalico.isSelected()) {
            fonte = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        } else if (jcbNegrito.isSelected()) {
            fonte = new Font("Serif", Font.BOLD, 14);
        } else if (jcbItalico.isSelected()) {
            fonte = new Font("Serif", Font.ITALIC, 14);
        } else {
            fonte = new Font("Serif", Font.PLAIN, 14);
        }
        jtfResultado.setFont(fonte);
    }

    public static void main(String[] args) {
        new EventoCheckBox().setVisible(true);
    }
}

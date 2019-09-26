package br.estacio.prii.trabalhoAV1deitel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author geverson
 */
public class EventoRadioButton extends JFrame implements ItemListener {

    private Font fSimples, fNegrito, fItalico, fNegritoItalico;
    private JTextField jtfResultado;
    private JRadioButton jrbSimples, jrbNegrito, jrbItalico, jrbNegritoItalico;
    private ButtonGroup bg;

    public EventoRadioButton() {
        super("Eventos de Seleção");
        setLayout(new FlowLayout());
        setSize(500, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jtfResultado = new JTextField("Observe a mudança no estilo da fonte", 20);
        add(jtfResultado);

        fSimples = new Font("Serif", Font.PLAIN, 14);
        fNegrito = new Font("Serif", Font.BOLD, 14);
        fItalico = new Font("Serif", Font.ITALIC, 14);
        fNegritoItalico = new Font("Serif", Font.ITALIC + Font.ITALIC, 14);
        jtfResultado.setFont(fSimples);

        jrbSimples = new JRadioButton("Simples", true);
        jrbNegrito = new JRadioButton("Negrito", false);
        jrbItalico = new JRadioButton("Italico", false);
        jrbNegritoItalico = new JRadioButton("Negrito/Itelico", false);
        add(jrbSimples);
        add(jrbNegrito);
        add(jrbItalico);
        add(jrbNegritoItalico);

        bg = new ButtonGroup();
        bg.add(jrbSimples);
        bg.add(jrbNegrito);
        bg.add(jrbItalico);
        bg.add(jrbNegritoItalico);

        jrbSimples.addItemListener(this);
        jrbNegrito.addItemListener(this);
        jrbItalico.addItemListener(this);
        jrbNegritoItalico.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Font fonte = null;
        if (jrbNegrito.isSelected() && jrbItalico.isSelected()) {
            fonte = fNegritoItalico;
        } else if (jrbNegrito.isSelected()) {
            fonte = fNegrito;
        } else if (jrbItalico.isSelected()) {
            fonte = fItalico;
        } else {
            fonte = fSimples;
        }
        jtfResultado.setFont(fonte);
    }

    public static void main(String[] args) {
        new EventoRadioButton().setVisible(true);
    }
}

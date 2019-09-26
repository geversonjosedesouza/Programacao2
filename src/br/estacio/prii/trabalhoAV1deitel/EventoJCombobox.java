package br.estacio.prii.trabalhoAV1deitel;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author geverson
 */
public class EventoJCombobox extends JFrame implements ItemListener {
    
    private JComboBox jcbImagen;
    private JLabel jlResultado;
    private static final String NOMES[] = {"gif01.gif", "gif02.gif", "gif03.gif", "gif04.gif"};
    private Icon icones[] = {new ImageIcon(getClass().getResource(NOMES[0])), new ImageIcon(getClass().getResource(NOMES[1])), new ImageIcon(getClass().getResource(NOMES[2])), new ImageIcon(getClass().getResource(NOMES[3]))};
    
    public EventoJCombobox() {
        super("Eventos de Seleção");
        setLayout(new FlowLayout());
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jcbImagen = new JComboBox(NOMES);
        jcbImagen.setMaximumRowCount(3);
        
        add(jcbImagen);
        jlResultado = new JLabel(icones[3]);
        add(jlResultado);
        jcbImagen.addItemListener(this);
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            jlResultado.setIcon(icones[jcbImagen.getSelectedIndex()]);
        }
        
    }
    public static void main(String[] args) {
        new EventoJCombobox().setVisible(true);
    }
}

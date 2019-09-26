/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.prii.trabalhoAV1deitel;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

/**
 *
 * @author geverson
 */
public class TesteImplementaEvento extends JFrame implements AncestorListener {
    
    private Font fSimples, fNegrito, fItalico, fNegritoItalico;
    private JTextField jtfResultado;
    private JRadioButton jrbSimples, jrbNegrito, jrbItalico, jrbNegritoItalico;
    private ButtonGroup bg;
    private JLabel jlTeste;
    
    public TesteImplementaEvento() {
        super("Teste Eventos");
        setLayout(new FlowLayout());
        setSize(500, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jtfResultado = new JTextField("Observe a mudança no estilo da fonte", 20);
        add(jtfResultado);
        jtfResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        fSimples = new Font("Serif", Font.PLAIN, 14);
        fNegrito = new Font("Serif", Font.BOLD, 14);
        fItalico = new Font("Serif", Font.ITALIC, 14);
        fNegritoItalico = new Font("Serif", Font.ITALIC + Font.ITALIC, 14);
        jtfResultado.setFont(fSimples);
        
        jlTeste = new JLabel("Teste Label");
        
        jrbSimples = new JRadioButton("Simples", true);
        jrbNegrito = new JRadioButton("Negrito", false);
        jrbItalico = new JRadioButton("Italico", false);
        jrbNegritoItalico = new JRadioButton("Negrito/Itelico", false);
        add(jrbSimples);
        add(jrbNegrito);
        add(jrbItalico);
        add(jrbNegritoItalico);
        add(jlTeste);
        
        bg = new ButtonGroup();
        bg.add(jrbSimples);
        bg.add(jrbNegrito);
        bg.add(jrbItalico);
        bg.add(jrbNegritoItalico);
    }
    
    public static void main(String[] args) {
        new TesteImplementaEvento().setVisible(true);
    }
    
    @Override
    public void ancestorAdded(AncestorEvent event) {
        JOptionPane.showMessageDialog(null, "Teste added...");
    }
    
    @Override
    public void ancestorRemoved(AncestorEvent event) {
        JOptionPane.showMessageDialog(null, "Teste removed...");
    }
    
    @Override
    public void ancestorMoved(AncestorEvent event) {
        JOptionPane.showMessageDialog(null, "Teste moved...");
    }
}

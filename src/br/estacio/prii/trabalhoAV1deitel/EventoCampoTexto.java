package br.estacio.prii.trabalhoAV1deitel;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author geverson
 */
public class EventoCampoTexto extends JFrame implements ActionListener {

    private JTextField jtfCampoTexto01, jtfCampoTexto02, jtfCampoTexto03;
    private JPasswordField jpfCampoSenha;

    public EventoCampoTexto() {
        super("Eventos de Campo Texto");
        setLayout(new FlowLayout());
        setSize(500, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jtfCampoTexto01 = new JTextField(10);
        add(jtfCampoTexto01);

        jtfCampoTexto02 = new JTextField("Digite seu texto aqui!");
        add(jtfCampoTexto02);

        jtfCampoTexto03 = new JTextField("Desativado campo texto!", 21);
        add(jtfCampoTexto03);

        jpfCampoSenha = new JPasswordField("Caracteres ocultos!");
        add(jpfCampoSenha);

        jtfCampoTexto01.addActionListener(this);
        jtfCampoTexto02.addActionListener(this);
        jtfCampoTexto03.addActionListener(this);
        jpfCampoSenha.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String resultado = "";
        if (e.getSource() == jtfCampoTexto01) {
            resultado = String.format("Campo Texto 01: %s", e.getActionCommand());
        } else if (e.getSource() == jtfCampoTexto02) {
            resultado = String.format("Campo Texto 02: %s", e.getActionCommand());
        } else if (e.getSource() == jtfCampoTexto03) {
            resultado = String.format("Campo Texto 03: %s", e.getActionCommand());
        } else if (e.getSource() == jpfCampoSenha) {
            resultado = String.format("Campo Senha: %s", new String(jpfCampoSenha.getPassword()));
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    public static void main(String[] args) {
        new EventoCampoTexto().setVisible(true);
    }
}

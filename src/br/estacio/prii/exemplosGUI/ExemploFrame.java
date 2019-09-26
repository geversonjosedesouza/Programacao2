/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.prii.exemplosGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author geverson
 */
public class ExemploFrame extends JFrame {
    
    private JPanel jpTopo, jpCentro, jpForm, jpBtn;
    private JLabel jlNomeSistema, jlNome, jlSenha;
    private JTextField jtfNome;
    private JPasswordField jpfSenha;
    private JButton jbOk, jbCancelar;
    
    public ExemploFrame(String title) {
        super(title);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jpTopo = new JPanel();
        jlNomeSistema = new JLabel("Meu Sistema");
        jlNomeSistema.setFont(new Font("Times new roman", Font.BOLD, 50));
        jlNomeSistema.setForeground(Color.BLUE);
        jpTopo.add(jlNomeSistema);
        
        jpCentro = new JPanel();
        jpForm = new JPanel();
        jlNome = new JLabel("Nome: ", JLabel.RIGHT);
        jlSenha = new JLabel("Senha: ", JLabel.RIGHT);
        jtfNome = new JTextField(10);
        jpfSenha = new JPasswordField(10);
        jpForm.add(jlNome);
        jpForm.add(jtfNome);
        jpForm.add(jlSenha);
        jpForm.add(jpfSenha);
        jpForm.setLayout(new GridLayout(2, 2, 5, 5));
        jpCentro.add(jpForm);
        jpBtn = new JPanel();
        jbOk = new JButton("Ok");
        jbCancelar = new JButton("Cancelar");
        jpBtn.add(jbOk);
        jpBtn.add(jbCancelar);
        jpBtn.setLayout(new GridLayout(1, 2, 5, 5));
        jpCentro.add(jpBtn);
        
        ExemploEvento ee = new ExemploEvento();
        jbOk.addActionListener(ee);
        
        add(jpTopo, BorderLayout.NORTH);
        add(jpCentro, BorderLayout.CENTER);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new ExemploFrame("Meus Primeiros eventos");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.prii.aulaGUI.frame1;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author geverson
 */
public class Exercicio1b extends JFrame {
    
    private JLabel jlUsuario, jlSenha;
    private JTextField jtfUsuario;
    private JPasswordField jpfSenha;
    private JButton jbOk, jbSair;
    
    public Exercicio1b(String title) {
        super(title);
        this.setSize(300, 150);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(3, 2));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jlUsuario = new JLabel("Usuário:", (int) JLabel.LEFT_ALIGNMENT);
        jtfUsuario = new JTextField(10);
        jlSenha = new JLabel("Senha:",(int) JLabel.LEFT_ALIGNMENT);
        jpfSenha = new JPasswordField(10);
        jbOk = new JButton("Ok");
        jbSair = new JButton("Sair");
        jbOk = new JButton("Ok");
        
        this.add(jlUsuario);
        this.add(jtfUsuario);
        this.add(jlSenha);
        this.add(jpfSenha);
        this.add(jbOk);
        this.add(jbSair);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Exercicio1b("Exercício 1b");
    }
}

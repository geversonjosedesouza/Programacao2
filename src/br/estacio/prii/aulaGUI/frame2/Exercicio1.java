/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.prii.aulaGUI.frame2;

import java.awt.BorderLayout;
import java.awt.Color;
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
public class Exercicio1 extends JFrame {

    private JPanel jpTitulo, jpCentro, jpForms, jpFormJTF, jpFormJPF, jpButtonFechar, jpButtonAcessar, jpRodape;
    private JLabel jlTitulo, jlUsuario, jlSenha, jlSistema, jlData;
    private JTextField jtfUsuario;
    private JPasswordField jpfSenha;
    private JButton jbAcessar, jbFechar;

    public Exercicio1(String title) {
        super(title);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jpTitulo = new JPanel();
        jlTitulo = new JLabel("Acesso ao Sistema");
        jlTitulo.setForeground(Color.blue);
        jpTitulo.add(jlTitulo);

        jpCentro = new JPanel();
        jpCentro.add(new JPanel());
        jpForms = new JPanel();
        jlUsuario = new JLabel("Usuário: ", JLabel.RIGHT);
        jlSenha = new JLabel("Senha de Acesso: ", JLabel.RIGHT);
        jtfUsuario = new JTextField(15);
        jpfSenha = new JPasswordField(15);
        jpForms.add(jlUsuario);
        jpFormJTF = new JPanel();
        jpFormJTF.add(jtfUsuario);
        jpForms.add(jpFormJTF);
        jpForms.add(jlSenha);
        jpFormJPF = new JPanel();
        jpFormJPF.add(jpfSenha);
        jpForms.add(jpFormJPF);
        jpForms.setLayout(new GridLayout(2, 2));
        jpCentro.add(jpForms);

        jpButtonAcessar = new JPanel();
        jbAcessar = new JButton("Acessar");
        jpButtonAcessar.add(jbAcessar);
        jpCentro.add(jpButtonAcessar);

        jpButtonFechar = new JPanel();
        jbFechar = new JButton("Fechar");
        jpButtonFechar.add(jbFechar);
        jpCentro.add(jpButtonFechar);
        jpCentro.add(new JPanel());
        jpCentro.setLayout(new GridLayout(5, 1));

        jpRodape = new JPanel();
        jlSistema = new JLabel("Nome do Sistema", JLabel.LEFT);
        jlSistema.setForeground(Color.red);
        jlData = new JLabel("09/09/2019", JLabel.RIGHT);
        jlData.setForeground(Color.red);
        jpRodape.add(jlSistema);
        jpRodape.add(jlData);
        jpRodape.setLayout(new GridLayout(1, 2, 5, 5));

        add(jpTitulo, BorderLayout.NORTH);
        add(jpCentro, BorderLayout.CENTER);
        add(jpRodape, BorderLayout.SOUTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Exercicio1("Exercício 1 frames 2");
    }
}

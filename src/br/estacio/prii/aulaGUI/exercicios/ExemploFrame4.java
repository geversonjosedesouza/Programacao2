/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.prii.aulaGUI.exercicios;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author geverson
 */
public class ExemploFrame4 extends JFrame {

    private JLabel labelNome;
    private JTextField textNome;
    private JButton botaoOk;

    public ExemploFrame4(String title) throws HeadlessException {
        super(title);
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        labelNome = new JLabel("DIGITE SEU NOME: ");
        textNome = new JTextField(10);
        botaoOk = new JButton("Ok");

        this.add(labelNome);
        this.add(textNome);
        this.add(botaoOk);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new ExemploFrame4("Exemplo Frame com Componentes");
    }
}

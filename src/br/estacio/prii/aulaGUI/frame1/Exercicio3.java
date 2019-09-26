/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.prii.aulaGUI.frame1;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author geverson
 */
public class Exercicio3 extends JFrame {

    public Exercicio3(String titulo) {
        super(titulo);
        this.setSize(300, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 3, 5, 5));
        for (int i = 1; i <= 9; i++) {
            add(new JButton(String.valueOf(i)));
        }
        add(new JButton("*"));
        add(new JButton("0"));
        add(new JButton("#"));
        setVisible(true);
    }

    public static void main(String[] args) {
        new Exercicio3("Exercício 3");
    }
}

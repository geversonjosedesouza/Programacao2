/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.prii.aulaGUI.frame1;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JFrame;

/**
 *
 * @author geverson
 */
public class Exercicio2b extends JFrame {

    private JLabel jlNorte;
    private JLabel jlSul;
    private JLabel jlCentro;

    public Exercicio2b(String titulo) {
        super(titulo);
        this.setSize(300, 150);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jlNorte = new JLabel("Norte", JLabel.CENTER);
        jlSul = new JLabel("Sul", JLabel.CENTER);
        jlCentro = new JLabel("Centro", JLabel.CENTER);

        add(jlNorte, BorderLayout.NORTH);
        add(jlSul, BorderLayout.SOUTH);
        add(jlCentro, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Exercicio2b("Exercício 2b");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.prii.aulaGUI.frame1;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author geverson
 */
public class Exercicio2a extends JFrame {

    private JButton jbNorte;
    private JButton jbSul;
    private JButton jbLeste;
    private JButton jbOeste;

    public Exercicio2a(String titulo) {
        super(titulo);
        this.setSize(300, 150);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BorderLayout bl = new BorderLayout(5, 5);
        getContentPane().setLayout(bl);

        jbNorte = new JButton("Norte");
        jbSul = new JButton("Sul");
        jbLeste = new JButton("Leste");
        jbOeste = new JButton("Oeste");

        getContentPane().add(jbNorte, BorderLayout.NORTH);
        getContentPane().add(jbSul, BorderLayout.SOUTH);
        getContentPane().add(jbLeste, BorderLayout.EAST);
        getContentPane().add(jbOeste, BorderLayout.WEST);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Exercicio2a("Exercício 2a ");
    }
}

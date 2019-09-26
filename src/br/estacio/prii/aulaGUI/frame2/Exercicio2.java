/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.prii.aulaGUI.frame2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

/**
 *
 * @author geverson
 */
public class Exercicio2 extends JFrame {

    private JPanel jpTitulo, jpCentro, jpCentroJTA, jpCentroNav, jpCentroInc, jpCentroDec, jpCentroClear, jpRodape;
    private JLabel jlTitulo, jlRodape;
    private JTextArea jta;
    private JButton jbInc, jbDec, jbClear;

    public Exercicio2(String title) {
        super(title);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jpTitulo = new JPanel();
        jlTitulo = new JLabel("Simple Counter", JLabel.CENTER);
        jlTitulo.setFont(new Font("Times new roman", Font.BOLD, 30));
        jpTitulo.add(jlTitulo);

        jpCentro = new JPanel();
        jpCentroJTA = new JPanel();
        jta = new JTextArea("17", 40, 35);
        jta.setAlignmentX(SwingConstants.CENTER);
        jpCentroJTA.add(jta);

        jpCentro.add(jpCentroJTA);

        jpCentroNav = new JPanel();
        jpCentroInc = new JPanel();
        jpCentroDec = new JPanel();
        jbInc = new JButton("Inc(+)");
        jbInc.setFont(new Font("Times new roman", Font.BOLD, 20));
        jbInc.setForeground(Color.blue);
        jpCentroInc.add(jbInc);
        jpCentroInc.setLayout(new GridLayout(1, 1));
        jpCentroNav.add(jpCentroInc);

        jbDec = new JButton("Dec(-)");
        jbDec.setFont(new Font("Times new roman", Font.BOLD, 20));
        jbDec.setForeground(Color.blue);
        jpCentroDec.add(jbDec);
        jpCentroDec.setLayout(new GridLayout(1, 1));
        jpCentroNav.add(jpCentroDec);
        jpCentroNav.setLayout(new GridLayout(1, 2, 5, 5));
        jpCentro.add(jpCentroNav);

        jpCentroClear = new JPanel();
        jbClear = new JButton("Clear");
        jbClear.setFont(new Font("Times new roman", Font.BOLD, 20));
        jbClear.setForeground(Color.blue);
        jpCentroClear.add(jbClear);
        jpCentroClear.setLayout(new GridLayout(1, 1));
        jpCentro.add(jpCentroClear);
        jpCentro.setLayout(new GridLayout(3, 1, 5, 5));

        jpRodape = new JPanel();
        jlRodape = new JLabel("<Extenso>", JLabel.CENTER);
        jlRodape.setFont(new Font("Times new roman", Font.BOLD, 20));
        jpRodape.add(jlRodape);

        add(jpTitulo, BorderLayout.NORTH);
        add(jpCentro, BorderLayout.CENTER);
        add(jpRodape, BorderLayout.SOUTH);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Exercicio2("Exercício 2 Frames 2");
    }
}

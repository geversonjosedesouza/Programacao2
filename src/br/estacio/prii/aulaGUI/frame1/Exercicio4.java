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
import javax.swing.JTextField;

/**
 *
 * @author geverson
 */
public class Exercicio4 extends JFrame {
    
    private JLabel jlPeso, jlAltura;
    private JTextField jtfPeso, jtfAltura, jtfResultado;
    private JButton jbCalcular;
    
    public Exercicio4(String title) {
        super(title);
        this.setSize(300, 150);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(4, 2));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jlPeso = new JLabel("Peso: ");
        jtfPeso = new JTextField(10);
        jlAltura = new JLabel("Altura: ");
        jtfAltura = new JTextField(10);
        jbCalcular = new JButton("Calcular");
        jtfResultado = new JTextField(10);
        
        this.add(new JLabel(""));
        this.add(new JLabel("Calcular IMC"));
        this.add(jlPeso);
        this.add(jtfPeso);
        this.add(jlAltura);
        this.add(jtfAltura);
        this.add(jbCalcular);
        this.add(jtfResultado);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Exercicio4("Exercício 4");
    }
}

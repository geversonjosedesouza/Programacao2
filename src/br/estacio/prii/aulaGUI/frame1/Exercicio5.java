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
public class Exercicio5 extends JFrame {

    private JLabel jlPeso, jlAltura;
    private JTextField jtfPeso, jtfAltura, jtfResultado;
    private JButton jbCalcular;

    public Exercicio5(String title) {
        super(title);
        this.setSize(700, 200);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(5, 6));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(new JLabel("Distancia: "));
        this.add(new JTextField(10));
        this.add(new JLabel("metros"));
        this.add(new JButton("Converter"));
        this.add(new JTextField(10));
        this.add(new JLabel("polegadas"));

        this.add(new JLabel("Massa: "));
        this.add(new JTextField(10));
        this.add(new JLabel("kilogramas"));
        this.add(new JButton("Converter"));
        this.add(new JTextField(10));
        this.add(new JLabel("libras"));

        this.add(new JLabel("Volume: "));
        this.add(new JTextField(10));
        this.add(new JLabel("litros"));
        this.add(new JButton("Converter"));
        this.add(new JTextField(10));
        this.add(new JLabel("galões"));

        this.add(new JLabel("Velocidade: "));
        this.add(new JTextField(10));
        this.add(new JLabel("km/h"));
        this.add(new JButton("Converter"));
        this.add(new JTextField(10));
        this.add(new JLabel("m/s"));

        this.add(new JLabel("Temperatura: "));
        this.add(new JTextField(10));
        this.add(new JLabel("°C"));
        this.add(new JButton("Converter"));
        this.add(new JTextField(10));
        this.add(new JLabel("°F"));
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Exercicio5("Exercício 5");
    }
}

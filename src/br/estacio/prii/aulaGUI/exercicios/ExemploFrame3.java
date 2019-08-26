/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.prii.aulaGUI.exercicios;

import javax.swing.JFrame;

/**
 *
 * @author geverson
 */
public class ExemploFrame3 extends JFrame {

    public ExemploFrame3() {
        JFrame frame = new JFrame();
        frame.setTitle("Exemplo Frame - 03");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ExemploFrame3();
    }
}

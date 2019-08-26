/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.prii.aulaGUI.exemplos;

import javax.swing.JFrame;

/**
 *
 * @author geverson
 */
public class ExemploGUI {
    
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setVisible(true);
        janela.setSize(400, 300);
        janela.setTitle("Meu Primeiro Programa GUI");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

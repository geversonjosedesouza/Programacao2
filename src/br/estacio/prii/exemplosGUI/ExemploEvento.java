/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.prii.exemplosGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author geverson
 */
public class ExemploEvento implements ActionListener {

    public void clicarBotao() {
        JOptionPane.showMessageDialog(null, "Digite seu nome no local apropriado!");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "Ok") {
            clicarBotao();
        }
    }
}

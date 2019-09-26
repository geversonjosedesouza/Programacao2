/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.prii.aulaGUI.exemplos;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author geverson
 */
public class TestePainel extends JFrame {
    
    private JPanel jpTopo, jpCentro;
    
    public TestePainel(String title) {
        super(title);
        this.setSize(300, 150);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jpTopo = new JPanel();
        jpTopo.add(new JLabel("teste", JLabel.CENTER));
        
        jpCentro = new JPanel();
        jpCentro.add(new JLabel("Nome: ", (int) JLabel.LEFT_ALIGNMENT));
        jpCentro.add(new JTextField(10));
        jpCentro.add(new JLabel("Senha: ", (int) JLabel.LEFT_ALIGNMENT));
        jpCentro.add(new JPasswordField(10));
        jpCentro.setLayout(new GridLayout(2, 2));
        
        add(jpTopo, BorderLayout.NORTH);
        add(jpCentro, BorderLayout.CENTER);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TestePainel("Teste Paines");
    }
}

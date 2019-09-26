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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author geverson
 */
public class Exercicio3 extends JFrame {

    private JPanel jpTopo, jpCentro, jpOperacao, jpOperacaoNumero1,
            jpOperacaoNumero2, jpOperacaoSinal, jpCentroResultado, jpCentroResultadoJL, jpCentroResultadoJTF,
            jpCentroEstatistica, jpCentroEstatisticaAcerto, jpCentroEstatisticaErro;
    private JLabel jlNomeTeste, jlNumero1, jlNumero2, jlSinal, jlResultado,
            jlAcerto, jlErro;
    private JComboBox<String> jcbOperacoes;
    private JTextField jtfResultado;
    private JTextArea jta;
    private JButton jbInc, jbDec, jbClear;

    public Exercicio3(String title) {
        super(title);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jpTopo = new JPanel();
        jlNomeTeste = new JLabel("Teste de Matemática", JLabel.LEFT);
        jlNomeTeste.setFont(new Font("Times new roman", Font.BOLD, 20));
        jlNomeTeste.setForeground(Color.blue);
        jcbOperacoes = new JComboBox<>();
        jcbOperacoes.addItem("Adição");
        jcbOperacoes.addItem("Subtração");
        jcbOperacoes.addItem("Divisão");
        jcbOperacoes.addItem("Multiplicação");
        jcbOperacoes.setAlignmentX(JComboBox.LEFT_ALIGNMENT);
        jpTopo.setLayout(new GridLayout(1, 2, 5, 5));
        jpTopo.add(jlNomeTeste);
        jpTopo.add(jcbOperacoes);

        jpCentro = new JPanel();
        jpCentro.add(new JPanel());
        jpOperacao = new JPanel();
        jpOperacaoNumero1 = new JPanel();
        jlNumero1 = new JLabel("25", JLabel.CENTER);
        jlNumero1.setFont(new Font("Times new roman", Font.BOLD, 20));
        jlNumero1.setForeground(Color.blue);
        jpOperacaoNumero1.add(jlNumero1);
        jpOperacao.add(jpOperacaoNumero1);

        jpOperacaoSinal = new JPanel();
        jlSinal = new JLabel("+", JLabel.CENTER);
        jlSinal.setFont(new Font("Times new roman", Font.BOLD, 20));
        jlSinal.setForeground(Color.blue);
        jpOperacaoSinal.add(jlSinal);
        jpOperacao.add(jpOperacaoSinal);

        jpOperacaoNumero2 = new JPanel();
        jlNumero2 = new JLabel("48", JLabel.CENTER);
        jlNumero2.setFont(new Font("Times new roman", Font.BOLD, 20));
        jlNumero2.setForeground(Color.blue);
        jpOperacaoNumero2.add(jlNumero2);
        jpOperacao.add(jpOperacaoNumero2);
        jpOperacao.setLayout(new GridLayout(1, 3));
        jpCentro.add(jpOperacao);

        jpCentroResultado = new JPanel();
        jpCentroResultadoJL = new JPanel();
        jlResultado = new JLabel("Resultado: ");
        jpCentroResultadoJL.add(jlResultado);
        jpCentroResultado.add(jpCentroResultadoJL);

        jpCentroResultadoJTF = new JPanel();
        jtfResultado = new JTextField("54", 15);
        jpCentroResultadoJTF.add(jtfResultado);
        jpCentroResultado.add(jpCentroResultadoJTF);
        jpCentroResultado.setLayout(new GridLayout(1, 2));
        jpCentro.add(jpCentroResultado);

        jpCentroEstatistica = new JPanel();
        jpCentroEstatisticaAcerto = new JPanel();
        jlAcerto = new JLabel("Acertos: 999", JLabel.LEFT);
        jpCentroEstatisticaAcerto.add(jlAcerto);
        jpCentroEstatisticaAcerto.setLayout(new GridLayout(1, 1));
        jpCentroEstatistica.add(jpCentroEstatisticaAcerto);

        jpCentroEstatisticaErro = new JPanel();
        jlErro = new JLabel("Erros: 999", JLabel.RIGHT);
        jpCentroEstatisticaErro.add(jlErro);
        jpCentroEstatisticaErro.setLayout(new GridLayout(1, 1));
        jpCentroEstatistica.add(jpCentroEstatisticaErro);
        jpCentroResultado.setLayout(new GridLayout(1, 2));
        jpCentro.add(jpCentroEstatistica);
//
//        jpCentroClear = new JPanel();
//        jbClear = new JButton("Clear");
//        jbClear.setFont(new Font("Times new roman", Font.BOLD, 20));
//        jbClear.setForeground(Color.blue);
//        jpCentroClear.add(jbClear);
//        jpCentroClear.setLayout(new GridLayout(1, 1));
//        jpCentro.add(jpCentroClear);
        jpCentro.setLayout(new GridLayout(4, 1, 5, 5));
//
//        jpRodape = new JPanel();
//        jlRodape = new JLabel("<Extenso>", JLabel.CENTER);
//        jlRodape.setFont(new Font("Times new roman", Font.BOLD, 20));
//        jpRodape.add(jlRodape);

        add(jpTopo, BorderLayout.NORTH);
        add(jpCentro, BorderLayout.CENTER);
//        add(jpRodape, BorderLayout.SOUTH);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Exercicio3("Exercício 2 Frames 2");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package testes_java;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Testes_java extends JFrame implements KeyListener {
    private JTextArea areaTexto;

    public Testes_java() {
        // Configura a janela
        setTitle("Teste de KeyListener");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria a área de texto
        areaTexto = new JTextArea();
        add(areaTexto);

        // Adiciona o KeyListener
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Obtém o caracter da tecla pressionada
        char keyChar = e.getKeyChar();

        // Imprime o caracter da tecla pressionada na área de texto
        areaTexto.append("Tecla pressionada: " + keyChar + "\n");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Não faz nada
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Não faz nada
    }

    public static void main(String[] args) {
        // Cria a janela e a exibe
        Testes_java janela = new Testes_java();
        janela.setVisible(true);
    }
}

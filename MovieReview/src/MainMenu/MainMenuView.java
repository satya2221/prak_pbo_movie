/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainMenu;

import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Orenji
 */
public class MainMenuView extends JFrame{
    JFrame frame = new JFrame("Main Menu");
    JLabel llogin = new JLabel("Mau Pilih yang mana?");
    JButton b_input = new JButton("Input");
    JButton b_update = new JButton("Update");
    JButton b_lihat = new JButton("Lihat Data");

    public MainMenuView(){
        frame.setLayout(null);
        frame.setSize(450,525);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation (DISPOSE_ON_CLOSE);
    }
}

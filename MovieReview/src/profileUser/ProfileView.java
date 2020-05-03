/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profileUser;

import java.awt.*;
import javax.swing.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Satya
 */
public class ProfileView {
    private String username;
    Font font_penting = new Font("SanSerif", Font.BOLD, 16);
    Font font_judul = new Font("SanSerif", Font.PLAIN, 22);
    Font font_isi = new Font("SanSerif", Font.PLAIN, 14);
    
    JFrame frame = new JFrame("Profile");
    
    JLabel lprofile,lnama,Lranknya,piclabel;
    JButton b_update = new JButton("Ubah data");
    
    JLabel lranking = new JLabel("Rank Anda");

    JButton b_lihat_data_review = new JButton("Review Anda");

    public ProfileView(String username) {
        this.username = username;
        lnama = new JLabel(username);
        lprofile = new JLabel("Profile anda");
        piclabel = new JLabel(new ImageIcon("D:\\onedrive\\Pictures\\KTPku.jpg"));
        Lranknya = new JLabel("Eaaa");
        
        frame.setLayout(null);
        frame.setSize(450,525);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation (DISPOSE_ON_CLOSE);
        
        frame.add(lprofile);
        lprofile.setFont(font_judul);
        lprofile.setBounds(165, 25, 125, 25);
        
        frame.add(piclabel);
        piclabel.setBounds(155,50,50,50);
        
        frame.add(lnama);
        lnama.setFont(font_penting);
        lnama.setBounds(190, 140, 130, 25);
        
        frame.add(b_update);
        b_update.setBounds(155, 175, 120, 25);
        
        frame.add(lranking);
        lranking.setFont(font_judul);
        lranking.setBounds(165, 210, 125, 25);
        
        frame.add(Lranknya);
        Lranknya.setFont(font_penting);
        Lranknya.setBounds(160, 240, 130, 25);
        
        frame.add(b_lihat_data_review);
        b_lihat_data_review.setBounds(155, 275, 115, 60);
        
    }
    
//    public static void main(String[] args) {
//        new ProfileView("Satya");
//    }
    public String getUsername() {
        return username;
    }
}

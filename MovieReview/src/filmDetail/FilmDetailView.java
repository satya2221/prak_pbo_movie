/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmDetail;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Satya
 */
public class FilmDetailView {
    private int id_movie;
    Font fontt = new Font("SanSerif", Font.PLAIN, 20);
    Font font_isi = new Font("SanSerif", Font.PLAIN, 14);
    
    JLabel lprofile,lnama,Lranknya,piclabel;
    
    JTable tabel;
    Container c;
    Object[] kolom = {"ID","Film","Sutradara","Nilai"};
    DefaultTableModel model;
    JScrollPane pane;
    
    JFrame frame = new JFrame("Film");

    public FilmDetailView(int idMovie) {
        this.id_movie = idMovie;
        
    }
    
    
}

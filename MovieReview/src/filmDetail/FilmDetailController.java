/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmDetail;

import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Satya
 */
public class FilmDetailController {
    FilmDetailModel modelnya;
    FilmDetailView viewnya;

    public FilmDetailController(FilmDetailModel modelnya, FilmDetailView viewnya) {
        this.modelnya = modelnya;
        this.viewnya = viewnya;
        
        String filmnya [] = modelnya.tampilkanData(viewnya.getId_movie());
        viewnya.ljudul.setText(filmnya[1]);
        viewnya.lgenre.setText(filmnya[2]);
        viewnya.Ldurasi.setText(filmnya[0]);
        viewnya.lnilai.setText(filmnya[4]);
        viewnya.lsutradara.setText(filmnya[3]);
        
        if (modelnya.banyaknyaReview(viewnya.getId_movie()) != 0) {
            String reviewnya[][] = modelnya.tampilkanReview(viewnya.getId_movie());
            viewnya.tabel.setModel(new JTable(reviewnya, viewnya.kolom).getModel());
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
    }
    
    
}

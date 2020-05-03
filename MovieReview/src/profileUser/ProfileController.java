/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profileUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Satya
 */
public class ProfileController {
    ProfileModel modelnya;
    ProfileView viewnya;

    public ProfileController(ProfileModel modelnya, ProfileView viewnya) {
        this.modelnya = modelnya;
        this.viewnya = viewnya;
        
        modelnya.updaterank(viewnya.getUsername());
        String ranknya = modelnya.tampilkanrank(viewnya.getUsername())+" reviewer";
        viewnya.Lranknya.setText(ranknya);
        
        viewnya.b_update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //menuju edit data diri
            }
        });
        
        viewnya.b_lihat_data_review.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //menuju review anda
            }
        });
    }

    
    
}

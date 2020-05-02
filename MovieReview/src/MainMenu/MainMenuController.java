/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Orenji
 */
public class MainMenuController {
    MainMenuView mainMenuView;

    public MainMenuController(MainMenuView mainMenuView) {
        this.mainMenuView = mainMenuView;
        
        System.out.println(mainMenuView.getUsername());
        
        this.mainMenuView.b_input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                // pindah ke bagian input
            }
        });
        
        
        this.mainMenuView.b_update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                // pindah ke bagian update
            }
        });
        
        
        this.mainMenuView.b_lihat_data_user.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                // pindah ke data review user
            }
        });
        
        
        this.mainMenuView.b_lihat_data_semua.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                // pindah ke data review semua user
            }
        });
        
    }
    
    
}

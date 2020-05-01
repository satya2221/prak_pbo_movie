/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginNya;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.*;

/**
 *
 * @author Satya
 */
public class LoginController {
    LoginModel modelnya;
    LoginView viewnya;

    public LoginController(LoginModel modelnya, LoginView viewnya) {
        this.modelnya = modelnya;
        this.viewnya = viewnya;
        
        viewnya.b_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               if (viewnya.getFusername().equals("")
                        || viewnya.getFpassword().equals("")) {
                    JOptionPane.showMessageDialog(null, "field kosong");
                } else {
                    String nama = viewnya.getFusername();
                    String pass = viewnya.getFpassword();
                    modelnya.cekLogin(nama, pass);
                    viewnya.fusername.setText("");
                    viewnya.fpassword.setText("");          
                }
            }
        });
        
        viewnya.b_reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewnya.fusername.setText("");
                viewnya.fpassword.setText("");
            }
        });
        
        viewnya.b_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //pindah ke halaman register
            }
        });
    }
}

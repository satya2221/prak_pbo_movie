/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profileUser;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Satya
 */
public class ProfileModel {
    static final String drivernya = "com.mysql.jdbc.Driver";
    static final String DBurl = "jdbc:mysql://localhost/pbo_movie";
    static final String DBusername = "root";
    static final String DBpassword = "";
    Connection koneksi;
    Statement statement;

    public ProfileModel() {
        try {
             Class.forName(drivernya);
             koneksi = DriverManager.getConnection(DBurl,DBusername, DBpassword);
             System.out.println("Koneksi berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("Koneksi gagal!");
        }
    }
//    public int banyaknyaRev(){
//        int jmlData=0;
//        try {
//            statement = (Statement)koneksi.createStatement();
//            String query = "SELECT * FROM `movie`";
//            ResultSet hasilnya = statement.executeQuery(query);
//                while (hasilnya.next()){
//                    jmlData++;
//                }
//            return jmlData;
//        } catch (Exception countData) {
//            JOptionPane.showMessageDialog(null, countData.getMessage(),"Hasil",JOptionPane.ERROR_MESSAGE);
//            return 0;
//        }
//    }
    
    public String tampilkanrank(String username){
        int jmlData=0;
        try {
            statement = (Statement)koneksi.createStatement();
            String query = "SELECT * FROM `review` WHERE `username`= '"+username+"'";
            ResultSet hasilnya = statement.executeQuery(query);
                while (hasilnya.next()){
                    jmlData++;
                }
            if (jmlData<3){
                return "baby";
            }
                else if(jmlData>3 && jmlData<5){
                    return "grown up";
                }
                    else{
                        return "warrior";
                    }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Hasil",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public void updaterank(String username){
        String rank=tampilkanrank(username);
        String idRank;
        if (rank=="baby") {
            idRank = "001";
        }
        else if (rank=="grown up"){
            idRank = "005";
        }
        else{
            idRank = "010";
        }
        try {
            statement = koneksi.createStatement();
            String query = "UPDATE `user` SET `id_ranks`='"+idRank+"' WHERE `username` = '"+username+"'  ";
            statement.executeUpdate(query);
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getMessage(),"Hasil",JOptionPane.ERROR_MESSAGE);
        }
    }
}

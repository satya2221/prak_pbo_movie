/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hitung;

/**
 *
 * @author Orenji
 */
public class RataRataSemua extends RataRataUser{
    private int nilai;

    public RataRataSemua(int nilai, int nilai1, int nilai2, int nilai3) {
        super(nilai1, nilai2, nilai3);
        this.nilai = nilai;
    }

    @Override
    public int hitung() {
        return (super.hitung() + nilai)/2;
    }
    
    
}

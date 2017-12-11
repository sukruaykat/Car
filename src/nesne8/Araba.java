/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesne8;

import javax.swing.JOptionPane;

/**
 *
 * @author artuklu
 */
public class Araba {
    final static int enYuksekHiz = 180;
    private int simdikiHiz;
    final static int enDusukHiz = 0;
    final static int enYuksekVites = 6;
    private int simdikiVites;
    final static int enDusukVites = 1;
    private boolean calisiyor;
    
    public Araba(){
        calisiyor = false;
        simdikiHiz = 0;
        simdikiVites = 1;
    }
    
    public Araba(boolean baslangicDurumu, int baslangicHizi, int baslangicVitesi){
        calisiyor = baslangicDurumu;
        simdikiHiz = baslangicHizi;
        simdikiVites = baslangicVitesi;
    }
    
    public void kontakCevir(){
        if (calisiyor==true) {
            calisiyor = false;
        } else {
            calisiyor = true;
        }
    }
    
    public void gazaBas(int artisMiktari){
        if (calisiyor==true) {
            if ((simdikiHiz+artisMiktari)>enYuksekHiz) {
                    simdikiHiz = enYuksekHiz;
            } else {
                simdikiHiz = simdikiHiz + artisMiktari;
            }
        }
    }
    
    public void frenYap(int azalisMiktari){
        if (calisiyor==true) {
            if ((simdikiHiz-azalisMiktari)<enDusukHiz) {
                    simdikiHiz = enDusukHiz;
            } else {
                simdikiHiz = simdikiHiz - azalisMiktari;
            }
        }
    }
    
    public void vitesArtir(){
        if (simdikiVites<enYuksekVites) {
            simdikiVites++;
        }
    }
    
    public void vitesAzalt(){
        if (simdikiVites>enDusukVites) {
            simdikiVites--;
        }
    }
    
    public void durumYazdir(){
        JOptionPane.showMessageDialog(null, "Çalışma Durumu: "+calisiyor
                +"\nArabanın Hızı: "+simdikiHiz+"\nVites: "+simdikiVites);
    }
    
}

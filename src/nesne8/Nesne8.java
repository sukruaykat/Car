/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesne8;

/**
 *
 * @author artuklu
 */
public class Nesne8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Araba Toyota = new Araba();
        Araba Volvo = new Araba(true,60,3);
        
        Toyota.durumYazdir();
        Toyota.kontakCevir();
        Toyota.vitesArtir();
        Toyota.gazaBas(80);
        Toyota.vitesArtir();
        Toyota.frenYap(30);
        Toyota.vitesAzalt();
        Toyota.durumYazdir();
        
    }
    
}

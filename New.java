/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstruktorparameter;

/**
 *
 * @author zafri
 */
public class New {
    int panjang,lebar,hasil;
    
    void Rumus(int lebar,int panjang){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    void hitung(){
      hasil = panjang*lebar;
        System.out.println("Luas Persegi Panjang = "+hasil);
    }
}

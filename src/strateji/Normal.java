/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strateji;

/**
 *
 * @author AYŞE
 */
public class Normal extends Davranis {

    @Override
    public void durumSet() {
        durum = 0;
    }

    @Override
    public void renkSet() {
        renk = "Sari";
    }

    @Override
    public void hizKatSet() {
        hizlanma_katsayi = 1;
    }

    @Override
    public void maksHizSet() {
        maks_hiz = 200;
    }

    @Override
    public void nitroSet() {
        nitro = false;
    }

}

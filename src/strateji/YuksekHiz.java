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
public class YuksekHiz extends Davranis {

    @Override
    public void durumSet() {
        durum = 1;
    }

    @Override
    public void renkSet() {
        renk = "Turuncu";
    }

    @Override
    public void hizKatSet() {
        hizlanma_katsayi = 2;
    }

    @Override
    public void maksHizSet() {
        maks_hiz = 400;
    }

    @Override
    public void nitroSet() {
        nitro = false;
    }

}

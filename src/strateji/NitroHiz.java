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
public class NitroHiz extends Davranis {

    @Override
    public void durumSet() {
        durum = 2;
    }

    @Override
    public void renkSet() {
        renk = "Kırmızı";
    }

    @Override
    public void hizKatSet() {
        hizlanma_katsayi = 3;
    }

    @Override
    public void maksHizSet() {
        maks_hiz = 600;
    }

    @Override
    public void nitroSet() {
        nitro = true;
    }

}

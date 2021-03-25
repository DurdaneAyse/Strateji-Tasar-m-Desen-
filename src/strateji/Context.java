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
public class Context {
    Davranis d;
    public void setDavranis(Davranis davranis)
    {
        d=davranis;
    }
    public void calistir(){
        d.durumSet();
        d.hizKatSet();
        d.maksHizSet();
        d.nitroSet();
        d.renkSet();
        d.Yazdir();
    }
}

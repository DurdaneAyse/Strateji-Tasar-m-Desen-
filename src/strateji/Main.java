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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Context c=new Context();
          System.out.println("Arac normal hızla ilerliyor.");
          c.setDavranis(new Normal());
          c.calistir();
          System.out.println("Araç yüksek hıza çıktı..");
          c.setDavranis(new YuksekHiz());
          c.calistir();
          System.out.println("Araç nitro hıza çıktı");
          c.setDavranis(new NitroHiz());
          c.calistir();

    }
    
}

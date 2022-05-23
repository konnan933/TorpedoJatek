
package main;

import java.util.Scanner;

public class Hajo {
    private int[] poz = new int[3];
    private int[] palya = new int[7];
    private int talalatSzam = 0;
    private int lovesSzam = 0;

    public Hajo() {
        setPoz(poz);
    }
    public void jatek(){
        while (talalatSzam < 3) {            
            lovesBe();
        }
        System.out.println("Elsüllyedt ennyi lövésből:"+lovesSzam);
        
    }
    public void setPoz(int[] poz) {
        int kezdoHely = (int) (Math.random() *(palya.length-poz.length+1));
        for (int i = 0; i < poz.length; i++) {
            this.poz[i] = kezdoHely;
            kezdoHely++;
        }
        
    }
    public void lovesBe(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Kérem adja emg hova szeretne lóni(1-7)");
        int poz = scr.nextInt()-1;
        talalat(poz);
        
    }
    
    
    public String talalat(int poz){
        int i = 0;
        while (i < this.poz.length && !(poz == this.poz[i])) {            
            i++;
        }
        if (i < this.poz.length) {
            System.out.println("Találat");
            talalatSzam++;
        }else{
            System.out.println("Nem talált");
        }
        lovesSzam++;
        return i < this.poz.length? "találat": "nem talált";
    }
    
}

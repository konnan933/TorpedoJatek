
package main;

public class Hajo {
    private int[] poz = new int[3];

    public Hajo() {
        setPoz(poz);
    }

    public void setPoz(int[] poz) {
        int kezdoHely = 3;//(int)Math.random()*5;
        for (int i = 0; i < poz.length; i++) {
            this.poz[i] = kezdoHely;
            kezdoHely++;
        }
        
    }
    
    
    
    public String talalat(int poz){
        int i = 0;
        while (i < this.poz.length && !(poz == this.poz[i])) {            
            i++;
        }
        return i < this.poz.length? "találat": "nem talált";
    }
    
}

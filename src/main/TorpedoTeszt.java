
package main;

public class TorpedoTeszt {
    
    
    public static void main(String[] args) {
        new TorpedoTeszt().tesztLovesTalalt(4);
    }

    public String tesztLovesTalalt(int poz) {
        Hajo hajo = new Hajo();
        String t = hajo.talalat(poz);
        assert t.equals("találat"):"nem jó a találat ellenörzése";
        return "Teszt";
    }
}

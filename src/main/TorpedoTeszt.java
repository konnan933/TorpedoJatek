
package main;

public class TorpedoTeszt {
    
    
    public static void main(String[] args) {
        new TorpedoTeszt().tesztLoves(4);
    }

    public String tesztLoves(int poz) {
        Hajo hajo = new Hajo();
        String t = hajo.talalat(poz);
        assert t.equals("találat"):"nem jó a találat ellenörzése";
        return "Teszt";
    }
}

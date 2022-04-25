package vonalprojekt;

public class VonalProgram {

    public static void main(String[] args) {
        Vonal v = new Vonal("piros", "sima", 15, 5);
        Vonal v1 = new Vonal("zöld", "szaggatott", 20);
        Vonal v2 = new Vonal(15);
        Vonal v3 = new Vonal();
        Vonal v4 = new Vonal("piros", 20);
        Vonal v5 = new Vonal("sárga", "dupla", 15);
        Vonal v6 = new Vonal("piros", "pontozott", 15);
        
        
        Vonal hibas = new Vonal(-5);
        
        /*System.out.println(v);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        
        System.out.println(hibas);*/
        System.out.println("v4: ");
        v4.rajzol();
        System.out.println("v: ");
        v.rajzol();
        System.out.println("v1: ");
        v1.rajzol();
        System.out.println("v5: ");
        v5.rajzol();
        System.out.println("v6: ");
        v6.rajzol();
    }

}

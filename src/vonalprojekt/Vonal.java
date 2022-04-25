package vonalprojekt;

public class Vonal {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    private String szin, tipus;
    private int hossz, eltolas;

    public Vonal() {
        this(1);
    }

    public Vonal(int hossz) {
        this("fekete", hossz);
    }

    public Vonal(String szin, int hossz) {
        this(szin, "sima", hossz);
    }

    public Vonal(String szin, String tipus, int hossz) {
        this(szin, tipus, hossz, 0);
    }

    public Vonal(String szin, String tipus, int hossz, int eltolas) {
        setHossz(hossz);
        setEltolas(eltolas);
        this.szin = szin;
        this.tipus = tipus;
    }

    @Override
    public String toString() {
        return "Vonal{" + "szin=" + szin + ", tipus=" + tipus + ", hossz=" + hossz + ", eltolas=" + eltolas + '}';
    }

    private void setHossz(int hossz) {
        if (hossz <= 0) {
            hossz = 1;
        }

        this.hossz = hossz;
    }

    public void setEltolas(int eltolas) {
        if (eltolas < 0) {
            eltolas = 0;
        }

        this.eltolas = eltolas;
    }

    public void rajzol() {
        //System.out.println("hossz: " + hossz);

        //eltolás:
        for (int i = 0; i < eltolas; i++) {
            System.out.print(" ");
        }

        //tipus:
        String jel = "_";
        if (tipus == "szaggatott") {
            jel = "_ ";
        } else if (tipus == "pontozott") {
            jel = ".";
        } else if (tipus == "dupla") {
            jel = "=";
        }

        //szín:
        String kiiras = ANSI_RESET;
        if (szin == "piros") {
            kiiras = ANSI_RED;
        } else if (szin == "sárga") {
            kiiras = ANSI_YELLOW;
        } else if (szin == "zöld") {
            kiiras = ANSI_GREEN;
        }

        //hossz:
        for (int i = 0; i < hossz; i++) {
            System.out.print(kiiras + jel);
        }

        System.out.print(ANSI_RESET);
        System.out.println("(" + hossz + ")");
    }

}

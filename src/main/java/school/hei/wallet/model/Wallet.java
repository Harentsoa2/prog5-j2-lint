package school.hei.wallet.model;

public class Wallet {
    private String couleur;
    private String taille;
    private int vola;
    private boolean opened;
    private boolean lost;

    public Wallet(String couleur, String taille, int montantInitial) {
        this.couleur = couleur;
        this.taille = taille;
        this.vola = 0;
        this.opened = false;
        this.lost = false;
        addVola(montantInitial);
    }

    public void open() {
        this.opened = true;
    }

    public void close() {
        this.opened = false;
    }

    public void addVola(int montant) {
        if (this.lost) {
            return;
        }
        if (!this.opened) {
            this.open();
        }
        this.vola += montant;
    }

    public int getVola() {
        return this.vola;
    }

    public String checkVola() {
        return "Solde actuel : " + this.vola + " Ar";
    }

    public void isLost() {
        this.lost = true;
    }
}


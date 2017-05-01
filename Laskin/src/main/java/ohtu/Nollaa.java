package ohtu;

import javax.swing.JTextField;

public class Nollaa implements Komento {
    private Sovelluslogiikka sovellus;
    private JTextField tuloskentta, syotekentta;
    private int arvo;

    public Nollaa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }

    public void suorita() {
        arvo = sovellus.tulos();
        sovellus.nollaa();
        tuloskentta.setText("" + sovellus.tulos());
    }

    public void peru() {
        sovellus.plus(arvo);
        tuloskentta.setText("" + sovellus.tulos());
    }
}
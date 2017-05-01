package ohtu;

import javax.swing.JTextField;

public class Nollaa implements Komento {
    private Sovelluslogiikka sovellus;
    private JTextField tuloskentta, syotekentta;

    public Nollaa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }

    public void suorita() {
        sovellus.nollaa();
        tuloskentta.setText("" + sovellus.tulos());
    }

    public void peru() {

    }
}
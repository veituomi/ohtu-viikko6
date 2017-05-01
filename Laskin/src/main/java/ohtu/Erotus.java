package ohtu;

import javax.swing.JTextField;

public class Erotus implements Komento {
    private Sovelluslogiikka sovellus;
    private JTextField tuloskentta, syotekentta;

    public Erotus(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }

    public void suorita() {
        int arvo = 0;
        try {
            arvo = Integer.parseInt(syotekentta.getText());
        } catch (Exception e) {
        }
        sovellus.miinus(arvo);
        tuloskentta.setText("" + sovellus.tulos());
    }

    public void peru() {

    }
}
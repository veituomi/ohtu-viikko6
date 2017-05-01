package ohtu;

import javax.swing.JTextField;

public class Summa implements Komento {
    private Sovelluslogiikka sovellus;
    private JTextField tuloskentta, syotekentta;
    private int arvo;

    public Summa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }

    public void suorita() {
        try {
            arvo = Integer.parseInt(syotekentta.getText());
        } catch (Exception e) {
        }
        sovellus.plus(arvo);
        tuloskentta.setText("" + sovellus.tulos());
    }

    public void peru() {
        sovellus.miinus(arvo);
        tuloskentta.setText("" + sovellus.tulos());
    }
}
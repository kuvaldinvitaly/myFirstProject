package lesson17;

import java.util.Date;

public class Otsiv {
    private int reiting;
    private String nameAvtora;
    private boolean trueRazmer;
    private boolean trueOpisanie;
    private boolean trueFoto;
    private String tema;
    private String otsiv;
    private Date datePublikasii;

    public int getReiting() {
        return reiting;
    }

    public void setReiting(int reiting) {
        this.reiting = reiting;
    }

    public String getNameAvtora() {
        return nameAvtora;
    }

    public void setNameAvtora(String nameAvtora) {
        this.nameAvtora = nameAvtora;
    }

    public boolean isTrueRazmer() {
        return trueRazmer;
    }

    public void setTrueRazmer(boolean trueRazmer) {
        this.trueRazmer = trueRazmer;
    }

    public boolean isTrueOpisanie() {
        return trueOpisanie;
    }

    public void setTrueOpisanie(boolean trueOpisanie) {
        this.trueOpisanie = trueOpisanie;
    }

    public boolean isTrueFoto() {
        return trueFoto;
    }

    public void setTrueFoto(boolean trueFoto) {
        this.trueFoto = trueFoto;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getOtsiv() {
        return otsiv;
    }

    public void setOtsiv(String otsiv) {
        this.otsiv = otsiv;
    }

    public Date getDatePublikasii() {
        return datePublikasii;
    }

    public void setDatePublikasii(Date datePublikasii) {
        this.datePublikasii = datePublikasii;
    }

    @Override
    public String toString() {
        return "Otsiv{" +
                "reiting=" + reiting +
                ", nameAvtora='" + nameAvtora + '\'' +
                ", trueRazmer=" + trueRazmer +
                ", trueOpisanie=" + trueOpisanie +
                ", trueFoto=" + trueFoto +
                ", tema='" + tema + '\'' +
                ", otsiv='" + otsiv + '\'' +
                ", datePublikasii=" + datePublikasii +
                '}';
    }
}

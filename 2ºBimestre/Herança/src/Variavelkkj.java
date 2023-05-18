public class Variavelkkj extends Gastoskk{

    private int tempokkj;

    public Variavelkkj(String nomekkj, double valorkkj, int tempokkj) {
        super(nomekkj, valorkkj);
        setTempokkj(tempokkj);
    }

    public int getTempokkj() {
        return tempokkj;
    }

    public void setTempokkj(int tempokkj) {
        this.tempokkj = tempokkj;
    }

    @Override
    public void mudarValorkkj(double valor){
        this.valorkkj = valor;
    }

}

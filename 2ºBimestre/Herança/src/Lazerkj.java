public class Lazerkj extends Gastoskk{

    Boolean importantekkj;

    public Lazerkj(String nome, double valor, Boolean importamte){
        super(nome, valor);
        setImportantekkj(importamte);
    }

    @Override
    public void mudarValorkkj(double valor){
        this.valorkkj = valor * 1.05;
    }

    public Boolean getImportantekkj() {
        return importantekkj;
    }

    public void setImportantekkj(Boolean importantekkj) {
        this.importantekkj = importantekkj;
    }
}

public class Pedidoskkj {
    private Clienteskkj clientekkk;
    private String produtokk;
    private float valorkkj;
    private String codigojkkj;

    public Pedidoskkj(Clienteskkj clientekkk, String produtokk, float valorkkj, String codigojkkj) {
        setClientekkk(clientekkk);
        setProdutokk(produtokk);
        setValorkkj(valorkkj);
        setCodigojkkj(codigojkkj);
    }

    public Clienteskkj getClientekkk() {
        return clientekkk;
    }

    public void setClientekkk(Clienteskkj clientekkk) {
        this.clientekkk = clientekkk;
    }

    public String getProdutokk() {
        return produtokk;
    }

    public void setProdutokk(String produtokk) {
        this.produtokk = produtokk;
    }

    public float getValorkkj() {
        return valorkkj;
    }

    public void setValorkkj(float valorkkj) {
        this.valorkkj = valorkkj;
    }

    public String getCodigojkkj() {
        return codigojkkj;
    }

    public void setCodigojkkj(String codigojkkj) {
        this.codigojkkj = codigojkkj;
    }
    public String nomeClientekkj(){
        return clientekkk.getNomekkkk();
    }
}
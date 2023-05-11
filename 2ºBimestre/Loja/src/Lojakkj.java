import java.util.ArrayList;

public class Lojakkj {

    private String nomek;
    private ArrayList<Clienteskkj> clientelakkj = new ArrayList<Clienteskkj>();
    private ArrayList<Pedidoskkj> pedidoskk = new ArrayList<Pedidoskkj>();

    public Lojakkj(String nomek) {
        setNome(nomek);
    }

    public String getNome() {
        return nomek;
    }

    public void setNome(String nomek) {
        this.nomek = nomek;
    }

    public void mostrarClientelakkj() {
        for (Clienteskkj i:clientelakkj){
            System.out.println("nome: " + i.getNomekkkk());
            System.out.println("cpf: " + i.getCpfkj());
            System.out.println("telefone: " + i.getTelefonekk());
        }
    }

    public void addClientelakkj(Clienteskkj umClientekkj) {
        this.clientelakkj.add(umClientekkj);
    }

    public void mostrarPedidoskk() {
        for (Pedidoskkj i: pedidoskk){
            System.out.println(i.nomeClientekkj());
            System.out.println(i.getProdutokk());
            System.out.println(i.getValorkkj());
            System.out.println(i.getCodigojkkj());
        }
    }

    public void addPedidoskk(Pedidoskkj umPedidokkj) {
        this.pedidoskk.add(umPedidokkj);
    }
}

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Clienteskkj clienteskk;
        Pedidoskkj pedidoskkj;
        Lojakkj louja = new Lojakkj("Bomb store");

        Byte decisao;
        String verif;
        String nome;
        String cpf;
        String telefone;

        Boolean loja_aberta = true;

        while(loja_aberta == true) {

            String catalogokk = "\n1.garotinho --> R$ 2.000.000,00\n2.homem gordo --> R$ 5.300.000,00\n3.magricelo --> R$ 18.450.000,00\n4.núcleo da chave de fenda --> R$ 20.500.000,00\n5.rast --> R$ 300.000.000,00\n\n";

            System.out.println("Bem vindo(a) a bomb Store, a melhor loja de bombas nucleares de São Paulo!!\nEscolha as bombas que quiser do seguinte catálogo, aproveite a promoção!!!" + catalogokk + "Digite o número do produto:\n\n");

            decisao = sc.nextByte();

            sc.nextLine();

            System.out.println("Digite seu nome:");
            nome = sc.nextLine();

            System.out.println("Digite seu cpf:\n");
            cpf = sc.nextLine();

            System.out.println("digite seu telefone:\n");
            telefone = sc.nextLine();

            louja.addPedidoskk(escolha_boumba(decisao, nome, cpf, telefone));

            System.out.println("É sua primeira vez fazendo um pedido na loja?(responda APENAS com sim ou não)");

            verif = sc.nextLine();


            if (verif.equals("sim")){

                louja.addClientelakkj(new Clienteskkj(nome, cpf, telefone));
            }

            System.out.println("Clientes de hoje até o momento: ");

            louja.mostrarClientelakkj();

            System.out.println("enquanto trabalha o vendedor pensa para si mesmo:\n\nDevo fechar a loja e ir dormir depois de virar a noite 3 vezes seguidas?(responda apenas com sim ou não)");
            verif = sc.nextLine();

            if (verif.equals("sim"))
                loja_aberta = false;
        }

    }

    public static Pedidoskkj escolha_boumba(Byte decisao, String nomekk, String cpfkk, String telefonekk){
        Pedidoskkj pridido;

        switch(decisao){

            case 1:
                pridido = new  Pedidoskkj(new Clienteskkj(nomekk, cpfkk, telefonekk), "garotinho", 2000000.00f, "01100010");
                break;

            case 2:
                pridido = new Pedidoskkj(new Clienteskkj(nomekk, cpfkk, telefonekk), "homem gordo", 5300000.00f, "01101001");
                break;

            case 3:
                pridido = new  Pedidoskkj(new Clienteskkj(nomekk, cpfkk, telefonekk), "magricelo", 18450000.00f, "01110100");
                break;

            case 4:
                pridido = new Pedidoskkj(new Clienteskkj(nomekk, cpfkk, telefonekk), "núcleo da chave de fenda", 20500000.00f, "01101111");
                break;

            case 5:
                pridido = new Pedidoskkj(new Clienteskkj(nomekk, cpfkk, telefonekk), "rast", 300000000.00f, "00110110");
                break;

            default:
                System.out.printf("aprende a digitar direito animal");
                return null;
        }
        return pridido;
    }
}
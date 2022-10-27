package bytebank;

public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDaGi = new Conta();
        contaDaGi.saldo = 100;
        contaDaGi.deposita(50);
        System.out.println(contaDaGi.saldo);

        boolean conseguiuRetirar = contaDaGi.saca(20);
        System.out.println(contaDaGi.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.saldo = 1000;

        if (contaDaMarcela.transfere(300, contaDaGi)){
            System.out.println("Transferência feita coom sucesso!");
        }else {
            System.out.println("Não conseguimos completar sua transferência...");
        }
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDaGi.saldo);



    }
}

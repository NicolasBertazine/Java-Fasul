public class Main {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.velocidadeAtual = 60;
        meuCarro.ano = 2014;
        meuCarro.cor = "Verde";
        meuCarro.modelo = "Corolla";

        meuCarro.status();
        meuCarro.freiar();
    }

}
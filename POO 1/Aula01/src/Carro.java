public class Carro {

    String cor;
    String modelo;
    int ano;
    double velocidadeAtual;

    public void status() {
        System.out.println("Carro");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano: " + this.ano);
        System.out.println("Velocidade Atual: " + this.velocidadeAtual);
    }

    public void acelerar() {
            System.out.println("Acelerando!");
            for ( double v = velocidadeAtual; v <= 100; v++ ) {
                System.out.println("Velocidade Atual: " + v);
            }
    }

    public void freiar() {
            if(velocidadeAtual == 0) {
                System.out.println("O Carro já está parado!");
            } else {
                System.out.println("Freiando!!");
                for ( double v = velocidadeAtual; v >= 0; v-- ) {
                    System.out.println("Velocidade Atual: " + v);
                }
                System.out.println("Parado!");
            }
    }


}

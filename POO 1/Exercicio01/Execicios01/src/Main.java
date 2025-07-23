public class Main {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();

        p1.nome = "Nícolas";
        p1.idade = 20;
        p1.altura = 1.85;
        p1.peso = 75;

        p1.apresentar();
        p1.calcularIMC();
        p1.fazerAniversario();

    }

}
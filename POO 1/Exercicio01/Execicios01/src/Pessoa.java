public class Pessoa {

    String nome;
    int idade;
    double altura;
    double peso;

    public void apresentar() {
        System.out.println("==== DADOS ====");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
        System.out.println("Peso: " + this.peso);
        System.out.println("===============");
    }

    public void fazerAniversario() {
        idade++;
        System.out.println("Feliz Aniversario!");
        System.out.println("Agora você tem " + idade + " anos.");
    }

    public double calcularIMC() {
        double imc =  peso / (altura * altura);
        System.out.println("O resultado do seu IMC é " + imc);
        return imc;
    }

}

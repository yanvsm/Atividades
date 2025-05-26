Programa simples em Java que permite criar dois carros, inserir suas informações, acelerar, frear e comparar qual ficou mais rápido. Ideal para praticar conceitos básicos de Programação Orientada a Objetos (POO).

Como usar
Clone ou baixe o projeto.

Abra no IntelliJ IDEA ou outra IDE Java.

Crie dois arquivos:

Carro.java → Classe com atributos e métodos.

Main.java → Classe principal com main().

Copie os códigos abaixo.

Execute o Main.java e siga as instruções no console.

Funcionalidades
Inserir marca, modelo e ano de dois carros.

Acelerar e frear cada carro.

Mostrar informações atualizadas.

Comparar qual carro está mais rápido.

Exemplo de uso
yaml
Copiar
Editar
Digite a marca do primeiro carro:
Ford
Digite o modelo do primeiro carro:
Ka
Digite o ano do primeiro carro:
2018
...
O Ka está mais rápido!
Código
Carro.java
java
Copiar
Editar
public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeAtual;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    public void acelerar(int quantidade) {
        velocidadeAtual += quantidade;
    }

    public void frear(int quantidade) {
        velocidadeAtual = Math.max(0, velocidadeAtual - quantidade);
    }

    public void mostrarInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
}
Main.java
java
Copiar
Editar
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Primeiro carro
        System.out.println("Digite a marca do primeiro carro:");
        String marca1 = input.nextLine();
        System.out.println("Digite o modelo:");
        String modelo1 = input.nextLine();
        System.out.println("Digite o ano:");
        int ano1 = input.nextInt();
        input.nextLine();

        Carro carro1 = new Carro(marca1, modelo1, ano1);

        // Segundo carro
        System.out.println("Digite a marca do segundo carro:");
        String marca2 = input.nextLine();
        System.out.println("Digite o modelo:");
        String modelo2 = input.nextLine();
        System.out.println("Digite o ano:");
        int ano2 = input.nextInt();

        Carro carro2 = new Carro(marca2, modelo2, ano2);

        // Acelerar e frear
        System.out.println("Quanto quer acelerar o " + modelo1 + "?");
        carro1.acelerar(input.nextInt());
        System.out.println("Quanto quer frear o " + modelo1 + "?");
        carro1.frear(input.nextInt());

        System.out.println("Quanto quer acelerar o " + modelo2 + "?");
        carro2.acelerar(input.nextInt());
        System.out.println("Quanto quer frear o " + modelo2 + "?");
        carro2.frear(input.nextInt());

        // Mostrar infos
        System.out.println("\nCarro 1:");
        carro1.mostrarInformacoes();
        System.out.println("\nCarro 2:");
        carro2.mostrarInformacoes();

        // Comparar
        System.out.println("\nComparando:");
        if (carro1.getVelocidadeAtual() > carro2.getVelocidadeAtual()) {
            System.out.println(modelo1 + " está mais rápido!");
        } else if (carro1.getVelocidadeAtual() < carro2.getVelocidadeAtual()) {
            System.out.println(modelo2 + " está mais rápido!");
        } else {
            System.out.println("Ambos estão na mesma velocidade!");
        }

        input.close();
    }
}
Requisitos
Java 8 ou superior

IntelliJ IDEA ou qualquer IDE Java

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Ford", "Mustang", 2022);

        System.out.println("Informações do Carro 1:");
        carro1.mostrarInformacoes();

        System.out.println("\nInformações do Carro 2:");
        carro2.mostrarInformacoes();

        System.out.println("\nAcelerando os carros:");
        carro1.acelerar(30);
        carro2.acelerar(50);

        System.out.println("\nFreando o carro 1:");
        carro1.frear(10);

        System.out.println("\nComparando velocidades:");
        if (carro1.getVelocidadeAtual() > carro2.getVelocidadeAtual()) {
            System.out.println(carro1 + " está mais rápido.");
        } else if (carro1.getVelocidadeAtual() < carro2.getVelocidadeAtual()) {
            System.out.println(carro2 + " está mais rápido.");
        } else {
            System.out.println("Os dois carros estão na mesma velocidade.");
        }

        System.out.println("\nInformações atualizadas do Carro 1:");
        carro1.mostrarInformacoes();

        System.out.println("\nInformações atualizadas do Carro 2:");
        carro2.mostrarInformacoes();
    }
}


class Carro {
    // Atributos
        private String marca;
    private String modelo;
    private int ano;
    private int velocidadeAtual;

    // Construtor
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;  // começa parado
    }

    // Método acelerar
    public void acelerar(int quantidade) {
        velocidadeAtual += quantidade;
        System.out.println(modelo + " acelerou " + quantidade + " km/h. Velocidade atual: " + velocidadeAtual + " km/h.");
    }

    // Método frear
    public void frear(int quantidade) {
        velocidadeAtual -= quantidade;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
        System.out.println(modelo + " freou " + quantidade + " km/h. Velocidade atual: " + velocidadeAtual + " km/h.");
    }

    // Método mostrar informações
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
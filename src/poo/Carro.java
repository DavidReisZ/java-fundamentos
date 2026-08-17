package poo;

public class Carro {
    String modelo;
    String cor;
    int velocidadeAtual;

    @Override
    public String toString() {
        return "Carro [modelo=" + modelo + ", cor=" + cor + ", velocidadeAtual=" + velocidadeAtual + "]";
    }

        void acelerar () {
            velocidadeAtual = velocidadeAtual + 10;
            System.out.println("O carro acelerou! Velocidade atual: " + velocidadeAtual);
        }
        void frear () {
            if (velocidadeAtual >= 10) {
                velocidadeAtual = velocidadeAtual - 10;
            } else {
                velocidadeAtual = 0;
            }
            System.out.println("O carro freou! Velocidade atual: " + velocidadeAtual);
        }
        void exibirInfo () {
            System.out.println("O modelo do carro é: " + modelo + " sua cor: " + cor + "e sua velocidade atual é: " + velocidadeAtual);
        }

    }



package poo;

public class CurrencyConverter {
    double calcular(double cotacao,double dolares) {
        double iof = dolares * 6 / 100;
        double dolaresComIof = dolares + iof;
        double reais = dolaresComIof * cotacao;
        return reais;
    }
}


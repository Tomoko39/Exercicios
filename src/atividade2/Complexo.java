package atividade2;

public class Complexo {
    double real;
    double imaginario;

    Complexo (double r, double i) {
        this.real = r;
        this.imaginario = i;
    }
    // real = a
    // imaginario = b
    // c.real = c
    // c.imaginario = d
    Complexo adiciona(Complexo n) {
        Complexo soma = new Complexo(0,0);
        soma.real = real + n.real;
        soma.imaginario = imaginario + n.imaginario;
        return soma;
    }
    Complexo subtrai(Complexo n) {
        Complexo diferenca = new Complexo(0, 0);
        diferenca.real = real - n.real;
        diferenca.imaginario = imaginario - n.imaginario;
        return diferenca; 
    }
    Complexo multiplica(Complexo n) {
        Complexo produto = new Complexo(0, 0);
        produto.real = real*n.real - imaginario*n.imaginario;
        produto.imaginario = real*n.imaginario + imaginario*n.real;
        return produto;
    }
    Complexo divide(Complexo n) {
        Complexo quociente = new Complexo(0, 0);
        double a = real;
        double b = imaginario;
        double c = n.real;
        double d = n.imaginario;
        quociente.real = (a*c + b*d) / (c*c + d*d);
        quociente.imaginario = (b*c - a*d) / (c*c + d*d);
        return quociente;
    }
    String converteParaString() {
        String string = String.format("%.2f + %.2fi", real, imaginario);
        return string;
    }
    public static void main(String[] args) {
        Complexo numero1 = new Complexo(1, 2);
        Complexo numero2 = new Complexo(3, 4);

        System.out.println("c1 = " + numero1.converteParaString());
        System.out.println("c2 = " + numero2.converteParaString());

        Complexo soma = numero1.adiciona(numero2);
        System.out.println("c1 + c2 = " + soma.converteParaString());

        Complexo subtracao = numero1.subtrai(numero2);

        System.out.println("c1 - c2 = " + subtracao.converteParaString());

        Complexo multiplicacao = numero1.multiplica(numero2);

        System.out.println("c1 * c2 = " + multiplicacao.converteParaString());

        Complexo divisao = numero1.divide(numero2);

        System.out.println("c1 / c2 = " + divisao.converteParaString());
    }
}

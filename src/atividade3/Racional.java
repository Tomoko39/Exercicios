package atividade3;

public class Racional {
    int numerador;
    int denominador;

    Racional (int numerador, int denominador) {
        int mdc = MDC(numerador, denominador);
            this.numerador = numerador / mdc;
            this.denominador = denominador / mdc;
            if (this.denominador < 0){
                this.numerador = -1 * this.numerador;
                this.denominador = -1 * this.denominador;
            }
        
    }

    Racional adiciona(Racional r) {
        int a = this.numerador;
        int b = this.denominador;
        int c = r.numerador;
        int d = r.denominador;
        int resDen = b * d;
        int resNum = a*d + b*c;
        Racional res = new Racional(resNum, resDen);
        return res;
    }

    Racional subtrai(Racional r) {
        int a = this.numerador;
        int b = this.denominador;
        int c = r.numerador;
        int d = r.denominador;
        int resDen = b * d;
        int resNum = a*d - b*c;
        Racional res = new Racional(resNum, resDen);
        return res;
    }

    Racional multiplica(Racional r) {
        int resNum = this.numerador * r.numerador;
        int resDen = this.denominador * r.denominador;
        Racional res = new Racional(resNum, resDen);
        return res;
    }

    Racional divide(Racional r) {
        int resNum = this.numerador * r.denominador;
        int resDen = this.denominador * r.numerador;
        Racional res = new Racional(resNum, resDen);
        return res;
    }

    boolean igual(Racional r) {
        if (this.numerador == r.numerador && this.denominador == r.denominador) {
            return true;
        }
        else {
            return false;
        }
    }

    String converteParaString() {
        String string = String.format("%d/%d", numerador, denominador);
        return string;
    }

    static int MDC(int a, int b) {
        int r1;
        int r2;
        if (a >= b){
            r1 = a;
            r2 = b;
        }
        else {
            r1 = b;
            r2 = a;
        }
        
        while (r2 != 0){
            int r = r1 % r2;
            r1 = r2;
            r2 = r;
        }
        return r1;
    }

    static int MMC(int a, int b){
        if (a == 0 && b ==0){
            return 0;
        }
        int mmc = a * b / MDC(a,b);
        return mmc;
    }

    /*public static void main(String[] args) {
        Racional a = new Racional(1, 2);
        Racional b = new Racional(-1, 3);
        Racional c = new Racional(1, -3);
        Racional d = new Racional(-1, -2);
        Racional e = new Racional(2, 4);

        System.out.printf("%s %s %s %s\n", a, b, c, d);
        System.out.println(a.converteParaString());
        System.out.println(b.converteParaString());
        System.out.println(c.converteParaString());
        System.out.println(d.converteParaString());
        System.out.println(e.converteParaString());
    }
        */
}

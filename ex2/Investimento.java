

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Investimento {

    protected double valorInicial;
    protected double jurosMensais;

    public Investimento(double valorInicial, double jurosMensais){
        this.valorInicial = valorInicial;
        this.jurosMensais = jurosMensais;
    }

    public double calcularLucro(int meses){
        double resultado = (valorInicial * Math.pow(1 + jurosMensais,meses)) - valorInicial;

        BigDecimal bd = new BigDecimal(resultado).setScale(2, RoundingMode.HALF_UP);
        double retorno = bd.doubleValue();

        return retorno;
    }



}
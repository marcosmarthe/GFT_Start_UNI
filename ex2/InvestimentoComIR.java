

import java.math.BigDecimal;
import java.math.RoundingMode;

public class InvestimentoComIR extends Investimento{
    public InvestimentoComIR(double valorInicial, double jurosMensais) {
        super(valorInicial, jurosMensais);
    }

    @Override
    public double calcularLucro(int meses) {
        double RetornosemIR = super.calcularLucro(meses);
        double juros;
        if(meses < 6){
             juros = 0.225;
        }else if(meses < 12){
            juros = 0.20;
        }else if(meses < 24){
            juros = 0.175;
        }else{
            juros = 0.15;
        }
        double resultado = (1 - juros) * RetornosemIR;

        BigDecimal bd = new BigDecimal(resultado).setScale(2, RoundingMode.HALF_UP);
        double retorno = bd.doubleValue();

        return retorno;
    }
}


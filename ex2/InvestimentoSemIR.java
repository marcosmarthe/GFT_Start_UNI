

public class InvestimentoSemIR extends Investimento{
    public InvestimentoSemIR(double valorInicial, double jurosMensais) {
        super(valorInicial, jurosMensais);
    }

    @Override
    public double calcularLucro(int meses) {
        if(valorInicial < 1000.00){
            System.out.println("O valor Inicial não pode ser menor que R$1000");
            return 0;
        }else {
            return super.calcularLucro(meses);
        }
    }
}

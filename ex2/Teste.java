

public class Teste {

    public static void main(String[] args){
        InvestimentoComIR investimentoComIR = new InvestimentoComIR(5000.00,0.012);
        double retornoComIR = investimentoComIR.calcularLucro(17);
        System.out.println("Retorno de investimento com IR: R$"+retornoComIR);

        InvestimentoSemIR investimentoSemIR = new InvestimentoSemIR(3000.00, 0.007);
        double RetornosemIR = investimentoSemIR.calcularLucro(10);
        System.out.println("Retorno de investimento sem IR: R$"+RetornosemIR);
    }

}

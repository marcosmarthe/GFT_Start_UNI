import ex2.*;

import java.util.Scanner;

public class SimulaLucro {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        double valorInicial = scanner.nextInt();

        for(int mes = 1; mes <= 36; mes++){
            InvestimentoComIR investimentoComIR = new InvestimentoComIR(valorInicial,0.0035);
            double retornoComIR = investimentoComIR.calcularLucro(mes);

            InvestimentoSemIR investimentoSemIR = new InvestimentoSemIR(valorInicial, 0.003);
            double retornoSemIR = investimentoSemIR.calcularLucro(mes);

            System.out.println("Mês : "+mes+" | Investimento sem IR: "+retornoSemIR+" | Investimento com IR: "+retornoComIR);
        }
    }
}
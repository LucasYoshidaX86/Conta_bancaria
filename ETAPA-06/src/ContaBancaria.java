//Cria classe ContaBancaria com todos atributos requisitados na atividade.
public class ContaBancaria {
    private double saldo; 
    private int contadorConsultas; 

    // Constructor para inicializar atributos criados.
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
        this.contadorConsultas = 0;
    }

    // Depósito com a taxa incluida.
    public void depositar(double valor) {
        double taxa = valor * 0.01; 
        saldo += (valor - taxa); 
        System.out.println("Depósito realizado: R$" + valor + ". Taxa: R$" + taxa);
    }

    // Saque com a taxa incluida.
    public void sacar(double valor) {
        double taxa = valor * 0.005; 
        if (valor + taxa > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            saldo -= (valor + taxa); 
            System.out.println("Saque realizado: R$" + valor + ". Taxa: R$" + taxa);
        }
    }

    // Consulta de saldo, onde após 5 consultas, é crobrado uma taxa e utiliza um contador para saber a quantidade de pesquisas feitas, incrementando +1.
    public double consultarSaldo() {
        contadorConsultas++; 
        if (contadorConsultas % 5 == 0) {
            saldo -= 0.10; 
            System.out.println("Taxa de R$0,10 cobrada por consulta.");
        }
        return saldo;
    }
}
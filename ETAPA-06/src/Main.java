public class Main {
    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria(0.0); 

        // Depósitos
        conta.depositar(275.0); 
        conta.depositar(150.0); 

        // Saques
        conta.sacar(100.0); 
        conta.sacar(55.0); 

        // Consultando saldo
        System.out.println("Saldo atual: R$" + conta.consultarSaldo());
        System.out.println("Saldo atual: R$" + conta.consultarSaldo());
        System.out.println("Saldo atual: R$" + conta.consultarSaldo());
        System.out.println("Saldo atual: R$" + conta.consultarSaldo());
        System.out.println("Saldo atual: R$" + conta.consultarSaldo()); 

        // Novo saque para verificar saldo
        conta.sacar(30.0); 
        System.out.println("Saldo final: R$" + conta.consultarSaldo()); 
    }
}

public class Transferencia implements Pagamento  {
    private double valor;

    @Override
    public void pagar(double valor) {
        System.out.println("Transferência bancária concluida de R$ "+valor+" !");
    }
}

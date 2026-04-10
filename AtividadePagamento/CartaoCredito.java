public class CartaoCredito implements Pagamento {
    private double valor;

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ "+valor+" realizado com cartão de crédito !");
    }
}

public class PIX implements Pagamento {
    private double valor;

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento concluido via PIX de R$ "+valor+" !");
    }
}

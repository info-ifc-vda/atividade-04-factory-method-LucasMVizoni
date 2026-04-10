public class CartaoDebitoFactory extends PagamentoFactory {
    @Override
    public Pagamento criarPagamento() {
        return new CartaoDebito();
    }
}

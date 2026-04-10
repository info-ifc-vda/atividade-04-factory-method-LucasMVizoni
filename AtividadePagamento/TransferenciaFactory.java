public class TransferenciaFactory extends PagamentoFactory {
    @Override
    public Pagamento criarPagamento() {
        return new Transferencia();
    }
}

public abstract class PagamentoFactory {

    public void procesarPagamento(double valor){
        Pagamento pagamento = criarPagamento();
        pagamento.pagar(valor);
    }

    public abstract Pagamento criarPagamento();
}

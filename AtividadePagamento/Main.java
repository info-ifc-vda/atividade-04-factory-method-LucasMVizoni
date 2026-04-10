import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       PagamentoFactory p1 = new BoletoFactory();
       p1.procesarPagamento(75.99);

       PagamentoFactory p2 = new CartaoCreditoFactory();
       p2.procesarPagamento(77.90);

       PagamentoFactory p3 = new CartaoDebitoFactory();
       p3.procesarPagamento(500.13);

       PagamentoFactory p4 = new PixFactory();
       p4.procesarPagamento(22.47);

       PagamentoFactory p5 = new TransferenciaFactory();
       p5.procesarPagamento(5.42);
    }
}
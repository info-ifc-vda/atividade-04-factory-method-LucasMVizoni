public class Boleto implements Pagamento {
   private Double valor;
   
   @Override
   public void pagar(double valor) {
       System.out.println("Boleto gerado no valor de R$ "+valor+" !");
   }
}

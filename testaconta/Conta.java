package testaconta;


public class Conta {
   private double saldo;
   private double limite = 500;
   private int numero;
   
   public void setSaldo(double saldo){
       this.saldo = saldo;
   }
   public double getSaldo(){
       return saldo;
   }
   
}

public class TesteReferencias {
  public static void main(String[] args) {
    Conta primeiraConta = new Conta();
    primeiraConta.saldo = 300;
    System.out.println("Primeira conta: " + primeiraConta.saldo);

    Conta segundaConta = primeiraConta;
    System.out.println("Segunda conta: " + segundaConta.saldo);
    segundaConta.saldo += 100;
    System.out.println("Segunda conta: " + segundaConta.saldo);

  }
}

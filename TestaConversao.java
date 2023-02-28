public class TestaConversao {
  public static void main(String[] args){
    double salario = 1270.9;
    /* Type casting - Para converter tipos */
    int valor = (int) salario;
    System.out.println(valor);

    /* Double não muito bom para salário (float tbm n) */
    double a = 0.2;
    double b = 0.1;
    double total = a + b;
    System.out.println(total);
  }
}

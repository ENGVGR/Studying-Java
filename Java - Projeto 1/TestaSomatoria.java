public class TestaSomatoria {
  public static void main(String[] args) {

    int contador = 1;
    int somatoria = 0;
    while (contador <= 10) {
        somatoria += contador;   
        contador++;
      }
    System.out.println(somatoria);
  }
}

public class TestaCondicional2 {
  public static void main(String[] args) {
    int idade = 16;
    int quantidadeDePessoas = 3;
    boolean acompanhado = true;
    boolean acompanhado2 = quantidadeDePessoas >= 2;

    if (idade >= 18 || quantidadeDePessoas >= 2 || (idade >= 18 && acompanhado)){
      System.out.println("Bem vindo!");
    } else {
      System.out.println("Infelizmente você não pode entrar");
    }
  }
}

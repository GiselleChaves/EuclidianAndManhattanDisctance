import java.util.Scanner;

public class Exercicio5 {
  /**
   * 5. Faça um programa que leia as coordenadas de 2 pontos no plano (x1, y1) e (x2, y2). 
   * A seguir, o programa deve calcular e escrever a distância euclidiana e também a distância 
   * de Manhattan entre esses pontos. Para isso, defina um método que calcula a distância 
   * euclidiana usando a fórmula:distanciae = (x1 − x2)2 + (y1 − y2)2. Defia também um método 
   * que calcula a distância de Manhattan pela fórmula: distanciam = |x1 − x2| + |y1 − y2|.
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
      double x1, x2, y1, y2, euclidianDistance=0.0, manhattanDistance=0.0;

      System.out.println("Informe os pontos x1, x2, y1, y2 respectivamente: ");
      x1 = in.nextDouble();
      x2 = in.nextDouble();
      y1 = in.nextDouble();
      y2 = in.nextDouble();

      euclidianDistance = euclidianDistance(x1, x2, y1, y2);
      manhattanDistance = manhattanDistance(x1, x2, y1, y2);
      System.out.printf("A distância Euclidina entre os pontos é: %.2f.", euclidianDistance);
      System.out.printf("\nA distância Manhattan entre os pontos é: %.2f.", manhattanDistance);
      System.out.println();
      System.out.printf("\n.::Fim da Execução::.");
      in.close();
    } 
    /*
     * return the Euclidian Distance.
     */
    public static double euclidianDistance(double value1, double value2,double value3, double value4){
      return (Math.sqrt(Math.pow((value1-value2),2) + Math.pow((value3 - value4),2)));
    }
    /*
     * return the Manhattan Distance.
     */
    public static double manhattanDistance(double value1, double value2,double value3, double value4){
      return (Math.abs(value1 - value2) + Math.abs(value3 - value4));
    }
  }


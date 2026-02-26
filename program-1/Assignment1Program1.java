import java.util.Scanner;

public class Assignment1Program1 {
  public static void main(String[] args) {
    initials();
    System.out.println("\nEnter a 5 Character String: \n");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    String trimmedinput = input.substring(1, input.length() - 1);
    StringBuilder reversed = new StringBuilder(trimmedinput).reverse();
    System.out.println("\nEnter The Temperature in Farenheit: \n");
    double tempF = scanner.nextDouble();
    double tempC = (tempF - 32) * 5 / 9;
    scanner.close();
    int result = random();
    System.out.println("\n" +tempC + reversed + result);
  }
  public static int random(){
    int min = 32;
    int max = 16384;
    int range = (max - min) + 1;
    int result = (int)(Math.random() * range) + min;
    return result;
  }
  public static void initials() {
    System.out.println("               A                BBBBBBBBBBBBBBBBB");
    System.out.println("              AAA               BB                B");
    System.out.println("             AAAAA              BB                 B");
    System.out.println("            AAAAAAA             BB                  B");
    System.out.println("           AAA   AAA            BB                  B");
    System.out.println("          AAA     AAA           BB                 B");
    System.out.println("         AAA       AAA          BB                B");
    System.out.println("        AAAAAAAAAAAAAAA         BBBBBBBBBBBBBBBBB");
    System.out.println("       AAAAAAAAAAAAAAAAA        BB                B");
    System.out.println("      AAAAAAAAAAAAAAAAAAA       BB                 B");
    System.out.println("     AAA               AAA      BB                  B");
    System.out.println("    AAA                 AAA     BB                  B");
    System.out.println("   AAA                   AAA    BB                 B");
    System.out.println("  AAA                     AAA   BB                B");
    System.out.println(" AAA                       AAA  BBBBBBBBBBBBBBBBB");
  }
}

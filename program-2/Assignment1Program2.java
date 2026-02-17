import java.util.Scanner;

public class Assignment1Program2 {
  public static void main(String[] args) {
    System.out.println("Base Conversion Program\r\n" + "");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a base (2 - 9): ");
    int base = scanner.nextInt();
    int max = switchBase(base);;
    System.out.println("The maximum, 4-digit, base 10 number in base " + base + " is " + max + "\r\n" + "");
    System.out.println("Now, enter a base 10 number in the range 0 to " + max + " to convert: \r\n" + "");
    int numToConvert = scanner.nextInt();
    System.out.println(convert(numToConvert, base));
    scanner.close();
  }
  public static int switchBase (int base) {
    int max = 0;
    max = (int) (Math.pow(base, 4) - 1);
    return max;
  }
  public static String convert (int numToConvert, int base) {
    int numConverted = 0;
    int remainder1 = 0;
    int remainder2 = 0;
    int remainder3 = 0;
    int remainder4 = 0;
    int quotient = numToConvert;
    for (int i = 0; i < 4; i++){
      if (i < 1){
        remainder1 = quotient % base;
        quotient = quotient / base;

      } else if (i == 1){
        remainder2 = quotient % base;
        quotient = quotient / base;

      } else if (i == 2){
        remainder3 = quotient % base;
        quotient = quotient / base;

      } else if (i == 3){
        remainder4 = quotient % base;

      } else {
        quotient = 123456789;
      }
    }
    numConverted = (remainder4 * 1000) + (remainder3 * 100) + (remainder2 * 10) + (remainder1 * 1);//edit

    return String.valueOf(numToConvert) + " in base " + base + " is " + String.valueOf(numConverted);
  }
}

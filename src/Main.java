import java.util.Random;

// Manuel Pereira Valecillos

public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {

    /*
     * I am thinking of doing a game for my project maybe a jeopardy game involving java language.
     */

    System.out.println("Hello Welcome to my game!");
    System.out.println(".........................");
    System.out.println("Do you want to play?"); // ask for input

    printDataInfo(); // a Call (if something in here then argument)

  }

  public static void printDataInfo() {// Ex of a header
    /*
     * the 8 Data types: Char 'm' Byte 8bit Short 16bit int 32bit numbers "1,2,3,4" long 64bit
     * 1361456413L float 4.0 double 5.6 use double more than float Boolean true or false
     */

    boolean boolNum1 = true;
    int intNum1 = 4;
    double doubNum1 = 4.5;

    String strNum1 = "you can do it!";
    System.out.println("Example of Boolean:" + boolNum1 + " or false");
    System.out.println("Example of Integer:" + intNum1);
    System.out.println("Example of String: " + strNum1);
    System.out.println("Example of double: " + doubNum1);
    intNum1++;
    intNum1--;
    intNum1 = intNum1 - 1;
    intNum1 = intNum1 / 1;
    intNum1 = intNum1 % 9;
    System.out.println(intNum1);
    System.out.println("She said Hello! \n to me.");
    int line = 1;
    while (line++ < 5) {
      System.out.println(line);
    }
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }
  } // end of Print Data info

  public static double globalVar(double Tax) {

    /*
     * When a variable is declared with final keyword, its value can�t be modified, essentially, a
     * constant.
     */
    final double SALESTAX = .15;
    return SALESTAX;
  }

  public static double castEx(double num) {
    // dataType variableName = (dataType)variableToConvert;
    // Changes a int to a double. Increase size of "box"
    // num is a parameter, and returns num2

    double num1 = 2.2;
    int num2 = (int) num1;
    System.out.println(num2);
    return num2;
  }

  public static void strClass() {
    // toString converts data types to string
    // .length gathers the length of the string 0-9
    // .toUpperCase grabs the string letters and caps
    double d = 24.6;
    String s = Double.toString(d);
    System.out.println(s);

    String str = "manny";
    System.out.println("length of String:" + str.length());
    System.out.println("upper String:" + str.toUpperCase());

  }

  public static Random randNum(int Random) {
    Random randomGen = new Random();
    // check next int value, you can do this as many times as you want
    // nextInt will return an int between 0 (inclusive) and the specified value (exclusive)
    System.out.println("Next int value: " + randomGen.nextInt(10000));
    return randomGen;
  }

  public static double calculateArea(double radius) {
    double rad = radius;
    return Math.PI * rad * rad;
  }

  /*
   * The start of the game list of choices very basic currently
   */
  public static double getPrize(double money) {
    double tier = 0;
    if (money >= 100) {
      tier = 1;
    } else if (money >= 100) {
      tier = 2;
    } else if (money >= 1000) {
      tier = 2;
    } else if (money >= 10000) {
      tier = 3;
    } else {
      tier = 0;
      System.out.println("you Lose the of game!");
    }

    System.out.println("tier = " + tier);
    return tier;
  }

  public static class SwitchDemo {
    public static void main(String[] args) {

      int month = 8;
      String monthString;
      switch (month) {
        case 1:
          monthString = "January";
          break;
        case 2:
          monthString = "February";
          break;
        case 3:
          monthString = "March";
          break;
        case 4:
          monthString = "April";
          break;
        case 5:
          monthString = "May";
          break;
        case 6:
          monthString = "June";
          break;
        case 7:
          monthString = "July";
          break;
        case 8:
          monthString = "August";
          break;
        case 9:
          monthString = "September";
          break;
        case 10:
          monthString = "October";
          break;
        case 11:
          monthString = "November";
          break;
        case 12:
          monthString = "December";
          break;
        default:
          monthString = "Invalid month";
          break;
      } // break makes it so it exits out of that singular case switch
      System.out.println(monthString);
    }
  }

  // compare stings

  /*
   * (Precedence order) When two operators share an operand the operator with the higher precedence
   * goes first. For example, 1 + 2 * 3 is treated as 1 + (2 * 3), whereas 1 * 2 + 3 is treated as
   * (1 * 2) + 3 since multiplication has a higher precedence than addition.
   */
  /*
   * Overload a method Describe inheritance and its benefits Develop code that makes use of
   * polymorphism Use super and this to access objects and constructors
   * 
   */
}

// Manuel Pereira Valecillos

public class Main {

  public static void main(String[] args) {
    
    /*
     * I am thinking of doing a game for my project maybe
     * a jeopardy game involving java language.
     */

    System.out.println("Hello Welcome to my game!");
    System.out.println(".........................");
    System.out.println("Do you want to play?");
    // ask for input
    printDataInfo();

  }

  public static void printDataInfo() {
    
    /*
     * the 8 Data types: Char 'm' 
     * Byte 8bit 
     * Short 16bit 
     * int 32bit numbers "1,2,3,4" 
     * long 64bit
     * 1361456413L 
     * float 4.0 double 5.6 use double more than float Boolean true or false
     */

    boolean boolNum1 = true;
    int intNum1 = 4;
    double doubNum1 = 4.5;

    String strNum1 = "you can do it!";
    System.out.println("Example of Boolean:" + boolNum1 + " or false");
    System.out.println("Example of Integer:" + intNum1);
    System.out.println("Example of String: " + strNum1);
    System.out.println("Example of double: " + doubNum1);
  } // end of Print Data info

  public static double globalVar(double Tax) {
    
    /*
     * When a variable is declared with final keyword, its value can’t be modified, 
     * essentially, a constant.
     */
    final double SALESTAX = .15;
    return SALESTAX;
  }

  public static double castEx(double num ) {
 // dataType variableName = (dataType)variableToConvert;
 // Changes a int to a double. Increase size of "box"
    
    double num1 = 2.2;
    int num2 = (int)num1;
    System.out.println(num2);
    return num2;
  }
  public static void strClass() {
    
    double d = 24.6;
    String s = Double.toString(d);
    System.out.println(s);
    
    String str= "manny";
    System.out.println("length of String:" + str.length());
    System.out.println("upper String:" + str.toUpperCase());
    
  }
}

class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    double totalMnMs = 55 * 10;
    double blueMnMs = totalMnMs * .24;
    double brownMnMs = totalMnMs * .13;
    double greenMnMs = totalMnMs * .16;
    double orangeMnMs = totalMnMs * .2;
    double redMnMs = totalMnMs * .13;
    double yellowMnMs = totalMnMs * .14; 
    System.out.println("blue: " + blueMnMs);
    System.out.println("brown: " + brownMnMs);
    System.out.println("green: " + greenMnMs);
    System.out.println("orange: " + orangeMnMs);
    System.out.println("red: " + redMnMs);
    System.out.println("yellow: " + yellowMnMs); 
    double sumMnMs = (blueMnMs + brownMnMs + greenMnMs + orangeMnMs + redMnMs + yellowMnMs);
    System.out.println("Sum: " + sumMnMs);
    if (blueMnMs > brownMnMs && greenMnMs > orangeMnMs)
    System.out.println("Blue over Brown and Green over Orange");
    if (brownMnMs <= redMnMs)
    System.out.println("Brown is less than or equal to Red");
    if (sumMnMs == totalMnMs)
    System.out.println("Numbers match");
  }
}
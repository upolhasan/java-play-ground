package upol.corejava;

public class ScratchPad {

  public static void main(String[] args) {
    String ssn = "123456789   abc";

    System.out.println(ssn.replaceAll("\\D", ""));
    System.out.println("".length());
  }

}

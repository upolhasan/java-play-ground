package upol.exception;

public class ThrowExceptionRunner {

  public static void main(String[] args) throws CurrencyMismatchException {
    Amount amount1 = new Amount("USD", 500);
    Amount amount2 = new Amount("EUR", 500);
    Amount amount3 = new Amount("USD", 400);
    Amount amount4 = new Amount("USD", 1600);
    amount1.add(amount3);
    try {
      amount1.subtract(amount4);
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println(amount1.checkIfMore(amount3));

    System.out.println(amount1);
  }


}

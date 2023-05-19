package upol.exception;

public class Amount {

  public Amount(String currency, int amount) {
    this.currency = currency;
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "Amount{" +
        "currency='" + currency + '\'' +
        ", amount=" + amount +
        '}';
  }

  public void add(Amount that) {
    if (this.currency != that.currency){
      throw new RuntimeException(" Currencies didn't match");
    }
    this.amount = this.amount + that.amount;
  }

  public void subtract(Amount that) throws Exception {
    if (this.amount < that.amount){
      throw new Exception("Too high of an amount to subtract");
    }
    this.amount = this.amount - that.amount;
  }

  public boolean checkIfMore(Amount that) throws CurrencyMismatchException {

    if ( this.currency != that.currency ){
      throw new CurrencyMismatchException("Currencies did not match: " + this.currency + " " + that.currency );
    }
    return that.amount > this.amount;
  }

  String currency;
  int amount;

}

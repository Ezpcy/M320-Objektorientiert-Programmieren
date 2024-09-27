package v3;

public class Portfolio {
  public StockExchange boerse;
  public double nvidia;
  public double microsoft;

  public Portfolio(StockExchange boerse) {
    this.boerse = boerse;
  }

  public void setPrice() {
    this.nvidia = this.boerse.getPrice("nvidia");
    this.microsoft = this.boerse.getPrice("microsoft");
  } 

  
}
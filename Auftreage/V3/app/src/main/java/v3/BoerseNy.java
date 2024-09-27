package v3; 

public class BoerseNy implements StockExchange{
  double nvidia = 117.87;
  double microsoft = 438.69;

  @Override
  public double getPrice(String aktie) {
    switch (aktie) {
      case "nvidia" -> {
        return this.nvidia;
      }
      case "microsoft" -> {
        return this.microsoft;
      }
      default -> throw new AssertionError();
    }
  }

}